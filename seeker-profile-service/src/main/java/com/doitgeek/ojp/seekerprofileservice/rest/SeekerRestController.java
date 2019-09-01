package com.doitgeek.ojp.seekerprofileservice.rest;

import com.doitgeek.ojp.seekerprofileservice.constant.AppConstant;
import com.doitgeek.ojp.seekerprofileservice.entity.SeekerEducationDetail;
import com.doitgeek.ojp.seekerprofileservice.entity.SeekerExperienceDetail;
import com.doitgeek.ojp.seekerprofileservice.entity.SeekerProfile;
import com.doitgeek.ojp.seekerprofileservice.model.ApiResponseModel;
import com.doitgeek.ojp.seekerprofileservice.model.SeekerProfileModel;
import com.doitgeek.ojp.seekerprofileservice.service.SeekerEducationDetailService;
import com.doitgeek.ojp.seekerprofileservice.service.SeekerExperienceDetailService;
import com.doitgeek.ojp.seekerprofileservice.service.SeekerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/seekers")
public class SeekerRestController {

    private SeekerProfileService seekerProfileService;
    private SeekerEducationDetailService seekerEducationDetailService;
    private SeekerExperienceDetailService seekerExperienceDetailService;

    @Autowired
    public SeekerRestController(SeekerProfileService seekerProfileService,
                                SeekerEducationDetailService seekerEducationDetailService,
                                SeekerExperienceDetailService seekerExperienceDetailService) {
        this.seekerProfileService = seekerProfileService;
        this.seekerEducationDetailService = seekerEducationDetailService;
        this.seekerExperienceDetailService = seekerExperienceDetailService;
    }

    @GetMapping("/test")
    public String helloWorld() {
        return "Hello Seekers";
    }

    @PostMapping("/{id}")
    public ResponseEntity<ApiResponseModel<SeekerProfile>> createSeekerProfile(@Valid @RequestBody final SeekerProfileModel seekerProfileModel,
                                                                                    @PathVariable("id") final Long id) {
        SeekerProfile seekerProfile = seekerProfileService.createBasicSeekerProfile(id, seekerProfileModel);
        seekerEducationDetailService.createSeekerEducationProfile(seekerProfile.getUserAccountId(), seekerProfileModel);
        seekerExperienceDetailService.createSeekerExperienceProfile(seekerProfile.getUserAccountId(), seekerProfileModel);

        ApiResponseModel<SeekerProfile> apiResponseModel = new ApiResponseModel<>(AppConstant.SUCCESS, seekerProfile);
        return new ResponseEntity<>(apiResponseModel, HttpStatus.OK);
    }

    @PostMapping("/{id}/education")
    public ResponseEntity<ApiResponseModel<SeekerEducationDetail>> createSeekerEducationProfile(@Valid @RequestBody final SeekerProfileModel seekerProfileModel,
                                                                                                @PathVariable("id") final Long id) {
        ApiResponseModel<SeekerEducationDetail> apiResponseModel = new ApiResponseModel<>(AppConstant.SUCCESS,
                                                                    seekerEducationDetailService.createSeekerEducationProfile(id, seekerProfileModel));
        return new ResponseEntity<>(apiResponseModel, HttpStatus.OK);
    }

    @PostMapping("/{id}/experience")
    public ResponseEntity<ApiResponseModel<SeekerExperienceDetail>> createSeekerExperienceProfile(@Valid @RequestBody final SeekerProfileModel seekerProfileModel,
                                                                                                  @PathVariable("id") final Long id) {
        ApiResponseModel<SeekerExperienceDetail> apiResponseModel = new ApiResponseModel<>(AppConstant.SUCCESS,
                                                                        seekerExperienceDetailService.createSeekerExperienceProfile(id, seekerProfileModel));
        return new ResponseEntity<>(apiResponseModel, HttpStatus.OK);
    }
}
