package com.study_management.domain;

public class StudyInfoDTO {
    private Integer studyID;
    private String studyName;
    private String simpleDesc;
    private String detail;
    private Integer recomGra;
    private Integer maxMem;
    private String time;
    private Boolean isGrant;
    private Boolean isQues1;
    private Boolean isQues2;
    private Boolean isQues3;
    private String addQues;
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
    public Boolean getGrant() {
        return isGrant;
    }
    public Boolean getQues1() {
        return isQues1;
    }
    public Boolean getQues2() {
        return isQues2;
    }
    public Boolean getQues3() {
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
    public void setGrant(Boolean grant) {
        isGrant = grant;
    }
    public void setMaxMem(Integer maxMem) {
        this.maxMem = maxMem;
    }
    public void setQues1(Boolean ques1) {
        isQues1 = ques1;
    }
    public void setQues2(Boolean ques2) {
        isQues2 = ques2;
    }
    public void setQues3(Boolean ques3) {
        isQues3 = ques3;
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