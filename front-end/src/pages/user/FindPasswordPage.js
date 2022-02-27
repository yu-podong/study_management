import '../../style/findPassword.css'

function FindPasswordPage() {
	return (
		<section class = "main">
		<div class="findPassword">
				{/* 비밀번호 찾기 창 */}
				<form class = "content">	
					<span class = "top">비밀번호 찾기</span>
				
						<br/><br/><br/>				
						<input type="text" class="form-control" placeholder="이름" name="userName" maxlength="20"/>					
						<br/><br/>
						<input type="text" class="form-control" placeholder="학번" name="userNum" maxlength="20"/>
						<br/><br/>
						<input type="text" class="form-control" placeholder="네이버 이메일" name="userEmail" maxlength="45"/>
						<br/><br/>
					
					<input type="submit" class="find-btn" value="이메일 전송"/>
				</form>				
			</div>
			</section>
	)
}

export default FindPasswordPage;