package com.study_management.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
    private Integer postID;
    private Integer studyID;
    private Integer userID;
    private String title;
    private Date date;
    private Integer viewCnt;
    private Integer comCnt;
    private String content;

    // Constructure


    // Getter
    public Integer getStudyID() {
        return studyID;
    }
    public String getContent() {
        return content;
    }
    public Integer getUserID() {
        return userID;
    }
    public Integer getPostID() {
        return postID;
    }
    public Date getDate() {
        return date;
    }
    public Integer getComCnt() {
        return comCnt;
    }
    public Integer getViewCnt() {
        return viewCnt;
    }
    public String getTitle() {
        return title;
    }

    // Setter
    public void setStudyID(Integer studyID) {
        this.studyID = studyID;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setUserID(Integer userID) {
        this.userID = userID;
    }
    public void setPostID(Integer postID) {
        this.postID = postID;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setComCnt(Integer comCnt) {
        this.comCnt = comCnt;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setViewCnt(Integer viewCnt) {
        this.viewCnt = viewCnt;
    }
}