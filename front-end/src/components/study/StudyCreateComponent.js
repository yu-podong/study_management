import React, {Component} from 'react';

// css
import './StudyCreateStyle.css'

class StudyCreateComponent extends Component {
	render() {
		return(
			<form className='create-form'>
				{/* 기본 정보 영역 */}
				<ul className='first-part'>
					<span className='title'>기본 정보</span>
					<li><input type="text" name="studyName" id="studyName" placeholder='스터디 이름'/></li>
					<li><input type="text" name="simpleDesc" id="simpleDesc" placeholder='스터디 리스트에 보여질 설명' /></li>
				</ul>

				{/* 상세 정보 영역*/}
				<div className='second-part'>
					<span className='title'>상세 정보</span>
					<textarea name="detail" id="detail" cols="30" rows="10" placeholder='Markdown 기법으로 작성해주세요'></textarea>
					<ul>
						<li>
							<span>적정 학년</span>
							<select name="recomGra" id="recomGra">
								<option value={0} selected>전학년</option>
								<option value={1}>1학년</option><option value={2}>2학년</option>
								<option value={3}>3학년</option><option value={4}>4학년</option>
							</select>
						</li>
						<li>
							<span>가입 최대 인원</span>
							<input type="number" name="maxMem" id="maxMem" min="1" max="25" value="1"/>
						</li>
					</ul>
				</div>

				{/* 질문 생성 영역 */}
				<div className='third-part'>
					<span className='title'>질문생성</span>
					<span>스터디원이 가입신청을 할 때, 질문하고자 하는 내용을 선택하면 됩니다. 	&#40;복수 선택 가능&#41;</span>
					<ul className="question-list">
						<li><input type="checkbox" name="isQues1" id="isQues1" />관심 분야는 무엇인가요?</li>
						<li><input type="checkbox" name="isQues2" id="isQues2" />스터디에 참여하면서 얻고자하는 것은 무엇인가요?</li>
						<li><input type="checkbox" name="isQues3" id="isQues3" />본인에 대해 어필하고 싶은 점이 있나요?</li>
						<li><input type="checkbox" name="noQues" id="noQues" />없음</li>
					</ul>
				</div>

				<input type="submit" value="등록하기" />
			</form>
		)
	}
}

export default StudyCreateComponent;