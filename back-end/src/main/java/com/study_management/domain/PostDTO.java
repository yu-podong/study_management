package com.study_management.domain;

import java.util.Date;

public class PostDTO {
	private Integer postID;
    private Integer studyID;
    private Integer userID;
    private String title;
    private String content;

    // Constructure


    // Getter
    public Integer getPostID() {
        return postID;
    }
    public Integer getStudyID() {
        return studyID;
    }
    public String getContent() {
        return content;
    }
    public Integer getUserID() {
        return userID;
    }
   
    public String getTitle() {
        return title;
    }

    // Setter
    public void setPostID(Integer postID) {
        this.postID = postID;
    }
    public void setStudyID(Integer studyID) {
        this.studyID = studyID;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setUserID(Integer userID) {
        this.userID = userID;
    }
   
    public void setTitle(String title) {
        this.title = title;
    }
   
}
