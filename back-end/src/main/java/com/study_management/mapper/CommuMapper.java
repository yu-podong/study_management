package com.study_management.mapper;

import java.util.List;

import com.study_management.domain.CommentDTO;
import com.study_management.domain.PostDTO;



public interface CommuMapper {
	//CommentDTO
	 public List<CommentDTO> commentListGet(int postID);
	 //댓글 리스트 출력
	 public void commentInsert(CommentDTO DTO);
	 //새 댓글 생성 추가
	 public void commentDelete(int comID);
	 //댓글 제거
	 public void commentDeleteAll(int postID);
	 //질문 삭제
	 public void commentUpdate(CommentDTO DTO);
	 //기본 댓글수정
	 
	 //PostDTO
	 public List<PostDTO> postListGet(int studyID);
	 //질문 리스트 출력
	 public List<PostDTO> postSelect(int postID);
	 //질문 선택
	 public void postInsert(PostDTO DTO);
	 //질문추가
	 public void postDelete(int postID);
	 //질문 삭제
	 public void postUpdate(PostDTO DTO);//댓글 수정
	 //질문수정
	 
	
	
}
