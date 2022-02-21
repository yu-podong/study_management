import React, {Component} from 'react';
import { Link } from 'react-router-dom';

//css
import './CommunityListStyle.css'

const renderCommuList = () => {
	let result = [];

	for(let i = 0 ; i < 8; i++) {
		result.push(
			<li>
				<ul className='rows'>
					<Link to='/commu/read'>
						<li>유현진</li>
						<li>React 프로젝트를 진행하면서, event listener에 대해 궁금합니다.!!</li>
						<li>2022.02.02</li>
						<li>101</li>
						<li>20</li>
					</Link>
				</ul>
			</li>
		)
	}

	return result;
}

class CommunityListComponent extends Component {
	render() {
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
					{renderCommuList()}
				</ul>
			</div>
		)
	}
}

export default CommunityListComponent;