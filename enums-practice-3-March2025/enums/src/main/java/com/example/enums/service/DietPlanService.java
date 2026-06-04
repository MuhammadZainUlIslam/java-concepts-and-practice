package com.example.enums.service;

import com.example.enums.constant.WeekDay;
import com.example.enums.dto.DietPlanRequest;
import com.example.enums.entity.DietPlan;

import java.util.List;

public interface DietPlanService {

    DietPlan addDietPlan(DietPlanRequest request);
    List<DietPlan> getByWeekDay(WeekDay weekDay);
}
