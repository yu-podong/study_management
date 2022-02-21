package com.study_management.mapper;

import java.util.List;

import com.study_management.domain.CommentDTO;
import com.study_management.domain.CommentVO;
import com.study_management.domain.PostDTO;
import com.study_management.domain.PostListVO;
import com.study_management.domain.PostVO;



public interface CommuMapper {
	//CommentDTO===========================================================
	 public List<PostListVO> PostListVOGet(int studyID);//질문 리스트 보기
 
	 public PostVO PostVOGet(int postID);//질문 보기
	
	 public List<CommentVO> CommentVOGet(int postID);//질문 보기

	 
	 //추가===========================================================
	 
	 public void PostDTOInsert(PostDTO DTO);//질문 추가
	 
	 public void CommentDTOInsert(CommentDTO DTO);//질문 추가
	 
	 //제거===========================================================
	 public void PostDTODelete(PostDTO postID);//질문 추가
	 
	 
	 public void CommentDTODelete(CommentDTO comID);//질문 추가
	 
	 //수정 ===========================================================
	 public void PostDTOUpdate(PostDTO DTO);//질문 추가
	 
	 public void CommentDTOUpdate(CommentDTO DTO);//질문 추가
	 
	 //기타===========================================================
	 
	 //조회수증가
	 public void PostViewCntUpdate(int postID);//질문 추가
	 
	 //댓글 생성시 댓글 수 증가
	 public void ComCntUpdate(CommentDTO DTO);//질문 추가
	 
	 //댓글 식제시 댓글 수 감수
	 public void ComCntDecrease(CommentDTO DTO);//질문 추가
	 
	 //게시물 삭제시 댓글 삭제
	 public void AllCommentDelete(PostDTO DTO);//질문 추가
	 
}

