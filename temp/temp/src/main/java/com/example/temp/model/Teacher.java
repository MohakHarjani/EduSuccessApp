package com.example.temp.model;


import jakarta.persistence.*;
import java.util.*;

@Entity
public class Teacher
{
    @Id
    private Long teacherId;

    private String name;

    @OneToMany(mappedBy = "teacher")
    private List<Batch> batchList;

}
