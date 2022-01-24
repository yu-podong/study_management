<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--http://localhost:8001/test.jsp-->

<!DOCTYPE html>
<html lang="en">
<head>
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">

	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="./style.css">
	<title>Document</title>
</head>
<body>
	<section class="study-list">
		<!-- 왼쪽 바-->
		<ul class="nav-bar">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
		<!-- 오른쪽 영역-->
		<div class="right-part">
			<!-- title -->
			<div class="title">
				<span>[동아리]에서 진행중인 스터디</span>
				<span>아래 스터디들의 정보를 보고 원하는 스터디에 가입하세요 :)</span>
			</div>
			<!-- body -->
			<div class="list-part">
				<!-- table 상단-->
				<div></div>
				<!-- 스터디 리스트 공간-->
				<ul class="list">
					<% for(int i = 0; i< 4; i++) { %>
						<li class="items">
							<span>✨React Study✨</span>
							<span>React를 공부하면서, 개인 프로젝트를 진행합니다.</span>
							<span>3,4학년</span>
							<span>10명</span>
							<span>활성률</span>
							<span class="register-btn">신청</span>
						</li>
					<% } %>
				</ul>
			</div>
		</div>
	</section>
</body>
</html>