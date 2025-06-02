package com.mohak.edusuccess.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.*;

public class Enrollment {

    private Long enrollmentId;
    private String paymentPlan; // Monthly, Quarterly, Yearly, etc.
    private LocalDate enrollmentDate;
    private  Double pendingAmount;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn (name = "batch_id")
    private Batch batch;

    @OneToMany (mappedBy = "enrollment")
    private List<Payment> paymentList;


}
