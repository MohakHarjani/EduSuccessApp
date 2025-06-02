package com.mohak.edusuccess.model;

import jakarta.persistence.*;

public class TestResult {

    private Long testResultId;
    private double marks;
    private String remarks;

    @ManyToOne
    @JoinColumn (name = "test_id")
    private Test test;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
