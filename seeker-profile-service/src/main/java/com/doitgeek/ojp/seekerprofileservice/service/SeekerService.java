package com.doitgeek.ojp.seekerprofileservice.service;

import com.doitgeek.ojp.seekerprofileservice.entity.SeekerProfile;
import com.doitgeek.ojp.seekerprofileservice.model.SeekerProfileModel;

public interface SeekerService {
    SeekerProfile createSeekerProfile(Long id, SeekerProfileModel seekerProfileModel);
}
