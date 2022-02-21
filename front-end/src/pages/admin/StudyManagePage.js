import { Routes, Route, Link } from 'react-router-dom';

// component
import NavbarComponent from '../../components/NavbarComponent'
import ApplyListComponent from '../../components/studyInfo/ApplyListComponent';
import MemberListPopComponent from '../../components/studyInfo/MemberListComponent';

// css
import '../../style/pageTemplate.css'
import '../../style/studyManageStyle.css'

function StudyManagePage() {
	let studyInfo = {
		'studyName': 'Study Name',
		'simpleDesc': '스터디에 대한 설명'
	}

	return(
		<section class="study-member template">
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
						<li><Link to='/study/mainpage'>Main</Link></li>
						<li><Link to='/commu/list'>커뮤니티</Link></li>
						<li style={{'background-color': "var(--mint-color)"}}><Link to='/study/member/list'>관리</Link></li>
					</ul>

					{/* 커뮤니티 리스트 */}
					<div className='study-component-part'>
						<MemberListPopComponent />
						<ApplyListComponent />
					</div>
				</div>
			</div>

		</section>
	)
}

export default StudyManagePage;