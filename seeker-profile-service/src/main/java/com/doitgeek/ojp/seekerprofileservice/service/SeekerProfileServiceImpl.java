package com.doitgeek.ojp.seekerprofileservice.service;

import com.doitgeek.ojp.seekerprofileservice.client.UserManagementClient;
import com.doitgeek.ojp.seekerprofileservice.entity.SeekerProfile;
import com.doitgeek.ojp.seekerprofileservice.model.ApiResponseModel;
import com.doitgeek.ojp.seekerprofileservice.model.SeekerProfileModel;
import com.doitgeek.ojp.seekerprofileservice.model.UserAccountModel;
import com.doitgeek.ojp.seekerprofileservice.repository.SeekerProfileRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SeekerProfileServiceImpl implements SeekerProfileService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SeekerProfileServiceImpl.class);

    private SeekerProfileRepository seekerProfileRepository;
    private UserManagementClient userManagementClient;

    @Autowired
    public SeekerProfileServiceImpl(SeekerProfileRepository seekerProfileRepository,
                                    UserManagementClient userManagementClient) {
        this.seekerProfileRepository = seekerProfileRepository;
        this.userManagementClient = userManagementClient;
    }

    @Override
    public Optional<SeekerProfile> findById(Long id) {
        return seekerProfileRepository.findById(id);
    }

    @Override
    public List<SeekerProfile> findAll() {
        return seekerProfileRepository.findAll();
    }

    @Override
    public SeekerProfile save(SeekerProfile seekerProfile) {
        return seekerProfileRepository.save(seekerProfile);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public SeekerProfile updateById(Long id, SeekerProfile seekerProfile) {
        return null;
    }

    @Override
    @Transactional
    public SeekerProfile createBasicSeekerProfile(Long id, SeekerProfileModel seekerProfileModel) {
        ApiResponseModel<UserAccountModel> apiResponseModel = userManagementClient.getUserAccountById(id);
        UserAccountModel userAccountModel = apiResponseModel.getData();
        Optional<SeekerProfile> optionalSeekerProfile = findById(userAccountModel.getId());

        if(optionalSeekerProfile.isPresent())
            throw new RuntimeException("Seeker profile already exists");

        // Basic profile
        SeekerProfile seekerProfile = seekerProfileModel.getSeekerProfile();
        seekerProfile.setUserAccountId(id);
        save(seekerProfile);

        return seekerProfile;
    }
}
