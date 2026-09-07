package com.example.watering_system.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;


@SuppressWarnings("unused")
@Entity
public class SoilMoisture {

    public SoilMoisture(Date date2, int i) {
        //TODO Auto-generated constructor stub
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @SuppressWarnings("unused")
    private Date date;
    @SuppressWarnings("unused")
    private int moistureLevel;
    @SuppressWarnings("unused")
    private boolean pumpOn; // Track if the pump was on
    // Getters and setters
}

