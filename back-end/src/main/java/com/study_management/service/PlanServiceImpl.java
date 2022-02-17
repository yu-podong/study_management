package com.study_management.service;

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
    public void register(WeeklyPlanDTO weeklyPlan) {

        log.info("writing plan......" + weeklyPlan);

        mapper.insertSelectKeyWeekly(weeklyPlan);
    }

    @Override
    public WeeklyPlanDTO get(Long planID) {

        log.info("get......" + planID);

        return mapper.read(planID);
    }

    @Override
    public boolean modify(WeeklyPlanDTO weeklyPlan) {

        log.info("modify......" + weeklyPlan);

        return mapper.update(weeklyPlan) == 1;
    }

    @Override
    public boolean remove(Long planID) {

        log.info("remove...." + planID);

        return mapper.delete(planID) == 1;
    }

    @Override
    public List<WeeklyPlanDTO> getList() {

        return mapper.getList();
    }
}


