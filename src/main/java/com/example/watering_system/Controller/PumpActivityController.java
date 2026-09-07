package com.example.watering_system.Controller;

import com.example.watering_system.Model.PumpActivity;
import com.example.watering_system.Repository.PumpActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class PumpActivityController {

    @Autowired
    private PumpActivityRepository pumpActivityRepository;

    @GetMapping("/api/pump-activities")
    public List<PumpActivity> getPumpActivities() {
        Calendar calendar = Calendar.getInstance();
        Date endDate = calendar.getTime();
        calendar.add(Calendar.DAY_OF_MONTH, -7);
        Date startDate = calendar.getTime();
        return pumpActivityRepository.findByTimestampBetween(startDate, endDate);
    }
}
