import React, {Component} from 'react';

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

class ReadComponent extends Component {
	render() {
		return(
			<div className='commu-read-component'>
				<span className='title'>{writeInfo.title}</span>
				<ul className='detail-info'>
					<li className='writer'>{writeInfo.writer}</li>
					<li className='other'>
						<span className='date'>{writeInfo.date}</span>
						<span className='viewCnt'>{writeInfo.viewCnt}</span>
						<span className='commentCnt'>{writeInfo.commentCnt}</span>
					</li>
				</ul>
				<div className='markdown-viewer'>
					<Viewer
						initialValue={writeInfo.content}
						plugins={[[codeSyntaxHighlight, { highlighter: Prism }]]} />
				</div>
				<ul className='comment-list'>
					<li>
						<div className='user-info'>
							<span>강수</span>
							<span>2022.01.20 01:23</span>
						</div>
						<p>오..좋은 프로젝트 주제이지만, 기존에 있는 Cafe나 Slack과 같은 커뮤니티와 많은 유사점을 가지기에, 차별점을 생각해둬야 할 거 같습니다 :&#41;</p>
					</li>
					<li>
					<div className='user-info'>
						<span>강수</span>
						<span>2022.01.20 01:23</span>
						</div>
						<p>오..좋은 프로젝트 주제이지만, 기존에 있는 Cafe나 Slack과 같은 커뮤니티와 많은 유사점을 가지기에, 차별점을 생각해둬야 할 거 같습니다 :&#41;</p>
					</li>
				</ul>
				<form action="">
					<input type="text" name="content" placeholder='댓글을 작성해주세요.'/>
					<label htmlFor="submit-btn"><FontAwesomeIcon icon={faPaperPlane} /></label>
					<input type="submit" id="submit-btn" style={{display: 'none'}}/>
				</form>
			</div>
		)
	}
}

export default ReadComponent;