import { Routes, Route, Link } from 'react-router-dom';

// component
import NavbarComponent from '../../components/NavbarComponent'
import CommunityListComponent from '../../components/community/CommunityListComponent';

// css
import '../../style/pageTemplate.css'
import '../../style/studyCommuStyle.css'

function StudyGroupPage() {
	let studyInfo = {
		'studyName': 'Study Name',
		'simpleDesc': '스터디에 대한 설명'
	}

	return(
		<section class="study-commu template">
			{/* navigation bar */}
			<NavbarComponent />

			{/* content section */}
			<div className="body-part">
				{/* title */}
				<div className='first'>
					<span className="title">{studyInfo.studyName}</span>
					<span className="desc">{studyInfo.simpleDesc}</span>
				</div>
				{/*  */}
				<div className='second'>
					<ul className="menu">
						<li ><Link to='/study/mainpage'>Main</Link></li>
						<li style={{'background-color': "var(--mint-color)"}}><Link to='/commu/list'>커뮤니티</Link></li>
						<li><Link to='/study/member/list'>관리</Link></li>
					</ul>

					{/* 커뮤니티 리스트 */}
					<div className='commu-component-part'>
						<CommunityListComponent />
					</div>
				</div>
			</div>

		</section>
	)
}

export default StudyGroupPage;