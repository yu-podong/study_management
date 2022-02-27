import {Link} from 'react-router-dom';
import React, { useState } from "react";

import '../App.css';
import '../style/main.css';

function MainPage() {

  const dispatch = useDispatch();

  const [userNum, setUserNum] = useState(" ");
  const [Password, setPassword] = useState(" ");

  useEffect(() => { 
    fetch("/hello") 
      .then((response) => { 
        return response.json(); 
      }) 
      .then(function (data) { 
        setMessage(data); 
      }); 
    }, []);

  return (
    <section class="main">
      {/* 왼쪽 영역 */}
      <div class="left-part">
        <div class="title">
          <span>STUDY<br/>MANAGEMENT</span>
        </div>				
        <div class="foreword">
          <span>여러분들이 운영하는 스터디를 조금 더 체계적으로 <br/>관리할 수 있도록 도움을 줍니다. <br/>
          <br/>해당 서비스를 이용하여 앞으로도 <br/>스터디를 잘 이끌어 주세요😊</span>				
        </div>
      </div>
      
      {/* 오른쪽 영역 */}
      <div class="right-part">
        <div class="login">
          {/* 로그인 창 */}
          <div class = "content">	
            <span class = "top"><b>LOGIN</b></span>
          
            <form class = "input">
              <input type="text" id="form-control" placeholder="학번" name="userNum" maxlength="20">{userNum}</input>
              <br/><br/>
              <input type="password" id="form-control" placeholder="Password" name="password" maxlength="20">{password}</input>

              <input type="submit" class="login-btn" value="로그인" />
            </form>
              
            <Link to='/findpassword' class="find-btn">PW 찾기</Link>
            <Link to="/register" class="register-btn" >회원가입</Link>
              
            <div class = "non-member">
              <span>회원이 아닌가요?<br/></span>
              <Link to="/study/list" class="nonmem-btn">비회원으로 입장하기</Link>
            </div>	
              
          </div>				
        </div>												
      </div>
      
    </section>
  );
}

export default MainPage;
