package com.example.enums.service;

import com.example.enums.constant.WeekDay;
import com.example.enums.dto.DietPlanRequest;
import com.example.enums.entity.DietPlan;
import com.example.enums.repository.DietPlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class DietPlanServiceImpl implements DietPlanService {

    private final DietPlanRepository repository;


    @Override
    public DietPlan addDietPlan(DietPlanRequest request) {
        DietPlan plan = new DietPlan();
        plan.setWeekDay(request.getWeekDay());
        plan.setMeal(request.getMeal());
        plan.setCalories(request.getCalories());

        return repository.save(plan);
    }

    @Override
    public List<DietPlan> getByWeekDay(WeekDay weekDay) {
        return repository.getByWeekDay(weekDay);
    }

//    @Override
//    public List<DietPlan> getByWeekDay(WeekDay weekDay) {
//        return repository.findByWeekDays(weekDay);
//    }
}