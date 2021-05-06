package com.berkay22demirel.postgresqlexample.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "item")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public class Item implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_item", allocationSize = 1)
    @GeneratedValue(generator = "seq_item", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 500, nullable = false)
    private String content;

    @Enumerated
    @Column(nullable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    public enum Status {
        TODO,
        IN_PROGRESS,
        DONE
    }
}
