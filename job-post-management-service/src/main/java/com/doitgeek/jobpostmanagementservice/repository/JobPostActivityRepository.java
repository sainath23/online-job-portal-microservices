package com.doitgeek.jobpostmanagementservice.repository;

import com.doitgeek.jobpostmanagementservice.entity.JobPostActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostActivityRepository extends JpaRepository<JobPostActivity, Long> {
}
