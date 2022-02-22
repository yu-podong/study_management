package com.study_management.controller;

import com.study_management.domain.UserDTO;
import com.study_management.service.HomeService;
import com.study_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/home/*")
public class HomeController {
    @Autowired
    private HomeService homeService;

    @Inject
    public HomeController(UserService userService) {
        this.homeService = homeService;
    }

    // 회원가입 페이지로 이동 get
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getRegister() throws Exception {
        //log.info("get register");
        return "/home/register";
    }

    // 회원가입 버튼 post
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute UserDTO userDTO) throws Exception {
        //log.info("post register");
        homeService.register(userDTO);
        return "redirect:/home/login";
    }

    // 로그인 페이지로 이동 get
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin() throws Exception {
        return "/home/login";
    }

    //로그인 버튼 post
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute UserDTO userDTO, HttpSession httpSession) throws Exception {
        boolean result = homeService.login(userDTO, httpSession);
        ModelAndView mav = new ModelAndView();
        if (result == true) {
            mav.setViewName("redirect:/study/mainpage");
        } else {
            mav.setViewName("/home/login");
        }
        return mav;
    }

    //로그아웃 버튼
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) throws Exception {
        homeService.logout(session);
        return "redirect:/home/login";
    }

    //임시 비밀번호 받기로 이동 get
    //비밀번호 찾기로 이동 get
    @RequestMapping(value = "/findpassword", method = RequestMethod.GET)
    public void getFindPassword() throws Exception{
    }

    @RequestMapping(value = "/findpassword", method = RequestMethod.POST)
    public void findPassword(@ModelAttribute UserDTO user, HttpServletResponse response) throws Exception{
        homeService.findPassword(response, user);
    }

    // 비밀번호 찾기
//    @RequestMapping("/updatepassword")
//    public ModelAndView updatePassword(@ModelAttribute UserDTO userDTO) throws Exception {
//        ModelAndView mav = new ModelAndView();
//        String pw = homeService.updatePassword(userDTO);
//        mav.setViewName("/home/updatepassword");
//        mav.addObject("updatepassword", pw);
//        return mav;
//    }
}



