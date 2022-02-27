package com.study_management.domain;

import java.util.Date;
import java.util.List;

public class PostVO {
	private Integer postID;
	private String title;
	private Date date;
	private Integer viewCnt;
	private Integer comCnt;
	private String content;
	private String userName;


	public Integer getPostID() {
		return postID;
	}
	public String getTitle() {
		return title;
	}
	public Date getDate() {
		return date;
	}
	public Integer getViewCnt() {
		return viewCnt;
	}
	public Integer getComCnt() {
		return comCnt;
	}
	public String getContent() {
		return content;
	}
	public String getUserName() {
		return userName;
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
	public void setContent(String content) {
		this.content = content;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
