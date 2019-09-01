package com.doitgeek.companyprofileservice.service;

import com.doitgeek.companyprofileservice.entity.RecruiterProfile;
import com.doitgeek.companyprofileservice.repository.RecruiterProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecruiterProfileServiceImpl implements RecruiterProfileService {

    private RecruiterProfileRepository recruiterProfileRepository;

    @Autowired
    public RecruiterProfileServiceImpl(RecruiterProfileRepository recruiterProfileRepository) {
        this.recruiterProfileRepository = recruiterProfileRepository;
    }

    @Override
    public Optional<RecruiterProfile> findById(Long id) {
        return recruiterProfileRepository.findById(id);
    }

    @Override
    public List<RecruiterProfile> findAll() {
        return recruiterProfileRepository.findAll();
    }

    @Override
    public RecruiterProfile save(RecruiterProfile recruiterProfile) {
        return recruiterProfileRepository.save(recruiterProfile);
    }

    @Override
    public void deleteById(Long id) {
        recruiterProfileRepository.deleteById(id);
    }

    @Override
    public RecruiterProfile updateById(Long id, RecruiterProfile recruiterProfile) {
        return null;
    }
}
