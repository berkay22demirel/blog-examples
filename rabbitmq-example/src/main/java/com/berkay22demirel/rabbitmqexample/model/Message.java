package com.berkay22demirel.rabbitmqexample.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message implements Serializable {

    private Long id;
    private Date sendDate;
    private String content;

}
