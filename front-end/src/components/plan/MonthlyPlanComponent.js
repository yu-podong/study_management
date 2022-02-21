import React, {Component} from 'react';
// fontawesome
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faCheck } from '@fortawesome/free-solid-svg-icons';

//css
import './PlanStyle.css'

// test variable
let monthlyPlan = {
	'plan1': {'content': 'test plan1', 'isCheck': true},
	'plan2': {'content': 'test plan2', 'isCheck': false},
	'plan3': {'content': 'test plan3', 'isCheck': true},
	'plan4': {'content': 'test plan4', 'isCheck': false},
	'plan5': {'content': 'test plan5', 'isCheck': true},
}

// plan list를 생성하는 render함수
const renderPlanList = () => {
	let i = 0;
	let result = [];

	for (let key in monthlyPlan) {
		// 체크된 plan은 value를 주지 않음 (수정이 불가능해지는 문제 발생) -> 추후 해결해야함
		if(monthlyPlan[key].isCheck)	 {
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
					<input type="text" name="content" value={monthlyPlan [key].content}/>
				</li>
			)
		}
	}

	return result;
}

class WeeklyPlanComponent extends Component {
	render() {
		return(
			<form className="study-monthly-plan plan-template">
				<p className='date'>1월</p>
				<ul className="check-list">
					{renderPlanList()}
				</ul>
			</form>
		)
	}
}

export default WeeklyPlanComponent;
