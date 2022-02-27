//import React, {Component} from 'react';
//import { Link } from 'react-router-dom';
import axios from 'axios';
import React,{ useEffect, useState,Component } from 'react';
import { Link } from 'react-router-dom';
//css
import './CommunityListStyle.css';
import Unix_timestamp from './UnixTimestamp.js';

function GetStudyID(location) {

	console.log("location >>> ", location);
	console.log("location.search >>> ", location.search);
  
	const params = new URLSearchParams(location.search);
  
	let studyID = params.get("studyID");
  
	console.log("params.get('studyID') >>> ", studyID);
	return studyID;
  }

function RenderCommuList() {
	let num =GetStudyID(window.location);
	let result = [];
	let str ="/commu/list?studyID="+num;

	const [postList, setPostList] =useState([]);

	useEffect(()=> {
		axios.get(str).then((response)=>{
			if(response.data) {
				setPostList(response.data);
				console.log(postList);
			} else {
				alert("failed to");
			}
		}).catch(()=>{
			console.log("Error 발생!!!")
		})
	},[]);

	for(let i = 0 ; i < postList.length; i++) {
		str='/commu/read?postID='+(postList[i].postID)
	
		result.push(
			
			<li> 
				<ul className='rows'>
					<Link to={str}>
					<li> {postList[i].userName}</li>
						<li>{postList[i].title}</li>
						<li>{Unix_timestamp(postList[i].date)}</li>
						<li>{postList[i].viewCnt}</li>
						<li>{postList[i].comCnt}</li>
					</Link>
				</ul>
			</li>
		)
	}

	return result;
}


function CommunityListComponent() {
	 {
		
		return(
			<div className='commu-list-component'>
				<div class="under_menu">
					<span  class="explanation"> 스터디에 참여하시면서 궁금한 부분들을 자유롭게 질문하고, 답변받으세요</span>
					<ul class="menu_right">
						<li><input type="text" placeholder=" 검색어 입력"/></li>
						<li><Link to="/commu/write">글쓰기+</Link></li>
					</ul>
				</div>

				<ul className='list-template'>
					<li className='head'>
						<ul className='rows'>
							<li scope="col">작성자</li>
							<li scope="col">제목</li>
							<li scope="col">작성일자</li>
							<li scope="col">조회수</li>
							<li scope="col">댓글</li>
						</ul>
					</li>
					{RenderCommuList()}
				</ul>
			</div>
		)
	}
}

export default CommunityListComponent;
