import '../style/register.css'
import {Link} from 'react-router-dom';
import React, { useState } from "react";

function RegisterPage() {
	const [userName, setUserName] = useState("");
	const [gender, setGender]= useState("");
	
	const [userTel1, setUserTel1] = useState("");
	const [userTel2, setUserTel2] = useState("");
	const [userTel3, setUserTel3] = useState("");
	
	const [userNum, setUserNum] = useState("");
	const [userEmail, setUserEmail] = useState("");
	const [password, setPassword] = useState("");	
	
	const [grade, setGrade] = useState("");
	const [state, setState] = useState("");
	const [dept, setDept] = useState("");


	return (
		<section class = "main">
		<div class="register">
				{/* 회원가입 창 */}
				<form class = "content">	
					<span class = "top">REGISTER</span>
				
					<fieldset class = "personal-info">
						<span class = "text">개인 정보</span>		
						<br/>		
						<input type="text" class="input-name" placeholder="이름" name="userName" maxlength="20"/>
						<input type='checkbox' class="check-gender" name='gender' value={1}/>
						<span class = "gender">남</span>
						<input type='checkbox' class="check-gender" name='gender' value={2}/>
						<span class = "gender">여</span>		
						
						<br/><br/>
						<input type="text" class="form-control" placeholder="전화번호" name="userTel1" maxlength="3"/>
						<span class = "hyphen"> - </span>		
						<input type="text" class="form-control" name="userTel2" maxlength="4"/>
						<span class = "hyphen"> - </span>		
						<input type="text" class="form-control" name="userTel3" maxlength="4"/>
					</fieldset>
					
					<fieldset class = "usage-info">
						<span class = "text">이용 정보</span>				
						<input type="text" class="form-control" placeholder="학번" name="userNum" maxlength="20"/>
						<br/><br/>
						<input type="text" class="form-control" placeholder="네이버 이메일" name="userEmail" maxlength="45"/>
						<br/><br/>
						<input type="password" class="form-control" placeholder="비밀번호" name="password" maxlength="20"/>
					</fieldset>
					
					<fieldset class = "dept-info">
						<span class = "text">학부 정보 (가입일 기준)</span>	
						<br/><br/>										
						<select class = "grade" name="grade">
							<option value={1}>1</option><option value={2}>2</option>
							<option value={3}>3</option><option value={4}>4</option>
						</select>
						<span class = "grade">학년</span>		
						<br/>									
						<input type='checkbox' class="check-state" name='state' value={1} />
						<span class = "state">재학</span>	
  						<input type='checkbox' class="check-state" name='state' value={2} />
						<span class = "state">군휴학</span>	
  						<input type='checkbox' class="check-state" name='state' value={3} />
  						<span class = "state">휴학</span>	
  						<br/>
						<input type="text" class="form-control" placeholder="학과(부)" name="dept" maxlength="20"/>						
					</fieldset>
					<input type="submit" class="register-btn" value="가입하기" />
				</form>				
			</div>
			</section>
	)
}

export default RegisterPage;