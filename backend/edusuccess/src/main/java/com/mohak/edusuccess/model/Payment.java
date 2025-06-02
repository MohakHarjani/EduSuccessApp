package com.mohak.edusuccess.model;

import jakarta.persistence.*;

import java.time.LocalDate;

public class Payment
{
    private Long paymentId;
    private double amountPaid;
    private LocalDate paymentDate;
    private String paymentMode;
    private String note;

    @ManyToOne
    @JoinColumn (name = "enrollment_id")
    private Enrollment enrollment;
}
