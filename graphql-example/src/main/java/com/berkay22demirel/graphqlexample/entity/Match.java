package com.berkay22demirel.graphqlexample.entity;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Match {

    private Team home;
    private Team away;
    private Score score;
    private Date date;
    private String organization;
}
