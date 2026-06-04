package com.example.enums.repository;


import com.example.enums.constant.WeekDay;
import com.example.enums.entity.DietPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DietPlanRepository extends JpaRepository<DietPlan, Long> {
     List<DietPlan> getByWeekDay(WeekDay weekDay);
}
