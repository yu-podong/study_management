package com.study_management.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeeklyPlanDTO {
    private Integer planID;
    private Integer studyID;
    private String content;
    private Boolean isCheck;

    // Constructure


    // Getter
    public Integer getStudyID() {
        return studyID;
    }
    public String getContent() {
        return content;
    }
    public Integer getPlanID() {
        return planID;
    }
    public Boolean getCheck() {
        return isCheck;
    }

    // Setter
    public void setStudyID(Integer studyID) {
        this.studyID = studyID;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setPlanID(Integer planID) {
        this.planID = planID;
    }
    public void setCheck(Boolean check) {
        isCheck = check;
    }
}