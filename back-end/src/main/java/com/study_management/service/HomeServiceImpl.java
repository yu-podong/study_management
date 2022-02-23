package com.study_management.service;

import com.study_management.DAO.UserDAO;
import com.study_management.domain.UserDTO;
import com.study_management.service.UserService;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.Hashtable;

@Service
public class HomeServiceImpl implements HomeService {

    @Inject
    @Autowired
    private final UserDAO userDAO;

    @Autowired private static Hashtable<String, String> loginUsers = new Hashtable<String, String>();

    @Inject
    public HomeServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    // 회원가입
    @Override
    public void register(UserDTO userDTO) throws Exception {

        userDTO.setUserID(userDTO.getUserID());
        userDTO.setPassword(userDTO.getPassword());
        userDTO.setAutho(userDTO.getAutho());
        userDTO.setGender(userDTO.getGender());
        userDTO.setGrade(userDTO.getGrade());
        userDTO.setState(userDTO.getState());
        userDTO.setUserNum(userDTO.getUserNum());
        userDTO.setDept(userDTO.getDept());
        userDTO.setUserEmail(userDTO.getUserEmail());
        userDTO.setUserName(userDTO.getUserName());
        userDTO.setUserTel(userDTO.getUserTel());

        userDAO.register(userDTO);

    }
    // 로그인
    @Override
    public boolean login(UserDTO userDTO, HttpSession httpSession) throws Exception {
        return userDAO.login(userDTO, httpSession);
    }
    // 비밀번호 이메일 발송
    @Override
    public void sendEmail(UserDTO userDTO, String div) throws Exception {
        String charSet = "utf-8";
        String hostSMTP = "smtp.naver.com"; //구글 이용시 smtp.gmail.com
        String hostSMTPid = "studymngadm@naver.com"; // 서버 이메일 주소(보내는 사람 이메일 주소)
        String hostSMTPpw = "adminadmin1!"; // 서버 이메일 비번(보내는 사람 이메일 비번)

        // 보내는 사람 EMail, 제목, 내용
        String fromEmail = "studymngadm@naver.com"; // 보내는 사람 이메일주소(받는 사람 이메일에 표시됨)
        String fromName = "STUDY MANAGEMENT"; // 프로젝트이름 또는 보내는 사람 이름
        String subject = "";
        String msg = "";

        if(div.equals("findPassword")) {
            subject = "[STUDY MANAGEMENT] 비밀번호 안내";
            msg += "<div align='center' style='border:1px solid black; font-family:verdana'>";
            msg += "<h3 style='color: blue;'>";
            msg += userDTO.getUserName() + "님의 비밀번호 입니다.</h3>";
            msg += "<p>비밀번호 : ";
            msg += userDTO.getPassword() + "</p></div>";
        }

        // 받는 사람 E-Mail 주소
        String mail = userDTO.getUserEmail();
        try {
            HtmlEmail email = new HtmlEmail();
            email.setDebug(true);
            email.setCharset(charSet);
            email.setSSL(true);
            email.setHostName(hostSMTP);
            email.setSmtpPort(587); //구글 이용시 465

            email.setAuthentication(hostSMTPid, hostSMTPpw);
            email.setTLS(true);
            email.addTo(mail, charSet);
            email.setFrom(fromEmail, fromName, charSet);
            email.setSubject(subject);
            email.setHtmlMsg(msg);
            email.send();
        } catch (Exception e) {
            System.out.println("메일발송 실패 : " + e);
        }
    }

    /*

    // 아이디 중복확인
    @Override
    public UserDAO idCheck(Integer UserID) throws Exception {
        return userDAO.idCheck(UserID);
    }
    // 새 비밀번호 발급
    @Override
    public void findPassword(HttpServletResponse response, UserDTO userDTO) throws Exception {
        response.setContentType("text/html;charset=utf-8");

        UserDTO dto = userDAO.readUserInfo(userDTO.getUserID());
        PrintWriter out = response.getWriter();
        // 가입된 아이디가 없으면
        if(userDAO.idCheck(userDTO.getUserID()) == null) {
            out.print("등록되지 않은 아이디입니다.");
            out.close();
        }
        // 가입된 이메일이 아니면
        else if(!userDTO.getUserEmail().equals(dto.getUserEmail())) {
            out.print("등록되지 않은 이메일입니다.");
            out.close();
        }else {
            // 임시 비밀번호 생성
            String pw = "";
            for (int i = 0; i < 12; i++) {
                pw += (char) ((Math.random() * 26) + 97);
            }
            userDTO.setPassword(pw);
            // 비밀번호 변경
            userDAO.updatePassword(userDTO);
            // 비밀번호 변경 메일 발송
            sendEmail(userDTO, "findpassword");

            out.print("이메일로 비밀번호를 발송하였습니다.");
            out.close();
        }
    }*/

    /*public String updatePassword(UserDTO userDTO) throws Exception { return userDAO.modifyPassword(userDTO); }*/
    // 로그아웃
    @Override
    public void logout(HttpSession session)throws Exception {
        loginUsers.remove(session.getId());
        session.invalidate();
    }

}
