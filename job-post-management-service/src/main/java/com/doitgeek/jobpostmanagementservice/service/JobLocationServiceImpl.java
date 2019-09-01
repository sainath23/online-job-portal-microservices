package com.doitgeek.jobpostmanagementservice.service;

import com.doitgeek.jobpostmanagementservice.entity.JobLocation;
import com.doitgeek.jobpostmanagementservice.repository.JobLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobLocationServiceImpl implements JobLocationService {

    private JobLocationRepository jobLocationRepository;

    @Autowired
    public JobLocationServiceImpl(JobLocationRepository jobLocationRepository) {
        this.jobLocationRepository = jobLocationRepository;
    }

    @Override
    public Optional<JobLocation> findById(Long id) {
        return jobLocationRepository.findById(id);
    }

    @Override
    public List<JobLocation> findAll() {
        return jobLocationRepository.findAll();
    }

    @Override
    public JobLocation save(JobLocation jobLocation) {
        return jobLocationRepository.save(jobLocation);
    }

    @Override
    public void deleteById(Long id) {
        jobLocationRepository.deleteById(id);
    }

    @Override
    public JobLocation updateById(Long id, JobLocation jobLocation) {
        return null;
    }
}
