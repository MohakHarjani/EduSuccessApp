package com.mohak.edusuccess.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.*;


public class Batch {

    private Long batchId;
    private String batchName;
    private String subject;
    private LocalDate startDate;
    private Double fees;

    @ManyToOne
    @JoinColumn (name = "teacher_id")
    private Teacher teacher;

    @OneToMany (mappedBy = "batch")
    private List<Enrollment>enrollmentList;

    @OneToMany (mappedBy = "batch")
    private List<Test>testList;


}
