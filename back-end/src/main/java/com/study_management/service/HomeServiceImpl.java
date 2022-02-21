package com.study_management.service;

import com.study_management.DAO.UserDAO;
import com.study_management.domain.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

@Service
public class HomeServiceImpl implements HomeService {
    private final UserDAO userDAO;

    @Inject
    public HomeServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void register(UserDTO userDTO) throws Exception {

        userDTO.setUserID(userDTO.getUserID());
        userDTO.setPassword(userDTO.getPassword());
        userDTO.setAutho(userDTO.getAutho());
        userDTO.setGender(userDTO.getGender());
        userDTO.setGrade(userDTO.getGrade());
        userDTO.setState(userDTO.getState());
        userDTO.setUserNum(userDTO.getUserNum());
        userDTO.setDept(userDTO.getDept());
        userDTO.setUserEmail(userDTO.getUserEmail());
        userDTO.setUserName(userDTO.getUserName());
        userDTO.setUserTel(userDTO.getUserTel());

        userDAO.register(userDTO);

    }

    @Override
    public boolean login(UserDTO userDTO, HttpSession httpSession) throws Exception {
        userDAO.login(userDTO, httpSession);
        return false;
        //
    }

    @Override
    public void updateUserInfo(UserDTO userDTO) throws Exception {
        userDAO.modifyUserInfo(userDTO);
    }

    @Override
    public void updatePassword(String userID, String password) throws Exception {
        userDAO.modifyPassword(userID, password);
    }

    @Override
    public UserDTO readUserInfo(String userID) throws Exception {
        return userDAO.viewUserInfo(userID);

    }

}
