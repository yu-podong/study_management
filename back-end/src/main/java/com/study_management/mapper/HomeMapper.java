package com.study_management.mapper;

import com.study_management.domain.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import javax.servlet.http.HttpSession;

@Mapper
public interface HomeMapper {

    public void register(UserDTO userDTO);
    public void login(UserDTO userDTO, HttpSession httpSession);
    //public void updatePassword(UserDTO userDTO);

}
