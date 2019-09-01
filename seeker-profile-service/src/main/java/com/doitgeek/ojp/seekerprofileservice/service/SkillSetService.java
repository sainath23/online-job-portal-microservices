package com.doitgeek.ojp.seekerprofileservice.service;

import com.doitgeek.ojp.seekerprofileservice.entity.SkillSet;

import java.util.List;
import java.util.Optional;

public interface SkillSetService {
    Optional<SkillSet> findById(Long id);
    List<SkillSet> findAll();
    SkillSet save(SkillSet skillSet);
    void deleteById(Long id);
    SkillSet updateById(Long id, SkillSet skillSet);
}
