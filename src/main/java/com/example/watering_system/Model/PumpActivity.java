package com.example.watering_system.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PumpActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date timestamp;
    private boolean manuallyTriggered; // Track if the pump was manually turned on

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isManuallyTriggered() {
        return manuallyTriggered;
    }

    public void setManuallyTriggered(boolean manuallyTriggered) {
        this.manuallyTriggered = manuallyTriggered;
    }
}
