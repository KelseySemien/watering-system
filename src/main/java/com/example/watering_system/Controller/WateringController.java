package com.example.watering_system.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.watering_system.Model.PumpActivity;
import com.example.watering_system.Repository.PumpActivityRepository;

import java.util.Date;
import java.util.List;
import java.util.Calendar;

@Controller
public class WateringController {

    @Autowired
    private PumpActivityRepository pumpActivityRepository;

    @GetMapping("/")
    public String index(Model model) {
        // Add attributes for date, time, location, and temperature
        model.addAttribute("currentTime", System.currentTimeMillis());
        model.addAttribute("currentDate", new java.util.Date());
        model.addAttribute("location", "User Location");
        model.addAttribute("temperature", "Current Temperature");

        // Simulate soil moisture level
        model.addAttribute("soilMoisture", getSoilMoistureLevel());

        return "index";
    }

    @PostMapping("/water")
    public String water(RedirectAttributes redirectAttributes) {
        // Logic to activate watering system
        activateWateringSystem(true);
        redirectAttributes.addFlashAttribute("message", "Watering system activated!");
        return "redirect:/";
    }

    @GetMapping("/manage-water")
    public String manageWater(Model model) {
        // Add data to the model to display on the manage water page
        // This should include pump activity data for the past 7 days
        Calendar calendar = Calendar.getInstance();
        Date endDate = calendar.getTime();
        calendar.add(Calendar.DAY_OF_MONTH, -7);
        Date startDate = calendar.getTime();
        List<PumpActivity> activities = pumpActivityRepository.findByTimestampBetween(startDate, endDate);
        model.addAttribute("pumpActivities", activities);
        return "manage";
    }

    private int getSoilMoistureLevel() {
        // Replace with actual sensor data fetching logic
        return 50; // Placeholder value
    }

    private void activateWateringSystem(boolean manuallyTriggered) {
        // Replace with actual logic to activate watering system
        PumpActivity activity = new PumpActivity();
        activity.setTimestamp(new Date());
        activity.setManuallyTriggered(manuallyTriggered);
        pumpActivityRepository.save(activity);
    }
}


