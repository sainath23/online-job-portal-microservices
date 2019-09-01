package com.doitgeek.jobpostmanagementservice.repository;

import com.doitgeek.jobpostmanagementservice.entity.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostRepository extends JpaRepository<JobPost, Long> {
}
