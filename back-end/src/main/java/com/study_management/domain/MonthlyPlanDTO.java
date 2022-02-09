package com.study_management.domain;

public class MonthlyPlanDTO {
    private Integer planID;
    private Integer studyID;
    private String content;
    private Boolean isCheck;

    // Constructure


    // Getter
    public String getContent() {
        return content;
    }
    public Integer getPlanID() {
        return planID;
    }
    public Integer getStudyID() {
        return studyID;
    }
    public Boolean getIsCheck() {
        return this.isCheck;
    }

    // Setter
    public void setContent(String content) {
        this.content = content;
    }
    public void setCheck(boolean check) {
        isCheck = check;
    }
    public void setPlanID(Integer planID) {
        this.planID = planID;
    }
    public void setStudyID(Integer studyID) {
        this.studyID = studyID;
    }
}