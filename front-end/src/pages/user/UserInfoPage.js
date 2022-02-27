import { Routes, Route, Link } from 'react-router-dom';
import {useDispatch} from 'react-redux';

import NavbarComponent from '../../components/NavbarComponent'
import '../../style/userInfoModify.css'
// font-awesome icon
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faCircleUser } from '@fortawesome/free-solid-svg-icons';	
				

function UserInfoPage() {

	const dispatch = useDispatch();

  	const [userNum, setUserNum] = useState(" ");
  	const [userName, setUserName] = useState(" ");
	const [gender, setGender]= useState("");
	const [grade, setGrade] = useState("");
	const [state, setState] = useState("");
	const [dept, setDept] = useState("");

	const [userTel1, setUserTel1] = useState("");
	const [userTel2, setUserTel2] = useState("");
	const [userTel3, setUserTel3] = useState("");

	return(
		<section class="study-commu template">
			{/* navigation bar */}
			<NavbarComponent />
				{/* content section */}
				<div class="userinfo-part">
					<div class="title">본인정보</div>
					
					<div class="info">
						<span class = "profile">
							<FontAwesomeIcon icon={faCircleUser} size='100px'/>
						</span>
						<span class = "userName">{userName}</span>
						<br/><br/>
						<span class = "gender">{gender}</span>
					</div>
						
					<table class="table">      
						<tbody>
							<tr>
								<td class="td">학과</td>
								<td class="td-input">{dept}</td>
							</tr>
							<tr>
								<td class="td">학번</td>
								<td class="td-input">{userNum}</td>
							</tr>
							<tr>
								<td class="td">학년</td>
								<td class="td-input">
									<select class = "grade" name="grade"> {grade}
										<option value={1}>1학년</option><option value={2}>2학년</option>
										<option value={3}>3학년</option><option value={4}>4학년</option>
									</select>
						    	<input type="submit" class="info-edit" value="수정" />
								</td>         
							</tr>
							<tr>
								<td class="td">재학 상태</td>
								<td class="td-input">
									<select class = "state" name="state"> {state}
										<option value={1}>재학</option>
										<option value={2}>군휴학</option>
										<option value={3}>휴학</option>
									</select>
              					<input type="submit" class="info-edit" value="수정" />
								</td>         
							</tr>
							<tr>
								<td class="td">전화번호</td>
								<td class="td-input">
									<input type="text" class="userTel" placeholder="전화번호" name="userTel1" maxlength="3">{setUserTel1}</input>
									<span class = "hyphen">-</span>		
									<input type="text" class="userTel" name="userTel2" maxlength="4">{setUserTel2}</input>
									<span class = "hyphen">-</span>		
									<input type="text" class="userTel" name="userTel3" maxlength="4">{setUserTel3}</input>
              						<input type="submit" class="info-edit" value="수정" />
								</td>
							</tr>
							<tr>
								<td class="td">권한</td>
								<td class="td-input">{state}</td>
							</tr>
						</tbody>
					</table>
				</div>
		</section>
	)
}
		


export default UserInfoPage;