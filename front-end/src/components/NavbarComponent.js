import React,{ Component } from 'react';

// font-awesome icon
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faCircleUser } from '@fortawesome/free-solid-svg-icons';
import { faList } from '@fortawesome/free-solid-svg-icons';
import { faPenToSquare } from '@fortawesome/free-solid-svg-icons';
import { faUserGear } from '@fortawesome/free-solid-svg-icons';

// css
import './NavbarStyle.css'

class NavbarComponent extends Component {
	render() {
		return (
			<nav className='nav-bar'>
				{/* Mainpage로 돌아가는 메뉴가 있어야 할 듯 (시간적 여유가 생기면 진행) */}
				<FontAwesomeIcon icon={faCircleUser} size='1x'/>
				<ul>
					<li><FontAwesomeIcon icon={faList} /></li>
					<li><FontAwesomeIcon icon={faPenToSquare} /></li>
					<li><FontAwesomeIcon icon={faUserGear} /></li>
				</ul>
			</nav>
		)
	}
}

export default NavbarComponent;