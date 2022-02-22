package com.study_management.DAO;

import com.study_management.domain.UserDTO;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpSession;

@Repository
public interface UserDAO {

    // 로그인 처리
    boolean login(UserDTO userDTO, HttpSession httpSession) throws Exception;

    // 회원가입 처리
    void register(UserDTO userDTO) throws Exception;

    // 회원정보 수정처리
    void updateUserInfo(UserDTO userDTO) throws Exception;

    // 회원정보 확인
    UserDTO readUserInfo(Integer userID) throws Exception;

    // 회원 비밀번호 변경
    void updatePassword(UserDTO userDTO) throws Exception;

    // 아이디 확인
    UserDAO idCheck(Integer UserID) throws Exception;

}