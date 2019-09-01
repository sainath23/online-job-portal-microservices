package com.doitgeek.jobpostmanagementservice.service;

import com.doitgeek.jobpostmanagementservice.entity.JobPostActivity;

import java.util.List;
import java.util.Optional;

public interface JobPostActivityService {
    Optional<JobPostActivity> findById(Long id);
    List<JobPostActivity> findAll();
    JobPostActivity save(JobPostActivity jobPostActivity);
    void deleteById(Long id);
    JobPostActivity updateById(Long id, JobPostActivity jobPostActivity);
}
