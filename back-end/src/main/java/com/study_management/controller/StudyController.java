package com.study_management.controller;

import com.study_management.domain.StudyDTO;
import com.study_management.service.StudyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/study/*")
@AllArgsConstructor
public class StudyController {
    private StudyService service;

    @GetMapping("/list")
    public void list(Model model) {
        // 등록된 스터디의 정보를 가져옴
        model.addAttribute("studyList", service.getList());
    }

    @PostMapping("/create")
    public void create(Model model, StudyDTO studyInfo) {
        // form에 입력된 내용을 저장
        studyInfo = new StudyDTO();

        service.create(studyInfo);
    }

    @PostMapping("/apply")
    public void apply() {
        // form에 입력된 내용을 저장 (studyID,
    }

    @GetMapping("/mainpage")
    public void mainPage() {
        // 선택된 스터디의 ID를 받아서
        // 해당 스터디의 정보를 가져옴
        // 정보를 페이지에 보여줌
    }

    @GetMapping("/member/list")
    public void memberList() {
        // 해당 스터티의 ID 가져옴
        // 관련 테이블의 정보를 가져와서, 해당하는 곳에 반환
    }

    @PostMapping("/is-register")
    public void isRegister() {

    }

    @PostMapping("/modify/autho")
    public void modifyAutho() {

    }
}