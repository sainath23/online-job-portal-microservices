package com.doitgeek.ojp.seekerprofileservice.service;

import com.doitgeek.ojp.seekerprofileservice.entity.SeekerSkillSet;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeekerSkillSetServiceImpl implements SeekerSkillSetService {
    @Override
    public Optional<SeekerSkillSet> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<SeekerSkillSet> findAll() {
        return null;
    }

    @Override
    public SeekerSkillSet save(SeekerSkillSet seekerSkillSet) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public SeekerSkillSet updateById(Long id, SeekerSkillSet seekerSkillSet) {
        return null;
    }
}
