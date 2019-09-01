package com.doitgeek.ojp.seekerprofileservice.service;

import com.doitgeek.ojp.seekerprofileservice.entity.SkillSet;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillSetServiceImpl implements SkillSetService {
    @Override
    public Optional<SkillSet> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<SkillSet> findAll() {
        return null;
    }

    @Override
    public SkillSet save(SkillSet skillSet) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public SkillSet updateById(Long id, SkillSet skillSet) {
        return null;
    }
}
