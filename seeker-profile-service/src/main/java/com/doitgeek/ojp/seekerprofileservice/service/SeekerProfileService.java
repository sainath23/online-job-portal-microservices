package com.doitgeek.ojp.seekerprofileservice.service;

import com.doitgeek.ojp.seekerprofileservice.entity.SeekerProfile;
import com.doitgeek.ojp.seekerprofileservice.model.SeekerProfileModel;

import java.util.List;
import java.util.Optional;

public interface SeekerProfileService {
    Optional<SeekerProfile> findById(Long id);
    List<SeekerProfile> findAll();
    SeekerProfile save(SeekerProfile seekerProfile);
    void deleteById(Long id);
    SeekerProfile updateById(Long id, SeekerProfile seekerProfile);
    SeekerProfile createBasicSeekerProfile(Long id, SeekerProfileModel seekerProfileModel);
}
