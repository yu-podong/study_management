package com.study_management.controller;

import java.util.Arrays;
import java.util.List;

import com.study_management.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.study_management.mapper.CommuMapper;

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
	@GetMapping("/hello")
	public List<String> Hello() {
			System.out.println("1=====================================");

			return Arrays.asList("서버포트 8080","리액트포트 3000");
		}

	//질문 리스트 보기
	//http://localhost:8083/commu/list?studyID=1
	@GetMapping(value = "list", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public List<PostListVO> PostListGet(@RequestParam("studyID") int studyID)
	//@GetMapping(value = "list/{studyID}", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	//public List<PostListVO> PostListGet(@PathVariable("studyID") int studyID)
	{
		System.out.println("1=====================================");
		log.info("list: "+studyID);	
		List<PostListVO> PostList = CommuMapper.PostListVOGet(studyID);
		System.out.println("=====================================");
		
		return PostList;
	}
	
	//선택한 질문  내용 보기
    //http://localhost:8083/commu/read?postID=1
	@GetMapping(value = "read", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public PostVO PostGet(@RequestParam("postID") int postID)
	//@GetMapping(value = "read", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	//public PostVO PostGet(@PathVariable("postID") int postID)
	{
		System.out.println("1=====================================");
		System.out.println("Post: "+postID);
		PostVO Post = CommuMapper.PostVOGet(postID);
		log.info("PostViewCntUpdate: " + postID);
		CommuMapper.PostViewCntUpdate(postID);
		System.out.println("=====================================");

		return Post;
	}
	
	
	//댓글 리스트 보기
	//http://localhost:8083/commu/comment/read?postID=1
	@GetMapping(value = "comment/read", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public List<CommentVO> CommentGet(@RequestParam("postID") int postID) {
		System.out.println("1=====================================");
		System.out.println("commentlist: "+postID);
		
		List<CommentVO> CommentList = CommuMapper.CommentVOGet(postID);
		System.out.println("=====================================");
		return CommentList;
	}
	

	//=======================================<<추가>>===========================================
	

	@PostMapping(value = "/write",  produces = { MediaType.APPLICATION_JSON_UTF8_VALUE})
	public int  PostInsert(@RequestBody PostDTO DTO) {//id요소는 무시됨 그냥 형식상 존제하는 데이터라 아무값이나 넣어도됨
		log.info("1.------------- ");
		log.info("PostInsert: ");
		CommuMapper.PostDTOInsert(DTO);
		log.info("------------- ");
		return  1;
	}
	
	@PostMapping(value = "/comment/write",  produces = { MediaType.APPLICATION_JSON_UTF8_VALUE})
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
	



   	@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
   	public int PostDelete(@RequestBody PostDTO DTO) {//id 요소만 쓰임
   		log.info("1.------------- ");
   		log.info("AllCommentDelete: ");
   		CommuMapper.AllCommentDelete(DTO);
   		log.info("PostDelete: ");
   		CommuMapper.PostDTODelete(DTO);

   		log.info("------------- ");
		return 1;
	}
   	
   	
   	@PostMapping(value = "/write/comment/delete", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
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
	
   	
   	@PostMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
   	public int PostUpdate(@RequestBody PostDTO DTO) {//
   		log.info("PostUpdate: ");
   		CommuMapper.PostDTOUpdate(DTO);
   		log.info("------------- ");
		return 1;
	}
 	@PostMapping(value = "/comment/update", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
   	public int CommentUpdate(@RequestBody CommentDTO DTO) {//
   		log.info("PostUpdate: ");
   		CommuMapper.CommentDTOUpdate(DTO);
   		log.info("------------- ");
		return 1;
	}
 	
 	
}


