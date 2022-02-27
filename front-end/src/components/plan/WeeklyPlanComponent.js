import React,{ Component } from 'react';
// fontawesome
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faCheck, faTable } from '@fortawesome/free-solid-svg-icons';
import { useEffect, useState } from "react";
import axios from 'axios';

//css
import './PlanStyle.css'

function WeeklyPlanComponent() {

	let result = [];
	const [weeklyPlanList, setWeeklyPlanList] = useState([]);
	
	useEffect(() => {
		axios.get("/plan/weekly/list?studyID=1").then((response)=> {
			if(response.data){
				setWeeklyPlanList(response.data);
				console.log(weeklyPlanList);
				
			} else {
				alert("failed to");
			}
		})
	}, []);

	const renderWeeklyPlanList = () => {
		let i = 0;
		let result = [];

		for (let key in weeklyPlanList) {
			// 체크된 plan은 value를 주지 않음 (수정이 불가능해지는 문제 발생) -> 추후 해결해야함
			if(weeklyPlanList[key].isCheck)	 {
				result.push(
					<li>
						<label htmlFor={`checkbox${i+1}`}><FontAwesomeIcon icon={faCheck} /> </label>
						<input type="checkbox" id={`checkbox${i+1}`} name="isCheck" checked/>
						<input type="text" name="content" />
					</li>
				)
			}
			// 체크되지 않는 plan의 내용을 출력
			else {
				result.push(
					
					<li>
						<label htmlFor={`checkbox${i+1}`}><FontAwesomeIcon icon={faCheck} /> </label>
						<input type="checkbox" id={`checkbox${i+1}`} name="isCheck"/>
						<input type="text" id="input" name="content" value={weeklyPlanList[key].content}  />
					</li>
				)
			}
		
		}
		return result;
	}
	
	return (
		<form className="study-weekly-plan plan-template">
				<p className='date'>Weekly</p>
				<ul className="check-list">
					{renderWeeklyPlanList()}
				</ul>
			</form>
	);
}

export default WeeklyPlanComponent;