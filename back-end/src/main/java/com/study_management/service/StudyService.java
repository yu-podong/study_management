package com.study_management.service;

import com.study_management.domain.StudyDTO;
import com.study_management.domain.StudyMemDTO;
import com.study_management.domain.StudyRegDTO;

import java.util.List;

public interface StudyService {
    //
    public List<StudyDTO> getList();

    //
    public void create(StudyDTO study);

    //
    public void apply(StudyRegDTO reg);

    //
    public StudyDTO mainPage(Integer studyID);

    //
    public List<StudyMemDTO> member(Integer studyID);
    public List<StudyRegDTO> regMember(Integer studyID);

    //
    public void modifyIsReg(Integer regID, StudyMemDTO mem);

    //
    public void modifyAutho(Integer memID, Integer authoNum);
}
