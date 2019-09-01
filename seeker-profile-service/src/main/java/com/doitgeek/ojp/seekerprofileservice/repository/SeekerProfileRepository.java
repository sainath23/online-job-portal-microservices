package com.doitgeek.ojp.seekerprofileservice.repository;

import com.doitgeek.ojp.seekerprofileservice.entity.SeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeekerProfileRepository extends JpaRepository<SeekerProfile, Long> {
}
