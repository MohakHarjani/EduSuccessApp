package com.mohak.edusuccess.model;

import jakarta.persistence.OneToMany;

import java.util.*;

public class Teacher
{
    private Long teacherId;
    private String name;
    private String phoneNumber;
    private int experience;

    @OneToMany(mappedBy = "teacher")
    private List<Batch>batchList;
}
