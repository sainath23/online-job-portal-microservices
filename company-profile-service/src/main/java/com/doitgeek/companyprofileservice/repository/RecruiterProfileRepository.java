package com.doitgeek.companyprofileservice.repository;

import com.doitgeek.companyprofileservice.entity.RecruiterProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterProfileRepository extends JpaRepository<RecruiterProfile, Long> {
}
