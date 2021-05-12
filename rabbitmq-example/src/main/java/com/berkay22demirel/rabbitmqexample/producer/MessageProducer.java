package com.berkay22demirel.rabbitmqexample.producer;

import com.berkay22demirel.rabbitmqexample.model.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class MessageProducer {

    @Value("${rabbitmq.example.rabbitmq.routing.key}")
    private String routingKey;

    @Value("${rabbitmq.example.rabbitmq.exchange.name}")
    private String exchangeName;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostConstruct
    public void init() throws InterruptedException {
        Message message = new Message(1l, new Date(), "İlk mesaj");
        addMessageToQueue(message);
    }

    public void addMessageToQueue(Message message) {
        System.out.println("Mesaj kuyruğa eklendi... - " + message.getContent());
        rabbitTemplate.convertAndSend(exchangeName, routingKey, message);
    }
}
