package com.doitgeek.jobpostmanagementservice.service;

import com.doitgeek.jobpostmanagementservice.entity.JobPost;
import com.doitgeek.jobpostmanagementservice.repository.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobPostServiceImpl implements JobPostService {

    private JobPostRepository jobPostRepository;

    @Autowired
    public JobPostServiceImpl(JobPostRepository jobPostRepository) {
        this.jobPostRepository = jobPostRepository;
    }

    @Override
    public Optional<JobPost> findById(Long id) {
        return jobPostRepository.findById(id);
    }

    @Override
    public List<JobPost> findAll() {
        return jobPostRepository.findAll();
    }

    @Override
    public JobPost save(JobPost jobPost) {
        return jobPostRepository.save(jobPost);
    }

    @Override
    public void deleteById(Long id) {
        jobPostRepository.deleteById(id);
    }

    @Override
    public JobPost updateById(Long id, JobPost jobPost) {
        return null;
    }
}
