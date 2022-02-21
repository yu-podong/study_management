package com.study_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study_management.domain.CommentDTO;
import com.study_management.domain.CommentVO;
import com.study_management.domain.PostDTO;
import com.study_management.domain.PostListVO;
import com.study_management.domain.PostVO;
import com.study_management.mapper.CommuMapper;
import com.study_management.mapper.Test2Mapper;
import com.study_management.mapper.TestMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@RequestMapping("/commu/*")
@RestController
@Log4j
@AllArgsConstructor
public class CommuController {

	@Autowired
	private CommuMapper CommuMapper;
	
	

	//=======================================<<보기>>===========================================
	
	//질문 리스트 보기
	@GetMapping(value = "/PostList/{studyID}", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public List<PostListVO> PostListGet(@PathVariable("studyID") int studyID) {
		System.out.println("1=====================================");
		log.info("list: "+studyID);	
		List<PostListVO> PostList = CommuMapper.PostListVOGet(studyID);
		System.out.println("=====================================");
		
		return PostList;
	}
	
	//선택한 질문  내용 보기
	@GetMapping(value = "Post/{postID}", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public PostVO PostGet(@PathVariable("postID") int postID) {
		System.out.println("1=====================================");
		log.info("Post: "+postID);
		PostVO Post = CommuMapper.PostVOGet(postID);
		log.info("PostViewCntUpdate: " + postID);
		CommuMapper.PostViewCntUpdate(postID);
		System.out.println("=====================================");
		return Post;
	}
	
	
	//댓글 리스트 보기
	@GetMapping(value = "/CommentList/{postID}", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public List<CommentVO> CommentGet(@PathVariable("postID") int postID) {
		System.out.println("1=====================================");
		log.info("list: "+postID);
		
		List<CommentVO> CommentList = CommuMapper.CommentVOGet(postID);
		System.out.println("=====================================");
		return CommentList;
	}
	

	//=======================================<<추가>>===========================================
	

	@PostMapping(value = "/PostInsert",  produces = { MediaType.APPLICATION_JSON_UTF8_VALUE})
	public int  PostInsert(@RequestBody PostDTO DTO) {//id요소는 무시됨 그냥 형식상 존제하는 데이터라 아무값이나 넣어도됨
		log.info("1.------------- ");
		log.info("PostInsert: ");
		CommuMapper.PostDTOInsert(DTO);
		log.info("------------- ");
		return  1;
	}
	
	@PostMapping(value = "/CommentInsert",  produces = { MediaType.APPLICATION_JSON_UTF8_VALUE})
	public int  CommentInsert(@RequestBody CommentDTO DTO) {//id요소는 무시됨 그냥 형식상 존제하는 데이터라 아무값이나 넣어도됨
		log.info("1.------------- ");
		log.info("CommentInsert: ");
		CommuMapper.CommentDTOInsert(DTO);
		log.info("ComCntUpdate: ");
   		CommuMapper.ComCntUpdate(DTO);
		log.info("------------- ");
		return  1;
	}

	
	//=======================================<<제거>>===========================================
	



   	@PostMapping(value = "/PostDelete", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
   	public int PostDelete(@RequestBody PostDTO DTO) {//id 요소만 쓰임
   		log.info("1.------------- ");
   		log.info("AllCommentDelete: ");
   		CommuMapper.AllCommentDelete(DTO);
   		log.info("PostDelete: ");
   		CommuMapper.PostDTODelete(DTO);

   		log.info("------------- ");
		return 1;
	}
   	
   	
   	@PostMapping(value = "/CommentDelete", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
   	public int CommentDelete(@RequestBody CommentDTO DTO) {//id 요소만 쓰임
   		log.info("1.------------- ");
   		log.info("CommentDelete: ");
   		CommuMapper.CommentDTODelete(DTO);
  		log.info("ComCntDecrease: ");
   		CommuMapper.ComCntDecrease(DTO);
   		log.info("------------- ");
		return 1;
	}
   	
  //=======================================<<수정>>===========================================
	
   	
   	@PostMapping(value = "/PostUpdate", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
   	public int PostUpdate(@RequestBody PostDTO DTO) {//
   		log.info("PostUpdate: ");
   		CommuMapper.PostDTOUpdate(DTO);
   		log.info("------------- ");
		return 1;
	}
 	@PostMapping(value = "/CommentUpdate", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
   	public int CommentUpdate(@RequestBody CommentDTO DTO) {//
   		log.info("PostUpdate: ");
   		CommuMapper.CommentDTOUpdate(DTO);
   		log.info("------------- ");
		return 1;
	}
 	
 	
}


