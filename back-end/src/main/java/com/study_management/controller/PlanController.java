package com.study_management.controller;

import com.study_management.domain.WeeklyPlanDTO;
import com.study_management.service.PlanService;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Log4j
@Controller
@RequestMapping("/plan/*")
public class PlanController {

    private PlanService service;

    //이전에 작성된 플랜 불러오기
    @GetMapping("/plan/list")
    public void getPlans(Model model) {

        log.info("list");
        model.addAttribute("list", service.getList());
    }

    @PostMapping("/plan/write")
    // 새 플랜 작성 및 등록
    public String writingPlan(WeeklyPlanDTO weeklyPlan, RedirectAttributes rttr){
        log.info("plan:" + weeklyPlan );
        service.register(weeklyPlan);
        rttr.addFlashAttribute("result", weeklyPlan.getPlanID());
        return "redirect:/plan/list";
    }

    // 플랜 수정
    public String modify(WeeklyPlanDTO weeklyPlan, RedirectAttributes rttr) {
        log.info("modify:" + weeklyPlan);

        if (service.modify(weeklyPlan)) {
            rttr.addFlashAttribute("result","success");
        }
        return "redirect:/plan/list";
    }

    // 플랜 삭제
    public String remove(@RequestParam("planID")Long planID, RedirectAttributes rttr) {

        log.info("remove..." + planID);
        if (service.remove(planID)) {
            rttr.addFlashAttribute("result","success");
        }
        return "redirect:/plan/list";
    }

}
