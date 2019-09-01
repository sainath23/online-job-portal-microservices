package com.doitgeek.ojp.seekerprofileservice.service;

import com.doitgeek.ojp.seekerprofileservice.entity.SeekerExperienceDetail;
import com.doitgeek.ojp.seekerprofileservice.model.SeekerProfileModel;

import java.util.List;
import java.util.Optional;

public interface SeekerExperienceDetailService {
    Optional<SeekerExperienceDetail> findById(Long id);
    List<SeekerExperienceDetail> findAll();
    SeekerExperienceDetail save(SeekerExperienceDetail seekerExperienceDetail);
    void deleteById(Long id);
    SeekerExperienceDetail updateById(Long id, SeekerExperienceDetail seekerExperienceDetail);
    SeekerExperienceDetail createSeekerExperienceProfile(Long id, SeekerProfileModel seekerProfileModel);
}
