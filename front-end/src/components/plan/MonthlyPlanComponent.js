import React, {Component} from 'react';
// fontawesome
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faCheck } from '@fortawesome/free-solid-svg-icons';
import { useEffect, useState } from "react";
import axios from 'axios';

//css
import './PlanStyle.css'

// plan list를 생성하는 render함수
function MonthlyPlanComponent() {
	let result = [];
	const [monthlyPlanList, setMonthlyPlanList] = useState([]);
	
	useEffect(() => {
		axios.get("/plan/monthly/list?studyID=1").then((response)=> {
			if(response.data){
				setMonthlyPlanList(response.data);
				console.log(monthlyPlanList);
				
			} else {
				alert("failed to");
			}
		})
	}, []);

	const renderMonthlyPlanList = () => {
		let i = 0;
		let result = [];
	
		for (let key in monthlyPlanList) {
			// 체크된 plan은 value를 주지 않음 (수정이 불가능해지는 문제 발생) -> 추후 해결해야함
			if(monthlyPlanList[key].isCheck)	 {
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
						<input type="text" name="content" value={monthlyPlanList[key].content}/>
					</li>
				)
			}
		}
	
		return result;
	}
	return(
		<form className="study-monthly-plan plan-template">
			<p className='date'>Monthly</p>
			<ul className="check-list">
				{renderMonthlyPlanList()}
			</ul>
		</form>
	)
}

export default MonthlyPlanComponent;
