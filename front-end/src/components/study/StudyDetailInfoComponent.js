import React,{ Component } from 'react';
import { Link } from 'react-router-dom';
import ReactMarkdown from 'react-markdown';
import remarkGfm from 'remark-gfm';

import './StudyDetailInfoStyle.css'

class StudyDetailInfoComponent extends Component {

	render() {
		let grade = 2;
		let maxMem = 10;
		let currentMem = 7;

		const markdown = `### Hello world 

**굵게**

\`\`\`java
public void main() {
	Integer testInt = 10;

	System.out.println(testInt);
}
\`\`\`

> 인용문 test

지금 렌더링이 적용되지 않는 코드들이 있는데,
다로 코드를 작성해서 스타일을 커스텀해야 한다고 한다..젠장

| testCol | testCol |
|:---:|:---:|:---:|
|안녕|안녕|
---

		`;

		return (
			<div className="detail-part">
				<span className="study-name">STUDY NAME</span>
				<span className='simple-desc'>React를 공부하면서, 개인 프로젝트를 진행합니다.</span>
				<ul>
					<li>- 적정 학년 : {grade}학년</li>
					<li>- 가입 최대 인원 : {currentMem}명 / {maxMem}명</li>
				</ul>
				<div className="detail-info">
					<span>상세 정보</span>
					{/* markdown viewer */}
					<div class="markdown-viewer">
						<ReactMarkdown children={markdown} remarkPlugins={[remarkGfm]} />
					</div>
				</div>

				<Link to="/study/apply" className="apply-btn">가입하기</Link>
			</div>
		)
	}
}

export default StudyDetailInfoComponent;