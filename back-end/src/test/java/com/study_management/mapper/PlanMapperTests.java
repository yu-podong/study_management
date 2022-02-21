package com.study_management.controller;

import com.study_management.domain.WeeklyPlanDTO;
import com.study_management.mapper.PlanMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.stream.IntStream;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class PlanMapperTests {

    @Setter(onMethod_ = @Autowired)
    private PlanMapper mapper;

    @Test
    public void testGetList() {

        log.info("=================================");
        mapper.getList().forEach(weeklyPlan -> log.info(weeklyPlan)); // log가 뜨지 않음
        log.info("=================================");

    }

    @Test
    public void testInsertWeekly() {

        WeeklyPlanDTO weeklyPlan = new WeeklyPlanDTO();
        weeklyPlan.setPlanID(1111);
        weeklyPlan.setStudyID(1111);
        weeklyPlan.setContent("Test");
        weeklyPlan.setCheck(false);

        mapper.insertWeekly(weeklyPlan);
        log.info(weeklyPlan);
    }

    @Test
    public void testInsertSelectKeyWeekly() {

        WeeklyPlanDTO weeklyPlan = new WeeklyPlanDTO();
        weeklyPlan.setPlanID(5555);
        weeklyPlan.setStudyID(1111);
        weeklyPlan.setContent("selectKeyTest");
        weeklyPlan.setCheck(false);

        mapper.insertSelectKeyWeekly(weeklyPlan);
        log.info(weeklyPlan);
    }

    @Test
    public void testRead() {

        WeeklyPlanDTO weeklyPlan = mapper.read(1111L);

        log.info(weeklyPlan);
    }

    @Test
    public void testDelete() {

        log.info("DELETE COUNT: " + mapper.delete(1111L));
    }

    @Test
    public void testUpdate() {

        WeeklyPlanDTO weeklyPlan = new WeeklyPlanDTO();
        weeklyPlan.setPlanID(1111);
        weeklyPlan.setStudyID(1111);
        weeklyPlan.setContent("updateTest");
        weeklyPlan.setCheck(true);

        int count = mapper.update(weeklyPlan);
        log.info("UPDATE COUNT: " + count);
    }
}
