package com.example.temp.model;

import jakarta.persistence.*;


@Entity
public class Batch {

    @Id
    private Long batchId;

    private String name;


    @ManyToOne
    private Teacher teacher;
}
