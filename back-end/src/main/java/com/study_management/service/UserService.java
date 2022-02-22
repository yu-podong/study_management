package com.study_management.service;

import com.study_management.domain.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    //회원정보수정
    public void updateUserInfo(UserDTO userDTO) throws Exception;
    //회원정보확인
    public UserDTO readUserInfo(Integer userID) throws Exception;

}
