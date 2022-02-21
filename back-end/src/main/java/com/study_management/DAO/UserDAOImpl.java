package com.study_management.DAO;

import com.study_management.domain.UserDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    @Inject
    SqlSession sql;

    private static final String namespace="com.study_management.mapper.HomeMapper";

    @Override
    public void register(UserDTO userDTO) throws Exception {
        sql.insert(namespace + ".register", userDTO);
    }

    @Override
    public boolean login(UserDTO userDTO, HttpSession httpSession) throws Exception {
        String name = sql.selectOne(namespace + ".userLogin", userDTO);
        return (name == null) ? false : true;
        //return name != null;
    }

    @Override
    public void modifyUserInfo(UserDTO userDTO) throws Exception {
        sql.update(namespace + ".userEdit", userDTO);
    }

    @Override
    public void modifyPassword(String userID, String password) throws Exception {
        sql.update(namespace + ".modifyPassword", password);
    }

    @Override
    public UserDTO viewUserInfo(String userID) throws Exception {
        return sql.selectOne(namespace + ".viewUserInfo", userID);
    }

}
