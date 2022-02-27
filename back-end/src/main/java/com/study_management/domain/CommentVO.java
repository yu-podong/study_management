package com.study_management.domain;

import java.util.Date;

public class CommentVO {
    private Integer comID;
    private Date date;
    private String content;
    private String userName;


    // Getter
    public Date getDate() {
        return date;
    }
    public Integer getComID() {
        return comID;
    }

    public String getContent() {
        return content;
    }
    public String getuserName() {
        return userName;
    }
    // Setter
    public void setComID(Integer comID) {
        this.comID = comID;
    }
 
    public void setDate(Date date) {
        this.date = date;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
