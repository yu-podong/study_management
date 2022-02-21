package com.study_management.service;

import com.study_management.domain.MonthlyPlanDTO;
import com.study_management.domain.WeeklyPlanDTO;

import java.util.List;

public interface PlanService {

      public void registerWeekly(WeeklyPlanDTO weeklyPlan);
      public void registerMonthly(MonthlyPlanDTO monthlyPlan);

      public WeeklyPlanDTO getWeekly(Long planID);
      public MonthlyPlanDTO getMonthly(Long planID);

//      public boolean isCheck(WeeklyPlanDTO isCheck);

      public boolean modifyWeekly(WeeklyPlanDTO weeklyPlan);
      public boolean modifyMonthly(MonthlyPlanDTO monthlyPlan);

      public boolean removeWeekly(Long planID);
      public boolean removeMonthly(Long planID);

      public List<WeeklyPlanDTO> getWeeklyList();
      public List<MonthlyPlanDTO> getMonthlyList();

}
