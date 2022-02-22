package com.study_management.mapper;

import com.study_management.domain.MonthlyPlanDTO;
import com.study_management.domain.WeeklyPlanDTO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PlanMapper {

    public List<WeeklyPlanDTO> WeeklyPlanDTOGet(int studyID);
    public List<MonthlyPlanDTO> MonthlyPlanDTOGet(int studyID);

    public void insertWeekly(WeeklyPlanDTO weeklyPlan);
    public void insertMonthly(MonthlyPlanDTO monthlyPlan);

    public void updateWeekly(WeeklyPlanDTO weeklyPlan);
    public void updateMonthly(MonthlyPlanDTO monthlyPlan);

    public void deleteWeekly(int planID);
    public void deleteMonthly(int planID);

    public void isCheckWeekly(WeeklyPlanDTO weeklyPlan);
    public void isCheckMonthly(MonthlyPlanDTO monthlyPlan);

}
