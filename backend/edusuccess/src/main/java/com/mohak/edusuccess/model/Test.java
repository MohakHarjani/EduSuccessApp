package com.mohak.edusuccess.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.*;

public class Test {
    private Long testId;
    private String name;
    private LocalDate testDate;
    private double maxMarks;
    private String subject;
    private String testUrl;

    @ManyToMany
    @JoinTable
    (
     name = "batch_test",
     joinColumns = @JoinColumn(name = "test_id"),
     inverseJoinColumns = @JoinColumn(name = "batch_id")
    )
    private List<Batch>batchList;

    @OneToMany (mappedBy = "test")
    private List<TestResult> testResultList;

}
