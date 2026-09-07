package com.example.watering_system.Repository;

import com.example.watering_system.Model.PumpActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Date;

public interface PumpActivityRepository extends JpaRepository<PumpActivity, Long> {
    List<PumpActivity> findByTimestampBetween(Date startDate, Date endDate);
}
