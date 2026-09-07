package com.example.watering_system.Service;


    


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.watering_system.Model.SoilMoisture;
import com.example.watering_system.Repository.SoilMoistureRepository;

import java.util.List;

@Service
public class SoilMoistureService {

    @Autowired
    private SoilMoistureRepository soilMoistureRepository;

    public List<SoilMoisture> getLast7DaysData() {
        // Implement logic to fetch last 7 days data
        return soilMoistureRepository.findAll(); // Placeholder
    }

    public void saveSoilMoistureData(SoilMoisture soilMoisture) {
        soilMoistureRepository.save(soilMoisture);
    }
}
