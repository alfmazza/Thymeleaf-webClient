package com.sa.fe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Properties {
    
    Long properId;
    double copay;
    private int medicalGuide;
    private int internation;
    private int doctorToHome;
    private String odontology;
    private String orthodontics;
    private double refund;
}
