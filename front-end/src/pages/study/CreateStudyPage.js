// component
import NavbarComponent from '../../components/NavbarComponent';
import StudyCreateComponent from '../../components/study/StudyCreateComponent';

// css
import '../../style/pageTemplate.css'

function CreateStudyPage() {
	return(
		<section class="study-create template">
			{/* navigation bar */}
			<NavbarComponent />

			{/* content section */}
			<div className="body-part">
				{/* title */}
				<div className='first'>
					<span className="title">새로운 스터디 생성</span>
					<span className="desc">만들고자 하는 스터디의 정보를 입력해주세요!</span>
				</div>
				{/*  */}
				<div className='second'>
					{/* insert component */}
					<StudyCreateComponent />
				</div>
			</div>
		</section>
	)
}

export default CreateStudyPage;