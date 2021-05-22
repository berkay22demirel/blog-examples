package com.berkay22demirel.graphqlexample.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Player {

    private String name;
    private Integer age;
    private Integer height;
    private Integer weight;
}
