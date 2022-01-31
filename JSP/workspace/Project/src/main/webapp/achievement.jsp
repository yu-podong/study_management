<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%> 
    
<!DOCTYPE html>
<html lang="en">
<head>
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.3/css/all.css" 
        integrity="sha384-SZXxX4whJ79/gErwcOYf+zWLeJdY/qpuqC4cAa9rOGUstPomtqpuNWT9wdPEn2fk" crossorigin="anonymous"/>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="./achievement.css">
	<title>StudyPlan 정보</title>
</head>
<body>
	<section class="study-plan">
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
				<span>StudyPlan 정보</span>
				<span>스터디에 대한 설명 작성란...</span>
			</div>
			<!-- body -->
			<div class="menu">
				<!-- table 상단-->
				<span class="menu-item"><a href="#" class="menu-link">Main</a></span> 
				<span class="menu-item"><a href="#" class="now-menu-link">달성률</a></span> 
				<span class="menu-item"><a href="#" class="menu-link">질문공간</a></span> 
				<span class="menu-item"><a href="#" class="menu-link">참여인원</a></span> 
				<span class="menu-item"><a href="StudyPlanWrite.jsp" class="menu-link">Plan 작성</a></span> 
			</div>
		    <!-- table 하단-->
			<div class="achi-plan-info">
			   <div class="achi-info"> <!-- achievement rate-->
			       <div class="weekly-rate">
			           <div class="weekly-rate-title">
			               Weekly Plan<br>Achievement rate</div>  
			             
			           <div class="weekly-achi-rate">
	                       <div class="weekly-rate1">
		                       <span class="weekly-rate-date1">8월 1주</span>
		                       <i class="far fa-circle"></i>
		                       <span class="weekly-achi-rate1"></span>
	                       </div>
	                       
	                       <div class="weekly-rate2">
		                       <span class="weekly-rate-date2">8월 2주</span>
		                       <i class="far fa-circle"></i>
		                       <span class="weekly-achi-rate2"></span>
	                       </div>
	
	                       <div class="weekly-rate3">
		                       <span class="weekly-rate-date3">8월 3주</span>
		                       <i class="far fa-circle"></i>
		                       <span class="weekly-achi-rate3"></span>
	                       </div>
                       </div>
	                </div> 
	                   
			       <div class="monthly-rate">
			           <div class="monthly-rate-title">
			               Monthly Plan<br>Achievement rate</div>  
			           
			           <ul class="monthly-achi">
			               <li class="monthly-achi1">
			                   <span class="monthly-date1">1월</span>
			                   <span class="monthly-achi-count1">달성목표개수/총목표</span>
			                   <div class="progress-bar">           
                                   <div class="progress"></div>
                               </div>
			               </li>
			               <li class="monthly-achi2">
			                   <span class="monthly-date2">2월</span>
			                   <span class="monthly-achi-count2">달성목표개수/총목표</span>
			                   <div class="progress-bar">           
                                   <div class="progress"></div>
                               </div>
			               </li>
			               <li class="monthly-achi3">
			                   <span class="monthly-date3">3월</span>
			                   <span class="monthly-achi-count3">달성목표개수/총목표</span>
			                   <div class="progress-bar">           
                                   <div class="progress"></div>
                               </div>
			               </li>
			           </ul>
			       </div>
			   </div>
			   
			   <div class="plan-info"> <!-- plan&userList-->
			        <div class="monthly-plan">
			            <span class="monthly-plan-title">Monthly Plan</span>
			               
			            <div class="monthly-plan-box">
			                <div class="monthly-plan-date-btn">
			                    <i class="fas fa-chevron-left"></i>
			                    <span class="monthly-plan-date">2021년 8월</span>
			                    <i class="fas fa-chevron-right"></i>
			               </div>
			              
			                <div class="monthly-check-list">
			                    <ul>
			           	            <li class="list">
			           		            <i class="far fa-square"></i>
			           		            <div class="text">&nbsp;&nbsp;</div>
			           	            </li>
			           	            <li class="list">
			           		            <i class="far fa-square"></i>
			           		            <div class="text">&nbsp;&nbsp;</div>
			           	            </li>
			           	            <li class="list">
			           		            <i class="far fa-square"></i>
			           		            <div class="text">&nbsp;&nbsp;</div>
			           	            </li>
			           	            <li class="list">
			           		            <i class="far fa-square"></i>
			           		            <div class="text">&nbsp;&nbsp;</div>
			           	            </li>
			           	            <li class="list">
			           		            <i class="far fa-square"></i>
			           		            <div class="text">&nbsp;&nbsp;</div>
			           	            </li>
			                    </ul>
			               </div>
			           </div>
			       </div>
			       
			       <div class="weekly-info"> <!-- weeklyPlan&userList-->
			            <div class="weekly-plan">
			                <span class="weekly-plan-title">Weekly Plan</span>
			                   
			                <div class="weekly-plan-box">    
			                    <div class="weekly-plan-date-btn">
			                        <i class="fas fa-chevron-left"></i>
			                        <span class="weekly-plan-date">2021년 8월 2주차</span>
			                        <i class="fas fa-chevron-right"></i>
			                    </div>
			                   
			                    <div class="weekly-check-list">
			                        <ul>
			           	                <li class="list">
			           		                <i class="far fa-square"></i>
			           		                <div class="text">&nbsp;&nbsp;</div>
			           	                </li>
			           	                <li class="list">
			           		                <i class="far fa-square"></i>
			           		                <div class="text">&nbsp;&nbsp;</div>
			           	                </li>
			           	                <li class="list">
			           		                <i class="far fa-square"></i>
			           		                <div class="text">&nbsp;&nbsp;</div>
			           	                </li>
			           	                <li class="list">
			           		                <i class="far fa-square"></i>
			           		                <div class="text">&nbsp;&nbsp;</div>
			           	                </li>
			           	                <li class="list">
			           		                <i class="far fa-square"></i>
			           		                <div class="text">&nbsp;&nbsp;</div>
			           	                </li>
			                        </ul>   
			                    </div>
			                </div>
			           </div> 

			           <ul class="user-list">
			                <li class="user-list-detail1">
			                    <i class="fas fa-user-circle"></i>
			                    <span class="user-name">userName</span>
			                    <span class="user-autho">master</span>
			                    <span class="user-achi">success/total</span>
			                </li>
			                <li class="user-list-detail2">
			                    <i class="fas fa-user-circle"></i>
			                    <span class="user-name">userName</span>
			                    <span class="user-autho">master</span>
			                    <span class="user-achi">success/total</span>
			                </li>
			                <li class="user-list-detail3">
			                    <i class="fas fa-user-circle"></i>
			                    <span class="user-name">userName</span>
			                    <span class="user-autho">member</span>
			                    <span class="user-achi">success/total</span>
			                </li>
			            </ul>
                   </div>
			   </div>
            </div>
		</div>
	</section>
</body>
</html>