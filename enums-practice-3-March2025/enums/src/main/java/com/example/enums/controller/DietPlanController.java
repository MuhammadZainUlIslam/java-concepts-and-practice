package com.example.enums.controller;

import com.example.enums.constant.WeekDay;
import com.example.enums.dto.DietPlanRequest;
import com.example.enums.entity.DietPlan;
import com.example.enums.service.DietPlanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diet")
public class DietPlanController {

    private final DietPlanService service;

    public DietPlanController(DietPlanService service) {
        this.service = service;
    }

    @PostMapping
    public DietPlan addDiet(@RequestBody DietPlanRequest request) {
        return service.addDietPlan(request);
    }

    @GetMapping("/{day}")
    public List<DietPlan> getByDay(@PathVariable WeekDay day) {
        return service.getByWeekDay(day);
    }
}