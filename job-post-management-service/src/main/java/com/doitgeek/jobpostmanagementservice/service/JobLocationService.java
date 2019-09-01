package com.doitgeek.jobpostmanagementservice.service;

import com.doitgeek.jobpostmanagementservice.entity.JobLocation;

import java.util.List;
import java.util.Optional;

public interface JobLocationService {
    Optional<JobLocation> findById(Long id);
    List<JobLocation> findAll();
    JobLocation save(JobLocation jobLocation);
    void deleteById(Long id);
    JobLocation updateById(Long id, JobLocation jobLocation);
}
