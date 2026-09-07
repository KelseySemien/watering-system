package com.example.watering_system.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.watering_system.Model.SoilMoisture;

public interface SoilMoistureRepository extends JpaRepository<SoilMoisture, Long> {
}

