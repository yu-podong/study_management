package com.study_management.service;

import com.study_management.domain.WeeklyPlanDTO;

import java.util.List;

public interface PlanService {

      public void register(WeeklyPlanDTO weeklyPlan);

      public WeeklyPlanDTO get(Long planID);

//      public boolean isCheck(WeeklyPlanDTO isCheck);

      public boolean modify(WeeklyPlanDTO weeklyPlan);

      public boolean remove(Long planID);

      public List<WeeklyPlanDTO> getList();

}
