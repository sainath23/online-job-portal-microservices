package com.doitgeek.ojp.seekerprofileservice.service;

import com.doitgeek.ojp.seekerprofileservice.entity.SeekerEducationDetail;
import com.doitgeek.ojp.seekerprofileservice.entity.SeekerEducationDetailPK;
import com.doitgeek.ojp.seekerprofileservice.entity.SeekerProfile;
import com.doitgeek.ojp.seekerprofileservice.exception.UserNotFoundException;
import com.doitgeek.ojp.seekerprofileservice.model.SeekerProfileModel;
import com.doitgeek.ojp.seekerprofileservice.repository.SeekerEducationDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SeekerEducationDetailServiceImpl implements SeekerEducationDetailService {

    private SeekerEducationDetailRepository seekerEducationDetailRepository;
    private SeekerProfileService seekerProfileService;

    @Autowired
    public SeekerEducationDetailServiceImpl(SeekerEducationDetailRepository seekerEducationDetailRepository,
                                            SeekerProfileService seekerProfileService) {
        this.seekerEducationDetailRepository = seekerEducationDetailRepository;
        this.seekerProfileService = seekerProfileService;
    }

    @Override
    public Optional<SeekerEducationDetail> findById(Long id) {
        return seekerEducationDetailRepository.findById(id);
    }

    @Override
    public List<SeekerEducationDetail> findAll() {
        return seekerEducationDetailRepository.findAll();
    }

    @Override
    public SeekerEducationDetail save(SeekerEducationDetail seekerEducationDetail) {
        return seekerEducationDetailRepository.save(seekerEducationDetail);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public SeekerEducationDetail updateById(Long id, SeekerEducationDetail seekerEducationDetail) {
        return null;
    }

    @Override
    @Transactional
    public SeekerEducationDetail createSeekerEducationProfile(Long id, SeekerProfileModel seekerProfileModel) {
        Optional<SeekerProfile> optionalSeekerProfile = seekerProfileService.findById(id);
        SeekerProfile seekerProfile = optionalSeekerProfile.orElseThrow(() -> new UserNotFoundException("The user does not exists"));

        SeekerEducationDetailPK pk = new SeekerEducationDetailPK(seekerProfile.getUserAccountId(),
                                                                seekerProfileModel.getDegreeName(),
                                                                seekerProfileModel.getFieldOfStudy());
        SeekerEducationDetail seekerEducationDetail = seekerProfileModel.getSeekerEducationDetail();
        seekerEducationDetail.setPk(pk);
        save(seekerEducationDetail);

        return seekerEducationDetail;
    }
}
