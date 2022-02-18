package com.study_management.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.study_management.domain.CommentDTO;
import com.study_management.domain.PostDTO;
import com.study_management.domain.TestVO;
import com.study_management.mapper.Test2Mapper;
import com.study_management.mapper.TestMapper;
import com.study_management.service.TestService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@RequestMapping("/commu/*")
@RestController
@Log4j
@AllArgsConstructor
public class CommuController {
	@Autowired
	private Test2Mapper timeMapper;
	
	@Autowired
	private TestMapper testMapper;
	
	@Autowired
	private TestService CommuMapper;
	
	@Autowired
	private TestService service;


	@GetMapping(value = "/list", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public List<TestVO> test() {
		log.info("list: ");
		System.out.println("1=====================================");
		System.out.println(timeMapper.getTime2());
		List<TestVO> testList = service.get();
		
		
		return testList;
	}
	
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public List<TestVO> test2(@PathVariable("id") int id) {
		List<TestVO> testList = service.select(id);
		log.info("select: " + id);
		return testList;
	}


	@GetMapping(value = "/read", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public CommentDTO  getSample1() {
		log.info("read: ");


		return new CommentDTO();
	}
	@PostMapping(value = "/write",  produces = { MediaType.APPLICATION_JSON_UTF8_VALUE})
	public int  insert(@RequestBody TestVO vo) {//id요소는 무시됨 그냥 형식상 존제하는 데이터라 아무값이나 넣어도됨
		log.info("write: ");
		testMapper.insert(vo);
		log.info("------------- ");
		return  1;
	}

   	@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
   	public int delete(@RequestBody TestVO vo) {//id 요소만 쓰임
   		log.info("delete: ");
   		testMapper.delete(vo);
   		log.info("------------- ");
		return 1;
	}
   	
 	@PostMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
   	public int update(@RequestBody TestVO vo) {//id 요소만 쓰임
   		log.info("update: ");
   		testMapper.update(vo);
   		log.info("------------- ");
		return 1;
	}
}

