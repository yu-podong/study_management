package com.study_management.service;

import com.study_management.DAO.UserDAO;
import com.study_management.domain.UserDTO;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Service
public interface HomeService {

    // 회원가입
    public void register(UserDTO userDTO) throws Exception;
    // 로그인
    public boolean login(UserDTO userDTO, HttpSession httpSession) throws Exception;
    // 비밀번호 이메일 발송
    public void sendEmail(UserDTO userDTO, String div) throws Exception;
    // 새 비밀번호 발급
    public void findPassword(HttpServletResponse resp, UserDTO userDTO) throws Exception;
    //public void updatePassword(String userID, String password)(UserDTO userDTO) throws Exception;
    // 로그아웃
    public void logout(HttpSession session)throws Exception;
    // 아이디중복확인
    public UserDAO idCheck(Integer UserID) throws Exception;

}
