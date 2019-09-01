package com.doitgeek.jobpostmanagementservice.service;

import com.doitgeek.jobpostmanagementservice.entity.JobType;
import com.doitgeek.jobpostmanagementservice.repository.JobTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTypeServiceImpl implements JobTypeService {

    private JobTypeRepository jobTypeRepository;

    @Autowired
    public JobTypeServiceImpl(JobTypeRepository jobTypeRepository) {
        this.jobTypeRepository = jobTypeRepository;
    }

    @Override
    public Optional<JobType> findById(Long id) {
        return jobTypeRepository.findById(id);
    }

    @Override
    public List<JobType> findAll() {
        return jobTypeRepository.findAll();
    }

    @Override
    public JobType save(JobType jobType) {
        return jobTypeRepository.save(jobType);
    }

    @Override
    public void deleteById(Long id) {
        jobTypeRepository.deleteById(id);
    }

    @Override
    public JobType updateById(Long id, JobType jobType) {
        return null;
    }
}
