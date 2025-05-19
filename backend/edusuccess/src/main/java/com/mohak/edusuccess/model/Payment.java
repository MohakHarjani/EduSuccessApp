package com.mohak.edusuccess.model;

import java.time.LocalDate;

public class Payment
{
    private Long paymentId;
    private double amountPaid;
    private LocalDate paymentDate;
    private String paymentMode;
    private String note;

    private Enrollment enrollment;
}
