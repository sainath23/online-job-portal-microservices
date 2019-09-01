package com.doitgeek.companyprofileservice.service;

import com.doitgeek.companyprofileservice.entity.RecruiterProfile;

import java.util.List;
import java.util.Optional;

public interface RecruiterProfileService {
    Optional<RecruiterProfile> findById(Long id);
    List<RecruiterProfile> findAll();
    RecruiterProfile save(RecruiterProfile recruiterProfile);
    void deleteById(Long id);
    RecruiterProfile updateById(Long id, RecruiterProfile recruiterProfile);
}
