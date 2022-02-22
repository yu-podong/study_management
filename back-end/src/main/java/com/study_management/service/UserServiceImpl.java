package com.study_management.service;

import com.study_management.DAO.UserDAO;
import com.study_management.domain.UserDTO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class UserServiceImpl implements UserService{
    private final UserDAO userDAO;

    @Inject
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    // 회원정보수정
    @Override
    public void updateUserInfo(UserDTO userDTO) throws Exception {
        userDAO.updateUserInfo(userDTO);
    }
    // 회원정보확인
    @Override
    public UserDTO readUserInfo(Integer userID) throws Exception {
        return userDAO.readUserInfo(userID);

    }

}
