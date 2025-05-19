package com.example.temp.model;

import jakarta.persistence.*;


@Entity
public class Batch {

    @Id
    private Long batchId;

    private String name;

//    @Column(name = "ticher")
    @ManyToOne
    private Teacher teacher;
}
