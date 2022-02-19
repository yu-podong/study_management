package com.study_management.mapper;

import com.study_management.domain.MonthlyPlanDTO;
import com.study_management.domain.WeeklyPlanDTO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PlanMapper {

    public List<WeeklyPlanDTO> getWeeklyList();
    public List<MonthlyPlanDTO> getMonthlyList();

    public void insertWeekly(WeeklyPlanDTO weeklyPlan);
    public void insertMonthly(MonthlyPlanDTO monthlyPlan);

    public WeeklyPlanDTO readWeekly(Long planID);
    public MonthlyPlanDTO readMonthly(Long planID);

    public int updateWeekly(WeeklyPlanDTO weeklyPlan);
    public int updateMonthly(MonthlyPlanDTO monthlyPlan);

    public int deleteWeekly(Long planID);
    public int deleteMonthly(Long planID);

}
