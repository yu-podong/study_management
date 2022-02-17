package com.study_management.mapper;

import com.study_management.domain.MonthlyPlanDTO;
import com.study_management.domain.WeeklyPlanDTO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PlanMapper {


    public List<WeeklyPlanDTO> getList();

    public void insertWeekly(WeeklyPlanDTO weeklyPlan);

    public Integer insertSelectKeyWeekly(WeeklyPlanDTO weeklyPlan);

    public WeeklyPlanDTO read(Long planID);

    public int delete(Long planID);

    public int update(WeeklyPlanDTO weeklyPlan);





}
