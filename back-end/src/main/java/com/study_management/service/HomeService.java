package com.study_management.service;

import com.study_management.domain.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public interface HomeService {
    //회원가입
    public void register(UserDTO userDTO) throws Exception;
    //로그인
    public boolean login(UserDTO userDTO, HttpSession httpSession) throws Exception;
    //회원정보수정
    public void updateUserInfo(UserDTO userDTO) throws Exception;
    //비밀번호변경
    public void updatePassword(String userID, String password) throws Exception;
    //회원정보확인
    public UserDTO readUserInfo(String userID) throws Exception;
}
