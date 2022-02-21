import React, {Component} from 'react';

// css
import './StudyApplyStyle.css'

let studyName = `[신청하는 스터디 이름]`;
let questionList = new Array("test Question1", "test Question2", "test Question3");

// 해당 스터디가 선택한 질문을 보여주는 html 구조
const renderQuesList = () => {
	let result = [];
	for(let i = 0; i < questionList.length; i++) {
		result.push(
			<li className={`ques${i+1}`}>
				<span>{questionList[i]}</span>
				<textarea name={`ans${i+1}`} id={`ans${i+1}`} cols="30" rows="10" placeholder="내용을 입력하세요"></textarea>
			</li>
		);
	}
	return result;
}

class StudyApplyComponent extends Component {
	render() {
		return(
			<form className='apply-form'>
				<span className='study-name'>{studyName} 신청서</span>
				<span className='desc'>
					'{studyName}'에서 여러분에게 궁금한 점은 담은 질문입니다.<br/>
					열심히 작성하셔서 제출하시면, 스터디에서 여러분이 작성한 내용을 확인하여 가입 여부를 결정합니다.
				</span>
				<ul>
					{renderQuesList()}
				</ul>
				<input type="submit" value="신청하기" />
			</form>
		)
	}
}

export default StudyApplyComponent;
