import axios from 'axios';
import React,{ useEffect, useState } from 'react'
import { Link } from 'react-router-dom';

// css
import './StudyListStyle.css';

function StudyList() {
	const [study, setStudy] = useState("");

	useEffect(()=> {
		axios.post("http://localhost:8091/study/list").then((response)=>{
			if(response.data) {
				setStudy(response.data);
				console.log(study);
			} else {
				alert("failed to");
			}
		}).catch(()=>{
			console.log("Error 발생!!!")
		})
	});

	return (
		<div className='study-list-component'>
			<ul className='list-template'>
				<li className='head'>
					<ul className='rows'>
						<li scope="col">스터디 이름</li>
						<li scope="col">설명</li>
						<li scope="col">적정 학년</li>
						<li scope="col">가입 인원</li>
						<li scope="col">활성률</li>
						<li scope="col">신청</li>
					</ul>
				</li>
				<li >
					<ul className='rows'>
						<li>✨React Study✨</li>
						<li>React를 공부하면서 , 개인 프로젝트를 진행합니다.</li>
						<li>3,4학년</li>
						<li>10명</li>
						<li class="good">활발</li>
						<li><span className="apply-btn"><Link to="/study/apply">신청</Link></span></li>
					</ul>
				</li>
				<li >
					<ul className='rows'>
						<li>✨test✨</li>
						<li>React를 공부하면서 , 개인 프로젝트를 진행합니다.</li>
						<li>3,4학년</li>
						<li>10명</li>
						<li class="good">보통</li>
						<li><span className="apply-btn"><Link to="/study/apply">신청</Link></span></li>
					</ul>
				</li>
				<li >
					<ul className='rows'>
						<li>✨React Study✨</li>
						<li>React를 공부하면서 , 개인 프로젝트를 진행합니다.</li>
						<li>3,4학년</li>
						<li>10명</li>
						<li class="good">활발</li>
						<li><span className="apply-btn"><Link to="/study/apply">신청</Link></span></li>
					</ul>
				</li>
			</ul>
		</div>
	)
}

export default StudyList;