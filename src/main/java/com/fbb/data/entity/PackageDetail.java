package com.fbb.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PackageDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String packageCreation;
    private String packageName;
    private String cat;
    private double speed;
    private String speedUnit;
    private String plan;
    private String chargeName;
    private String packageType;
    private double chargeAmount;
    private String currency;
    private String chargeCycle;
    private String chargeType;
    private double percent;
    private double taxAmount;
    private double totalAmount;
    private String bandwidthRange;
}
