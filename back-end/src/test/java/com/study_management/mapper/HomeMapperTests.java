package com.study_management.mapper;

import com.study_management.domain.UserDTO;
import lombok.Setter;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.log4j.Log4j;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.servlet.http.HttpSession;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class HomeMapperTests {
    @Setter(onMethod_ = @Autowired)
    private HomeMapper mapper;

    @Test
    public void testRegister() {

        log.info("testRegister");
        UserDTO reg = new UserDTO();
        reg.setPassword("1234");
        reg.setDept("소프트웨어학과");
        reg.setGender(2);
        reg.setGrade(4);
        reg.setState(1);
        reg.setUserEmail("user06@naver.com");
        reg.setUserNum(2019038002);
        reg.setUserName("사용자6");
        reg.setUserTel("01000000006");
        reg.setAutho(4);

        mapper.register(reg);
        log.info(reg);

    }

    @Test
    public void testLogin() {

        log.info("testLogin");

    }

}
