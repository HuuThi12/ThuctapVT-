package com.mockproject.javaGroup3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "Apartments")
public class Apartment {
    @Id
    @Column(name = "apartment_id", nullable = false)
    private Integer id;

    @Column(name = "num_of_bedroom")
    private Integer numOfBedroom;

    @Column(name = "num_of_bathroom")
    private Integer numOfBathroom;

    @Column(name = "area")
    private Double area;

    @Column(name = "direction", length = 50)
    private String direction;

    @Column(name = "rentfee", columnDefinition = "money")
    private BigDecimal rentfee;

    @Column(name = "discount")
    private Double discount;

    @Column(name = "description")
    private String description;

    @Column(name = "status", length = 50)
    private String status;

    @Column(name = "delflag")
    private Boolean delflag;

}