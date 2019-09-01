package com.doitgeek.ojp.seekerprofileservice.service;

import com.doitgeek.ojp.seekerprofileservice.entity.SeekerSkillSet;

import java.util.List;
import java.util.Optional;

public interface SeekerSkillSetService {
    Optional<SeekerSkillSet> findById(Long id);
    List<SeekerSkillSet> findAll();
    SeekerSkillSet save(SeekerSkillSet seekerSkillSet);
    void deleteById(Long id);
    SeekerSkillSet updateById(Long id, SeekerSkillSet seekerSkillSet);
}
