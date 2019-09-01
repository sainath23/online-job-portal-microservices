package com.doitgeek.ojp.seekerprofileservice.model;

import com.doitgeek.ojp.seekerprofileservice.annotation.Flag;
import com.doitgeek.ojp.seekerprofileservice.constant.MessageConstant;
import com.doitgeek.ojp.seekerprofileservice.entity.SeekerEducationDetail;
import com.doitgeek.ojp.seekerprofileservice.entity.SeekerExperienceDetail;
import com.doitgeek.ojp.seekerprofileservice.entity.SeekerProfile;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

public class SeekerProfileModel {

    // Current details
    @Max(value = Long.MAX_VALUE)
    private Long currentSalary;

    @Flag
    private Character isAnnually;

    private String currency;

    // Education details
    @NotBlank(message = MessageConstant.DEGREE_NAME_REQUIRED)
    @Size(max = 49, message = MessageConstant.DEGREE_NAME_VALID)
    private String degreeName;

    @NotBlank(message = MessageConstant.FIELD_OF_STUDY_REQUIRED)
    @Size(max = 49, message = MessageConstant.FIELD_OF_STUDY_VALID)
    private String fieldOfStudy;

    @NotBlank(message = MessageConstant.INSTITUTE_NAME_REQUIRED)
    @Size(max = 49, message = MessageConstant.INSTITUTE_NAME_VALID)
    private String instituteName;

    @NotNull(message = MessageConstant.DEGREE_START_YEAR_REQUIRED)
    @Digits(integer = 4, fraction = 0, message = "Please enter valid year")
    private Integer degreeStartYear;

    @Digits(integer = 4, fraction = 0, message = "Please enter valid year")
    private Integer degreeEndYear;

    @Size(max = 19, message = MessageConstant.GRADE_SYSTEM_VALID)
    private String gradeSystem;

    private BigDecimal grade;

    // Experience details
    @JsonFormat(pattern = "dd-MMM-yyyy")
    @NotNull(message = MessageConstant.JOB_START_DATE_REQUIRED)
    private Date jobStartDate;

    @JsonFormat(pattern = "dd-MMM-yyyy")
    private Date jobEndDate;

    @NotNull
    @Flag
    private Character isCurrentJob;

    @NotBlank(message = MessageConstant.JOB_TITLE_REQUIRED)
    @Size(max = 49, message = MessageConstant.JOB_TITLE_VALID)
    private String jobTitle;

    @NotBlank(message = MessageConstant.COMPANY_NAME_REQUIRED)
    @Size(max = 99, message = MessageConstant.COMPANY_NAME_VALID)
    private String companyName;

    @NotBlank(message = MessageConstant.JOB_LOCATION_REQUIRED)
    @Size(max = 99, message = MessageConstant.JOB_LOCATION_VALID)
    private String jobLocation;

    @Size(max = 1999, message = MessageConstant.JOB_DESCRIPTION_VALID)
    private String jobDescription;

    public Long getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(Long currentSalary) {
        this.currentSalary = currentSalary;
    }

    public Character getIsAnnually() {
        return isAnnually;
    }

    public void setIsAnnually(Character isAnnually) {
        this.isAnnually = isAnnually;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public Integer getDegreeStartYear() {
        return degreeStartYear;
    }

    public void setDegreeStartYear(Integer degreeStartYear) {
        this.degreeStartYear = degreeStartYear;
    }

    public Integer getDegreeEndYear() {
        return degreeEndYear;
    }

    public void setDegreeEndYear(Integer degreeEndYear) {
        this.degreeEndYear = degreeEndYear;
    }

    public String getGradeSystem() {
        return gradeSystem;
    }

    public void setGradeSystem(String gradeSystem) {
        this.gradeSystem = gradeSystem;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public Date getJobStartDate() {
        return jobStartDate;
    }

    public void setJobStartDate(Date jobStartDate) {
        this.jobStartDate = jobStartDate;
    }

    public Date getJobEndDate() {
        return jobEndDate;
    }

    public void setJobEndDate(Date jobEndDate) {
        this.jobEndDate = jobEndDate;
    }

    public Character getIsCurrentJob() {
        return isCurrentJob;
    }

    public void setIsCurrentJob(Character isCurrentJob) {
        this.isCurrentJob = isCurrentJob;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public SeekerProfile getSeekerProfile() {
        SeekerProfile seekerProfile = new SeekerProfile();
        seekerProfile.setCurrentSalary(currentSalary);
        seekerProfile.setIsAnnually(isAnnually);
        seekerProfile.setCurrency(currency);
        return seekerProfile;
    }

    public SeekerEducationDetail getSeekerEducationDetail() {
        SeekerEducationDetail seekerEducationDetail = new SeekerEducationDetail();
        seekerEducationDetail.setInstituteName(instituteName);
        seekerEducationDetail.setStartYear(degreeStartYear);
        seekerEducationDetail.setEndYear(degreeEndYear);
        seekerEducationDetail.setGradeSystem(gradeSystem);
        seekerEducationDetail.setGrade(grade);
        return seekerEducationDetail;
    }

    public SeekerExperienceDetail getSeekerExperienceDetail() {
        SeekerExperienceDetail seekerExperienceDetail = new SeekerExperienceDetail();
        seekerExperienceDetail.setStartDate(jobStartDate);
        seekerExperienceDetail.setEndDate(jobEndDate);
        seekerExperienceDetail.setIsCurrentJob(isCurrentJob);
        seekerExperienceDetail.setLocation(jobLocation);
        seekerExperienceDetail.setDescription(jobDescription);
        return seekerExperienceDetail;
    }
}
