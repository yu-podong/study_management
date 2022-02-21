// component
import NavbarComponent from '../../components/NavbarComponent';
import StudyApplyComponent from '../../components/study/StudyApplyComponent';

// css
import '../../style/pageTemplate.css';

function ApplyStudyPage() {
	return(
		<section class="study-apply template">
			{/* navigation bar */}
			<NavbarComponent />

			{/* content section */}
			<div className="body-part">
				{/* title */}
				<div className='first'>
					<span className="title">스터디 신청</span>
					<span className="desc">선택하신 스터디에 신청하기 위한 페이지입니다 :&#41;</span>
				</div>
				{/*  */}
				<div className='second'>
					{/* insert component */}
					<StudyApplyComponent />
				</div>
			</div>
		</section>
	)
}

export default ApplyStudyPage;