package com.berkay22demirel.jwtexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Long id;
    private String name;
    private String author;
    private Date publishDate;
}
