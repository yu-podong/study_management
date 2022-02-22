package com.study_management.mapper;

import com.study_management.domain.UserDTO;

public interface UserMapper {

    public void updateUserInfo(UserDTO userDTO);
    public void readUserInfo(UserDTO userDTO);

}
