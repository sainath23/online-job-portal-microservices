package com.doitgeek.ojp.seekerprofileservice.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SeekerExperienceDetailPK implements Serializable {

    private static final long serialVersionUID = 410122796919288775L;

    @Column(name = "user_account_id")
    private Long userAccountId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "job_title")
    private String jobTitle;

    public SeekerExperienceDetailPK() {
    }

    public SeekerExperienceDetailPK(Long userAccountId, String companyName, String jobTitle) {
        this.userAccountId = userAccountId;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeekerExperienceDetailPK that = (SeekerExperienceDetailPK) o;
        return Objects.equals(userAccountId, that.userAccountId) &&
                Objects.equals(companyName, that.companyName) &&
                Objects.equals(jobTitle, that.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userAccountId, companyName, jobTitle);
    }
}
