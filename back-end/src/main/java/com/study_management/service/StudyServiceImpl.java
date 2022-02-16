package com.study_management.service;

import com.study_management.domain.StudyDTO;
import com.study_management.domain.StudyMemDTO;
import com.study_management.domain.StudyRegDTO;
import com.study_management.mapper.StudyMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudyServiceImpl implements StudyService {
    private StudyMapper mapper;

    @Override
    public List<StudyDTO> getList() {
        return mapper.getList();
    }

    @Override
    public void create(StudyDTO study) {
        mapper.create(study);
    }

    @Override
    public void apply(StudyRegDTO reg) {
        mapper.insertReg(reg);
    }

    @Override
    public StudyDTO mainPage(Integer studyID) {
        return mapper.get(studyID);
    }

    @Override
    public List<StudyMemDTO> member(Integer studyID) {
        return mapper.getListMember(studyID);
    }

    @Override
    public List<StudyRegDTO> regMember(Integer studyID) {
        return mapper.getListRegMember(studyID);
    }

    @Override
    public void modifyIsReg(Integer regID, StudyMemDTO mem) {
        mapper.deleteReg(regID);

        if(mem.getStudyAutho() > 0) {
            mapper.createMem(mem);
        }
    }

    @Override
    public void modifyAutho(Integer memID, Integer authoNum) {
        mapper.updateAutho(memID);
    }
}
