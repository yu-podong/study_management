package com.study_management.domain;

import java.util.Date;

public class CommentDTO {
	private Integer comID;
    private Integer userID;
    private Integer postID;
    private String content;
    // Constructure

    // Getter

    public Integer getComID() {
        return comID;
    }
    public Integer getPostID() {
        return postID;
    }
    public Integer getUserID() {
        return userID;
    }
    public String getContent() {
        return content;
    }

    // Setter

    public void setComID(Integer comID) {
        this.comID = comID;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public void setPostID(Integer postID) {
        this.postID = postID;
    }
    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}
