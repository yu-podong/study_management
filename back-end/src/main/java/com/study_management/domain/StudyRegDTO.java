package com.study_management.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oracle.sql.DATE;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudyRegDTO {
    private Integer regID;
    private Integer userID;
    private Integer studyID;
    private String ans1;
    private String ans2;
    private String ans3;

    // Constructure


    // Getter
    public Integer getStudyID() {
        return studyID;
    }
    public Integer getUserID() {
        return userID;
    }
    public Integer getRegID() {
        return regID;
    }
    public String getAns1() {
        return ans1;
    }
    public String getAns2() {
        return ans2;
    }
    public String getAns3() {
        return ans3;
    }

    // Setter
    public void setStudyID(Integer studyID) {
        this.studyID = studyID;
    }
    public void setUserID(Integer userID) {
        this.userID = userID;
    }
    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }
    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }
    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }
    public void setRegID(Integer regID) {
        this.regID = regID;
    }
}