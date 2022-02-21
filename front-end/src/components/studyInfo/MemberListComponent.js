import React, {Component} from 'react';
// font-awesome
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faUser } from '@fortawesome/free-solid-svg-icons';

// css
import './MemberListStyle.css';

class MemberListPopComponent extends Component {
	render() {
		return(
			<div className='member-list-component'>
				<span className='title'>스터디 참여 인원</span>
				<ul className="member-list">
					<li>
						<FontAwesomeIcon icon={faUser}/>
						<span className='name'>userName</span>
						<span className='grade'>4학년</span>
						<span className='dept'>소프트웨어학과</span>
						<span className='autho master'>master</span>
					</li>
					<li>
						<FontAwesomeIcon icon={faUser}/>
						<span className='name'>userName</span>
						<span className='grade'>4학년</span>
						<span className='dept'>소프트웨어학과</span>
						<span className='autho member'>member</span>
					</li>
					<li>
						<FontAwesomeIcon icon={faUser}/>
						<span className='name'>userName</span>
						<span className='grade'>4학년</span>
						<span className='dept'>소프트웨어학과</span>
						<span className='autho member'>member</span>
					</li>
					<li>
						<FontAwesomeIcon icon={faUser}/>
						<span className='name'>userName</span>
						<span className='grade'>4학년</span>
						<span className='dept'>소프트웨어학과</span>
						<span className='autho member'>member</span>
					</li>
					<li>
						<FontAwesomeIcon icon={faUser}/>
						<span className='name'>userName</span>
						<span className='grade'>4학년</span>
						<span className='dept'>소프트웨어학과</span>
						<span className='autho member'>member</span>
					</li>
				</ul>
			</div>
		)
	}
}

export default MemberListPopComponent;

