
import axios from 'axios';
import React,{ useEffect, useState } from 'react'
// markdown-viewer
import Prism from 'prismjs';
import '@toast-ui/editor/dist/toastui-editor.css';
import { Viewer } from '@toast-ui/react-editor';
import '@toast-ui/editor-plugin-code-syntax-highlight/dist/toastui-editor-plugin-code-syntax-highlight.css';
import codeSyntaxHighlight from '@toast-ui/editor-plugin-code-syntax-highlight';

// font awesome
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faPaperPlane } from '@fortawesome/free-solid-svg-icons';

// css
import './ReadStyle.css';
import Unix_timestamp from './UnixTimestamp.js';

// test variable

let content = `# CommuContents Markdown으로 작성됨

## 프로젝트 주제

**[기존 서비스의 개선점]**

1. Naver Cafe나 Slack 과 같은 커뮤니티 공간이 있지만, 조금 딱딱하다는 느낌을 받는 디자인이라 생각
2. 또, 동아리 명단은 임원이 직접적으로 알아보지 않는 이상, 정보가 업데이트되지 않는다는 단점 존재
3. 스터디원, 관련 정보 및 자료는 보통 카톡으로 관리되지만, 여타 이유로 체계적인 정보 관리가 되지 않음
1. Naver Cafe나 Slack 과 같은 커뮤니티 공간이 있지만, 조금 딱딱하다는 느낌을 받는 디자인이라 생각
2. 또, 동아리 명단은 임원이 직접적으로 알아보지 않는 이상, 정보가 업데이트되지 않는다는 단점 존재
3. 스터디원, 관련 정보 및 자료는 보통 카톡으로 관리되지만, 여타 이유로 체계적인 정보 관리가 되지 않음
1. Naver Cafe나 Slack 과 같은 커뮤니티 공간이 있지만, 조금 딱딱하다는 느낌을 받는 디자인이라 생각
2. 또, 동아리 명단은 임원이 직접적으로 알아보지 않는 이상, 정보가 업데이트되지 않는다는 단점 존재
3. 스터디원, 관련 정보 및 자료는 보통 카톡으로 관리되지만, 여타 이유로 체계적인 정보 관리가 되지 않음
1. Naver Cafe나 Slack 과 같은 커뮤니티 공간이 있지만, 조금 딱딱하다는 느낌을 받는 디자인이라 생각
2. 또, 동아리 명단은 임원이 직접적으로 알아보지 않는 이상, 정보가 업데이트되지 않는다는 단점 존재
3. 스터디원, 관련 정보 및 자료는 보통 카톡으로 관리되지만, 여타 이유로 체계적인 정보 관리가 되지 않음
1. Naver Cafe나 Slack 과 같은 커뮤니티 공간이 있지만, 조금 딱딱하다는 느낌을 받는 디자인이라 생각
2. 또, 동아리 명단은 임원이 직접적으로 알아보지 않는 이상, 정보가 업데이트되지 않는다는 단점 존재
3. 스터디원, 관련 정보 및 자료는 보통 카톡으로 관리되지만, 여타 이유로 체계적인 정보 관리가 되지 않음
1. Naver Cafe나 Slack 과 같은 커뮤니티 공간이 있지만, 조금 딱딱하다는 느낌을 받는 디자인이라 생각
2. 또, 동아리 명단은 임원이 직접적으로 알아보지 않는 이상, 정보가 업데이트되지 않는다는 단점 존재
3. 스터디원, 관련 정보 및 자료는 보통 카톡으로 관리되지만, 여타 이유로 체계적인 정보 관리가 되지 않음
1. Naver Cafe나 Slack 과 같은 커뮤니티 공간이 있지만, 조금 딱딱하다는 느낌을 받는 디자인이라 생각
2. 또, 동아리 명단은 임원이 직접적으로 알아보지 않는 이상, 정보가 업데이트되지 않는다는 단점 존재
3. 스터디원, 관련 정보 및 자료는 보통 카톡으로 관리되지만, 여타 이유로 체계적인 정보 관리가 되지 않음`;

let writeInfo = {
	'title': '커뮤니티 제목',
	'writer': '유현진',
	'date': '2022.02.02 23:10',
	'viewCnt': 100,
	'commentCnt': 100,
	'content': content
}


function GetPostID(location) {

	console.log("location >>> ", location);
	console.log("location.search >>> ", location.search);
  
	const params = new URLSearchParams(location.search);
  
	let postID = params.get("postID");
  
	console.log("params.get('postID') >>> ", postID);
	return postID;
  }

function CommentList(num){
	let result = [];
	const [commentList, setCommentList] =useState([]);
	let str = "/commu/comment/read?postID="+num;
	useEffect(()=> {
		axios.get(str).then((response)=>{
			if(response.data) {
				setCommentList(response.data);
				console.log(commentList);
			} else {
				alert("failed to");
			}
		}).catch(()=>{
			console.log("Error 발생!!!")
		})
	},[]);

	for(let i = 0 ; i < commentList.length; i++) {
	
		result.push(
			
			<li> 
			
					<div commentList='user-info'>
					<span>{commentList[i].userName}</span>
					<span>{Unix_timestamp(commentList[i].date)}</span>
					</div>
					<p>{commentList[i].content}</p>
			</li>
				
		)
	}

	
	return result;
	
}

function CommentPost(){
	let num =GetPostID(window.location);
	const axios = require('axios')
	axios.post('/commu/comment/write',{
		comID: 1,
		userID: 1,
		postID: num,
		content: '리엑트 추가된 내용'
	}).then((res)=>{
	  console.log(res)
	},[]);

  
}
function ReadComponent()  {

	let num =GetPostID(window.location);
	let str = "/commu/read?postID="+num;
	
	
	const [post, setPostList] =useState([]);

	useEffect(()=> {
		axios.get(str).then((response)=>{
			if(response.data) {
				setPostList(response.data);
				console.log(post);
			} else {
				alert("failed to");
			}
		}).catch(()=>{
			console.log("Error 발생!!!")
		})
	},[]);

	
	let content2 =post.content;
	
	
		return(
			<div className='commu-read-component'>
				<span className='title'>{post.title}</span>
				<ul className='detail-info'>
					<li className='writer'>{post.userName}</li>
					<li className='other'>
						<span className='date'>{Unix_timestamp(post.date)}</span>
						<span className='viewCnt'>{post.viewCnt}</span>
						<span className='commentCnt'>{post.comCnt}</span>
					</li>
				</ul>
				<div className='markdown-viewer'>
					<Viewer
						initialValue={content2}
						plugins={[[codeSyntaxHighlight, { highlighter: Prism }]]} />
				</div>
				<ul className='comment-list'>
				{CommentList(num)}
		
				</ul>
				
				<form action="">
					<input name="postID" value={num}  type="hidden" />
					<input type="text"  id="comment" placeholder='댓글을 작성해주세요.'/>
					<label  onClick={CommentPost} htmlFor="submit-btn"><FontAwesomeIcon icon={faPaperPlane} /></label>
					<input type="submit" id="submit-btn" style={{display: 'none'}}/>
				

				</form>
			</div>
		)
	
}

export default ReadComponent;
