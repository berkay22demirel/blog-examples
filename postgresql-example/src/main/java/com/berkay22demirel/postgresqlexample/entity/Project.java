package com.berkay22demirel.postgresqlexample.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "project")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public class Project implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_project", allocationSize = 1)
    @GeneratedValue(generator = "seq_project", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @OneToMany
    @JoinColumn(name = "project_id")
    private List<Item> items;
}
