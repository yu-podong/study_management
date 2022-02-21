package com.study_management.service;

import com.study_management.domain.MonthlyPlanDTO;
import com.study_management.domain.WeeklyPlanDTO;
import com.study_management.mapper.PlanMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Log4j
@Service
@AllArgsConstructor

public class PlanServiceImpl implements PlanService{

    private PlanMapper mapper;

    @Override
    public void registerWeekly(WeeklyPlanDTO weeklyPlan) {

        log.info("writing plan......" + weeklyPlan);

        mapper.insertWeekly(weeklyPlan);
    }

    @Override
    public void registerMonthly(MonthlyPlanDTO monthlyPlan) {

        log.info("writing plan......" + monthlyPlan);

        mapper.insertMonthly(monthlyPlan);
    }

    @Override
    public WeeklyPlanDTO getWeekly(Long planID) {

        log.info("get......" + planID);

        return mapper.readWeekly(planID);
    }

    @Override
    public MonthlyPlanDTO getMonthly(Long planID) {

        log.info("get......" + planID);

        return mapper.readMonthly(planID);
    }

    @Override
    public boolean modifyWeekly(WeeklyPlanDTO weeklyPlan) {

        log.info("modify......" + weeklyPlan);

        return mapper.updateWeekly(weeklyPlan) == 1;
    }

    @Override
    public boolean modifyMonthly(MonthlyPlanDTO monthlyPlan) {

        log.info("modify......" + monthlyPlan);

        return mapper.updateMonthly(monthlyPlan) == 1;
    }

    @Override
    public boolean removeWeekly(Long planID) {

        log.info("remove...." + planID);

        return mapper.deleteWeekly(planID) == 1;
    }

    @Override
    public boolean removeMonthly(Long planID) {

        log.info("remove...." + planID);

        return mapper.deleteWeekly(planID) == 1;
    }

    @Override
    public List<WeeklyPlanDTO> getWeeklyList() {

        return mapper.getWeeklyList();
    }

    @Override
    public List<MonthlyPlanDTO> getMonthlyList() {

        return mapper.getMonthlyList();
    }
}


