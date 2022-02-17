package com.study_management.mapper;

import com.study_management.domain.StudyDTO;
import com.study_management.domain.StudyMemDTO;
import com.study_management.domain.StudyRegDTO;

import java.util.List;

public interface StudyMapper {
    public List<StudyDTO> getList();

    public void create(StudyDTO study);

    public void insertReg(StudyRegDTO reg);

    public StudyDTO get(Integer studyID);

    public List<StudyMemDTO> getListMember(Integer studyID);
    public List<StudyRegDTO> getListRegMember(Integer studyID);

    public void deleteReg(Integer regID);
    public void createMem(StudyMemDTO reg);

    public void updateAutho(Integer memID);
}
