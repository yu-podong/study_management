import { Link } from 'react-router-dom';

// component
import NavbarComponent from '../../components/NavbarComponent';
import StudyNoticeComponent from '../../components/studyInfo/StudyNoticeComponent'
import WeeklyPlanComponent from '../../components/plan/WeeklyPlanComponent';
import MonthlyPlanComponent from '../../components/plan/MonthlyPlanComponent'; 

// css
import '../../style/pageTemplate.css'
import '../../style/studyGroup.css'

function StudyGroupPage() {
	let studyInfo = {
		'studyName': 'Study Name',
		'simpleDesc': '스터디에 대한 설명'
	}

	return(
		<section id='study-group' class="template">
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
						<li style={{'background-color': "var(--mint-color)"}}><Link to='/study/mainpage'>Main</Link></li>
						<li><Link to='/commu/list'>커뮤니티</Link></li>
						<li><Link to='/study/member/list'>관리</Link></li>
					</ul>
					<div>
						{/* insert component */}
						<StudyNoticeComponent />
						<div className='plan-part'>
							<WeeklyPlanComponent />
							<MonthlyPlanComponent />
						</div>
					</div>
				</div>
			</div>
		</section>
	)
}

export default StudyGroupPage;