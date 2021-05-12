package com.berkay22demirel.rabbitmqexample.listener;

import com.berkay22demirel.rabbitmqexample.model.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

    @RabbitListener(queues = "#{queue.name}")
    public void handleMessageFromQueue(Message message) {
        System.out.println("Mesaj alındı..." + message.toString());
    }
}
