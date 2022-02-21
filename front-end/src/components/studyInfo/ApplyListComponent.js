import React, {Component} from 'react';
// font-awesome
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faUser } from '@fortawesome/free-solid-svg-icons';

// css
import './ApplyListStyle.css';

class ApplyListComponent extends Component {
	render() {
		return(
			<div className='apply-list-component'>
				<span className='title'>스터디 신청 인원</span>
				<ul className='apply-list'>
					<li>
						<div className='user-info'>
							<FontAwesomeIcon icon={faUser} />
							<span className='user-name'>userName</span>
							<span className="dept">&#40;소프트웨어학과 4학년&#41;</span>
						</div>
						<div className='content'>
							<p>안녕하세요! 제가 이 스터디에 지원한 이유는 단 하나입니다. 
								현재 react를 공부하며, 한계점을 느끼고 있고 이를 여러 사람들과 함께 공부하고, 프로젝트을 진행하며
								극복하고 싶은 마음에 지원하게 되었습니다.
							</p>
							<ul className='btn-list'>
								<li className='yes'>Yes</li>
								<li className='no'>No</li>
							</ul>
						</div>
					</li>
					<li>
						<div className='user-info'>
							<FontAwesomeIcon icon={faUser} />
							<span className='user-name'>userName</span>
							<span className="dept">&#40;소프트웨어학과 4학년&#41;</span>
						</div>
						<div className='content'>
							<p>안녕하세요! 제가 이 스터디에 지원한 이유는 단 하나입니다. 
								현재 react를 공부하며, 한계점을 느끼고 있고 이를 여러 사람들과 함께 공부하고, 프로젝트을 진행하며
								극복하고 싶은 마음에 지원하게 되었습니다.
							</p>
							<ul className='btn-list'>
								<li className='yes'>Yes</li>
								<li className='no'>No</li>
							</ul>
						</div>
					</li>
					<li>
						<div className='user-info'>
							<FontAwesomeIcon icon={faUser} />
							<span className='user-name'>userName</span>
							<span className="dept">&#40;소프트웨어학과 4학년&#41;</span>
						</div>
						<div className='content'>
							<p>안녕하세요! 제가 이 스터디에 지원한 이유는 단 하나입니다. 
								현재 react를 공부하며, 한계점을 느끼고 있고 이를 여러 사람들과 함께 공부하고, 프로젝트을 진행하며
								극복하고 싶은 마음에 지원하게 되었습니다.
							</p>
							<ul className='btn-list'>
								<li className='yes'>Yes</li>
								<li className='no'>No</li>
							</ul>
						</div>
					</li>
					<li>
						<div className='user-info'>
							<FontAwesomeIcon icon={faUser} />
							<span className='user-name'>userName</span>
							<span className="dept">&#40;소프트웨어학과 4학년&#41;</span>
						</div>
						<div className='content'>
							<p>안녕하세요! 제가 이 스터디에 지원한 이유는 단 하나입니다. 
								현재 react를 공부하며, 한계점을 느끼고 있고 이를 여러 사람들과 함께 공부하고, 프로젝트을 진행하며
								극복하고 싶은 마음에 지원하게 되었습니다.
							</p>
							<ul className='btn-list'>
								<li className='yes'>Yes</li>
								<li className='no'>No</li>
							</ul>
						</div>
					</li>
					<li>
						<div className='user-info'>
							<FontAwesomeIcon icon={faUser} />
							<span className='user-name'>userName</span>
							<span className="dept">&#40;소프트웨어학과 4학년&#41;</span>
						</div>
						<div className='content'>
							<p>안녕하세요! 제가 이 스터디에 지원한 이유는 단 하나입니다. 
								현재 react를 공부하며, 한계점을 느끼고 있고 이를 여러 사람들과 함께 공부하고, 프로젝트을 진행하며
								극복하고 싶은 마음에 지원하게 되었습니다.
							</p>
							<ul className='btn-list'>
								<li className='yes'>Yes</li>
								<li className='no'>No</li>
							</ul>
						</div>
					</li>
				</ul>
			</div>
		)
	}
}

export default ApplyListComponent;
