package com.study_management.controller;

import com.study_management.domain.MonthlyPlanDTO;
import com.study_management.domain.PostDTO;
import com.study_management.domain.WeeklyPlanDTO;
import com.study_management.mapper.PlanMapper;
import com.study_management.service.PlanService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@Log4j
@Controller
@RequestMapping("/plan/*")
public class PlanController {

    @Autowired
    private PlanMapper PlanMapper;

    // http://localhost:8080/plan/weekly/list?studyID=
    @GetMapping(value = "weekly/list", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public List<WeeklyPlanDTO> getWeeklyPlan(@RequestParam("studyID") int studyID) {
        List<WeeklyPlanDTO> WeeklyPlanList = PlanMapper.WeeklyPlanDTOGet(studyID);
        log.info("====================list_"+studyID+"====================");
        return WeeklyPlanList;
    }

    // http://localhost:8080/plan/weekly/write
    @PostMapping(value = "weekly/write", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE})
    // 새 플랜 작성 및 등록
    public int writingWeeklyPlan(@RequestBody WeeklyPlanDTO weeklyPlan){
        log.info("WeeklyPlan Add");
        PlanMapper.insertWeekly(weeklyPlan);
        log.info("------------- ");
        return  1;
    }

    // http://localhost:8080/plan/weekly/modify
    @PostMapping(value = "weekly/modify", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE})
    // 플랜 수정
    public int modifyWeekly(@RequestBody WeeklyPlanDTO weeklyPlan) {
        log.info("WeeklyPlan Update");
        PlanMapper.updateWeekly(weeklyPlan);
        log.info("modify: " + weeklyPlan);
        log.info("------------- ");
        return 1;
    }

    // http://localhost:8080/plan/weekly/remove?planID=
    @PostMapping(value = "weekly/remove", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE})
    // 플랜 삭제
    public int removeWeekly(@RequestParam("planID") int planID) {

        log.info("WeeklyPlan Delete");
        PlanMapper.deleteWeekly(planID);
        log.info("remove..." + planID);
        log.info("------------- ");
        return 1;
    }

    // http://localhost:8080/plan/weekly/is-check
    @PostMapping(value = "weekly/is-check", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE})
    // 플랜 체크
    public int isCheckWeekly(@RequestBody WeeklyPlanDTO weeklyPlan) {

        log.info("Plan Check");
        PlanMapper.isCheckWeekly(weeklyPlan);
        log.info(weeklyPlan);
        log.info("------------- ");
        return 1;
    }

    // http://localhost:8080/plan/monthly/list?studyID=
    @GetMapping(value = "monthly/list", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public List<MonthlyPlanDTO> getMonthlyPlans(@RequestParam("studyID") int studyID) {
        List<MonthlyPlanDTO> MonthlyPlanList = PlanMapper.MonthlyPlanDTOGet(studyID);
        log.info("====================list_"+studyID+"====================");
        return MonthlyPlanList;
    }

    // http://localhost:8080/plan/monthly/write
    @PostMapping(value = "monthly/write", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE})
    // 새 플랜 작성 및 등록
    public int writingMonthlyPlan(@RequestBody MonthlyPlanDTO monthlyPlan){
        log.info("monthlyPlan Add");
        PlanMapper.insertMonthly(monthlyPlan);
        log.info("------------- ");
        return  1;
    }

    // http://localhost:8080/plan/monthly/modify
    @PostMapping(value = "monthly/modify", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE})
    // 플랜 수정
    public int modifyMonthly(@RequestBody MonthlyPlanDTO monthlyPlan) {
        log.info("monthlyPlan Update");
        PlanMapper.updateMonthly(monthlyPlan);
        log.info("modify: " + monthlyPlan);
        log.info("------------- ");
        return 1;
    }

    // http://localhost:8080/plan/monthly/remove?planID=
    @PostMapping(value = "monthly/remove", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE})
    // 플랜 삭제
    public int removeMonthly(@RequestParam("planID") int planID) {

        log.info("monthlyPlan Delete");
        PlanMapper.deleteMonthly(planID);
        log.info("remove..." + planID);
        log.info("------------- ");
        return 1;
    }

    // http://localhost:8080/plan/monthly/is-check
    @PostMapping(value = "monthly/is-check", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE})
    // 플랜 체크
    public int isCheckMonthly(@RequestBody MonthlyPlanDTO monthlyPlan) {

        log.info("monthlyPlan Check");
        PlanMapper.isCheckMonthly(monthlyPlan);
        log.info(monthlyPlan);
        log.info("------------- ");
        return 1;
    }
}
