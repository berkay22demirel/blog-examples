package com.berkay22demirel.graphqlexample.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Score {

    private Integer home;
    private Integer away;
}
