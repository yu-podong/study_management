package com.study_management.domain;

public class UserDTO {
    private Integer userID;
    private String userName;
    private Integer gender ;
    private String userTel;
    private String userEmail;
    private Integer userNum;
    private String password;
    private Integer grade;
    private Integer state;
    private String dept;
    private Integer autho;

    // Constructure

    // Getter
    public Integer getUserID() {
        return userID;
    }
    public String getPassword() {
        return password;
    }
    public Integer getAutho() {
        return autho;
    }
    public Integer getGender() {
        return gender;
    }
    public Integer getGrade() {
        return grade;
    }
    public Integer getState() {
        return state;
    }
    public Integer getUserNum() {
        return userNum;
    }
    public String getDept() {
        return dept;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public String getUserName() {
        return userName;
    }
    public String getUserTel() {
        return userTel;
    }

    // Setter
    public void setUserID(Integer userID) {
        this.userID = userID;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAutho(Integer autho) {
        this.autho = autho;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setGender(Integer gender) {
        this.gender = gender;
    }
    public void setGrade(Integer grade) {
        this.grade = grade;
    }
    public void setState(Integer state) {
        this.state = state;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }
    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }
}