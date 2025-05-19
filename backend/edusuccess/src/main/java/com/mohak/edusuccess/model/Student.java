package com.mohak.edusuccess.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.*;


@Entity
public class Student
{
    @Id
    private Long studentId;
    private String name;
    private String email;
    private String schoolName;
    private LocalDate joiningDate;
    private String phoneNumber;
    private String address;

    @OneToMany (mappedBy = "student")
    private List<Enrollment> enrollmentList;

    @OneToMany (mappedBy = "student")
    private List<TestResult> testResultList;

}
