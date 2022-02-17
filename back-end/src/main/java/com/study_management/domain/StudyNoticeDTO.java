package com.study_management.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oracle.sql.DATE;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudyNoticeDTO {
    private Integer noID;
    private Integer studyID;
    private String title;
    private String content;
    private DATE writeDate;

    // Constructure

    // Getter
    public Integer getStudyID() {
        return studyID;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public DATE getWriteDate() {
        return writeDate;
    }
    public Integer getNoID() {
        return noID;
    }

    // Setter
    public void setStudyID(Integer studyID) {
        this.studyID = studyID;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setNoID(Integer noID) {
        this.noID = noID;
    }
    public void setWriteDate(DATE writeDate) {
        this.writeDate = writeDate;
    }
}