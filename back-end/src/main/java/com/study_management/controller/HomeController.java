package com.study_management.controller;

import com.study_management.domain.UserDTO;
import com.study_management.service.HomeService;
import com.study_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/*")
public class HomeController {
    @Autowired
    private HomeService homeService;

    @Inject
    public HomeController(UserService userService) {
        this.homeService = homeService;
    }

    @GetMapping("/hello")
    public List<String> Hello() {
        return Arrays.asList("서버포트 8080","리액트포트 3000");
    }


    // 회원가입 페이지로 이동 get
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getRegister() throws Exception {
        //log.info("get register");
        return "/register";
    }

    // 회원가입 버튼 post
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute UserDTO userDTO) throws Exception {
        //log.info("post register");
        homeService.register(userDTO);
        return "redirect:/";
    }

    // 로그인 페이지로 이동 get
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getLogin() throws Exception {
        return "/";
    }

    //로그인 버튼 post
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute UserDTO userDTO, HttpSession httpSession) throws Exception {
        boolean result = homeService.login(userDTO, httpSession);
        ModelAndView mav = new ModelAndView();
        if (result == true) {
            mav.setViewName("redirect:/study/list");
        } else {
            mav.setViewName("/");
        }
        return mav;
    }

    //로그아웃 버튼
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) throws Exception {
        //homeService.logout(session);
        session.invalidate();
        return "redirect:/";
    }

    //임시 비밀번호 받기로 이동 get
    //비밀번호 찾기로 이동 get
    @RequestMapping(value = "/findpassword", method = RequestMethod.GET)
    public void getFindPassword() throws Exception{
    }

    // 비밀번호 메일 발송
    // 비밀번호 찾기로 이동 - 이름 학번 이메일 입력 - 이메일로 비밀번호 받기
    @RequestMapping(value = "/findpassword", method = RequestMethod.POST)
    public void findPassword(@ModelAttribute UserDTO userDTO, String div) throws Exception{
        homeService.sendEmail(userDTO, div);
    }
}



