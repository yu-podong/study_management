package com.study_management.mapper;

import com.study_management.domain.StudyDTO;
import com.study_management.domain.StudyMemDTO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j

public class StudyMapperTest {
    @Setter(onMethod_ = @Autowired)
    private StudyMapper mapper;

    @Test
    public void testInsertStudy() {
        StudyDTO testStudy = new StudyDTO();

        log.info("Testing insert Study");

        testStudy.setStudyID(5);
        testStudy.setStudyName("React 프로젝트 개발 스터디");
        testStudy.setSimpleDesc("싱글 or 팀 단위로 react 프로젝트 개발 및 피드백");
        testStudy.setDetail("test detail 내용");
        testStudy.setRecomGra(3);
        testStudy.setMaxMem(10);
        testStudy.setTime("수요일 17:00~19:00");
        testStudy.setIsGrant(false);
        testStudy.setIsQues1(true);
        testStudy.setIsQues2(true);
        testStudy.setIsQues3(true);
        testStudy.setAddQues("test Question");
        testStudy.setCountQues(3);

        mapper.create(testStudy);
    }

    @Test
    public void testInsertMem() {
        StudyMemDTO testMem= new StudyMemDTO();

        log.info("mapper test");

        testMem.setStudyID(1);
        testMem.setUserID(1);
        testMem.setStudyAutho(4);

        mapper.createMem(testMem);
    }
}
