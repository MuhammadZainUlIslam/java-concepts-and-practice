package com.example.enums.dto;

import com.example.enums.constant.WeekDay;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class DietPlanRequest {
    private WeekDay weekDay;
    private String meal;
    private String calories;
}
