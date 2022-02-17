package com.study_management.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonthlyPlanDTO {
    private Integer planID;
    private Integer studyID;
    private String content;
    private boolean isCheck;

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
    public void seIstCheck(boolean check) {
        this.isCheck = check;
    }
    public void setPlanID(Integer planID) {
        this.planID = planID;
    }
    public void setStudyID(Integer studyID) {
        this.studyID = studyID;
    }
}