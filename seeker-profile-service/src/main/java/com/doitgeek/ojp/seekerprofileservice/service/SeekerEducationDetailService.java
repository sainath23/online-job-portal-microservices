package com.doitgeek.ojp.seekerprofileservice.service;

import com.doitgeek.ojp.seekerprofileservice.entity.SeekerEducationDetail;
import com.doitgeek.ojp.seekerprofileservice.model.SeekerProfileModel;

import java.util.List;
import java.util.Optional;

public interface SeekerEducationDetailService {
    Optional<SeekerEducationDetail> findById(Long id);
    List<SeekerEducationDetail> findAll();
    SeekerEducationDetail save(SeekerEducationDetail seekerEducationDetail);
    void deleteById(Long id);
    SeekerEducationDetail updateById(Long id, SeekerEducationDetail seekerEducationDetail);
    SeekerEducationDetail createSeekerEducationProfile(Long id, SeekerProfileModel seekerProfileModel);
}
