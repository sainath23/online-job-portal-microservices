package com.doitgeek.jobpostmanagementservice.service;

import com.doitgeek.jobpostmanagementservice.entity.JobPostActivity;
import com.doitgeek.jobpostmanagementservice.repository.JobPostActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobPostActivityServiceImpl implements JobPostActivityService {

    private JobPostActivityRepository jobPostActivityRepository;

    @Autowired
    public JobPostActivityServiceImpl(JobPostActivityRepository jobPostActivityRepository) {
        this.jobPostActivityRepository = jobPostActivityRepository;
    }

    @Override
    public Optional<JobPostActivity> findById(Long id) {
        return jobPostActivityRepository.findById(id);
    }

    @Override
    public List<JobPostActivity> findAll() {
        return jobPostActivityRepository.findAll();
    }

    @Override
    public JobPostActivity save(JobPostActivity jobPostActivity) {
        return jobPostActivityRepository.save(jobPostActivity);
    }

    @Override
    public void deleteById(Long id) {
        jobPostActivityRepository.deleteById(id);
    }

    @Override
    public JobPostActivity updateById(Long id, JobPostActivity jobPostActivity) {
        return null;
    }
}
