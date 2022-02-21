// component
import NavbarComponent from '../../components/NavbarComponent';
import StudyListComponent from '../../components/study/StudyListComponent';
import StudyDetailInfoComponent from '../../components/study/StudyDetailInfoComponent';

// css
import '../../style/pageTemplate.css'

function StudyPage() {
	return(
		<section class="study-list template">
			{/* navigation bar */}
			<NavbarComponent />

			{/* content section */}
			<div className="body-part">
				{/* title */}
				<div className='first'>
					<span className="title">현재 운영중인 스터디</span>
					<span className="desc">아래 스터디들의 정보를 보고 원하는 스터디에 가입하세요😊</span>
				</div>
				{/*  */}
				<div className='second'>
					{/* insert component */}
					<StudyListComponent />
					<StudyDetailInfoComponent />
				</div>
			</div>
		</section>
	)
}

export default StudyPage;