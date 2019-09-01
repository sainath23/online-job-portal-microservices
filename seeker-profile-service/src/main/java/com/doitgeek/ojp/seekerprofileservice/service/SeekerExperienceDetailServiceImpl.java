package com.doitgeek.ojp.seekerprofileservice.service;

import com.doitgeek.ojp.seekerprofileservice.constant.MessageConstant;
import com.doitgeek.ojp.seekerprofileservice.entity.SeekerExperienceDetail;
import com.doitgeek.ojp.seekerprofileservice.entity.SeekerExperienceDetailPK;
import com.doitgeek.ojp.seekerprofileservice.entity.SeekerProfile;
import com.doitgeek.ojp.seekerprofileservice.exception.UserNotFoundException;
import com.doitgeek.ojp.seekerprofileservice.model.SeekerProfileModel;
import com.doitgeek.ojp.seekerprofileservice.repository.SeekerExperienceDetailRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SeekerExperienceDetailServiceImpl implements SeekerExperienceDetailService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SeekerExperienceDetailServiceImpl.class);

    private SeekerExperienceDetailRepository seekerExperienceDetailRepository;
    private SeekerProfileService seekerProfileService;

    @Autowired
    public SeekerExperienceDetailServiceImpl(SeekerExperienceDetailRepository seekerExperienceDetailRepository,
                                             SeekerProfileService seekerProfileService) {
        this.seekerExperienceDetailRepository = seekerExperienceDetailRepository;
        this.seekerProfileService = seekerProfileService;
    }

    @Override
    public Optional<SeekerExperienceDetail> findById(Long id) {
        return seekerExperienceDetailRepository.findById(id);
    }

    @Override
    public List<SeekerExperienceDetail> findAll() {
        return seekerExperienceDetailRepository.findAll();
    }

    @Override
    public SeekerExperienceDetail save(SeekerExperienceDetail seekerExperienceDetail) {
        return seekerExperienceDetailRepository.save(seekerExperienceDetail);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public SeekerExperienceDetail updateById(Long id, SeekerExperienceDetail seekerExperienceDetail) {
        return null;
    }

    @Override
    @Transactional
    public SeekerExperienceDetail createSeekerExperienceProfile(Long id, SeekerProfileModel seekerProfileModel) {
        Optional<SeekerProfile> optionalSeekerProfile = seekerProfileService.findById(id);
        SeekerProfile seekerProfile = optionalSeekerProfile.orElseThrow(() -> new UserNotFoundException(MessageConstant.USER_DOES_NOT_EXIST));

        SeekerExperienceDetailPK pk = new SeekerExperienceDetailPK(seekerProfile.getUserAccountId(),
                                                                    seekerProfileModel.getCompanyName(),
                                                                    seekerProfileModel.getJobTitle());
        SeekerExperienceDetail seekerExperienceDetail = seekerProfileModel.getSeekerExperienceDetail();
        seekerExperienceDetail.setPk(pk);
        save(seekerExperienceDetail);

        return seekerExperienceDetail;
    }
}
