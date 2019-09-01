package com.doitgeek.jobpostmanagementservice.repository;

import com.doitgeek.jobpostmanagementservice.entity.JobType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTypeRepository extends JpaRepository<JobType, Long> {
}
