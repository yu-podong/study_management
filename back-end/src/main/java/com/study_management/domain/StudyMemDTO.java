package com.study_management.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudyMemDTO {
    private Integer userID;
    private Integer studyID;
    private Integer studyAutho;

    // Constructure

    // Getter
    public Integer getStudyID() {
        return studyID;
    }
    public Integer getUserID() {
        return userID;
    }
    public Integer getStudyAutho() {
        return studyAutho;
    }

    // Setter
    public void setStudyID(Integer studyID) {
        this.studyID = studyID;
    }
    public void setUserID(Integer userID) {
        this.userID = userID;
    }
    public void setStudyAutho(Integer studyAutho) {
        this.studyAutho = studyAutho;
    }
}