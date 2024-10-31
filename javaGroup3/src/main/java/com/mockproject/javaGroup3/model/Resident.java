package com.mockproject.javaGroup3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Resident {
    @Id
    @Column(name = "resident_id", nullable = false)
    private Integer id;

    @Column(name = "firstname", length = 100)
    private String firstname;

    @Column(name = "lastname", length = 100)
    private String lastname;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "SSN", length = 20)
    private String ssn;

    @Column(name = "status", length = 50)
    private String status;

    @Column(name = "password")
    private String password;

    @Column(name = "delflag")
    private Boolean delflag;

}