package com.doitgeek.jobpostmanagementservice.service;

import com.doitgeek.jobpostmanagementservice.entity.JobPost;

import java.util.List;
import java.util.Optional;

public interface JobPostService {
    Optional<JobPost> findById(Long id);
    List<JobPost> findAll();
    JobPost save(JobPost jobPost);
    void deleteById(Long id);
    JobPost updateById(Long id, JobPost jobPost);
}
