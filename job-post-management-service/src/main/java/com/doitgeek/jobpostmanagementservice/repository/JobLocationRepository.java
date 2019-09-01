package com.doitgeek.jobpostmanagementservice.repository;

import com.doitgeek.jobpostmanagementservice.entity.JobLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobLocationRepository extends JpaRepository<JobLocation, Long> {
}
