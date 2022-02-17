package com.study_management.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudyDTO {
    private Integer studyID;
    private String studyName;
    private String simpleDesc;
    private String detail;
    private Integer recomGra;
    private Integer maxMem;
    private String time;
    private boolean isGrant;
    private boolean isQues1;
    private boolean isQues2;
    private boolean isQues3;
    private String addQues; // 제거
    private Integer countQues;

    // Constructure


    // Getter
    public Integer getStudyID() {
        return studyID;
    }
    public Integer getCountQues() {
        return countQues;
    }
    public Integer getMaxMem() {
        return maxMem;
    }
    public Integer getRecomGra() {
        return recomGra;
    }
    public String getAddQues() {
        return addQues;
    }
    public String getDetail() {
        return detail;
    }
    public String getSimpleDesc() {
        return simpleDesc;
    }
    public String getStudyName() {
        return studyName;
    }
    public String getTime() {
        return time;
    }
    public boolean getGrant() {
        return isGrant;
    }
    public boolean getQues1() {
        return isQues1;
    }
    public boolean getQues2() {
        return isQues2;
    }
    public boolean getQues3() {
        return isQues3;
    }

    // Setter
    public void setStudyID(Integer studyID) {
        this.studyID = studyID;
    }
    public void setAddQues(String addQues) {
        this.addQues = addQues;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public void setCountQues(Integer countQues) {
        this.countQues = countQues;
    }
    public void setIsGrant(boolean grant) {
        this.isGrant = grant;
    }
    public void setMaxMem(Integer maxMem) {
        this.maxMem = maxMem;
    }
    public void setIsQues1(boolean ques1) {
        this.isQues1 = ques1;
    }
    public void setIsQues2(boolean ques2) {
        this.isQues2 = ques2;
    }
    public void setIsQues3(boolean ques3) {
        this.isQues3 = ques3;
    }
    public void setRecomGra(Integer recomGra) {
        this.recomGra = recomGra;
    }
    public void setSimpleDesc(String simpleDesc) {
        this.simpleDesc = simpleDesc;
    }
    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }
    public void setTime(String time) {
        this.time = time;
    }
}