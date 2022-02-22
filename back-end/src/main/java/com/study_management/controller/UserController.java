package com.study_management.controller;

import com.study_management.domain.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user/*")
public class UserController {

    private UserController userService;

    //회원 정보
    @RequestMapping("/info")
    public ModelAndView readUserInfo(@RequestParam String userID) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/user/info");
        mav.addObject("readUserInfo", userService.readUserInfo(userID));
        return mav;
    }

    // 정보 수정 페이지 이동
    @RequestMapping(value = "/info/modify", method = RequestMethod.GET)
    public ModelAndView getUpdateUserInfo(@RequestParam String userID) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/info/modify");
        mav.addObject("updateUserInfo", userService.readUserInfo(userID));
        return mav;
    }

    // 정보 수정
    @RequestMapping(value = "/info/modify", method = RequestMethod.POST)
    public String updateUserInfo(@ModelAttribute UserDTO userDTO) throws Exception {
        userService.updateUserInfo(userDTO);
        //log.info("Update User" + userDTO.getUserName() + "Info");
        return "redirect:/info/modify?id=" + userDTO.getUserID();
    }

}
