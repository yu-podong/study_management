package com.study_management.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {
    private Integer comID;
    private Integer userID;
    private Integer postID;
    private Date date;
    private String content;

    // Constructure

    // Getter
    public Date getDate() {
        return date;
    }
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
    public void setDate(Date date) {
        this.date = date;
    }
    public void setPostID(Integer postID) {
        this.postID = postID;
    }
    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}