package com.berkay22demirel.graphqlexample.entity;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Team {

    private String name;
    private String country;
    private List<Player> playerList;
}
