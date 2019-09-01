package com.doitgeek.jobpostmanagementservice.service;

import com.doitgeek.jobpostmanagementservice.entity.JobType;

import java.util.List;
import java.util.Optional;

public interface JobTypeService {
    Optional<JobType> findById(Long id);
    List<JobType> findAll();
    JobType save(JobType jobType);
    void deleteById(Long id);
    JobType updateById(Long id, JobType jobType);
}
