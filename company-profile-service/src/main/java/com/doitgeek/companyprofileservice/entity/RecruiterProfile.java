package com.doitgeek.companyprofileservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "recruiter_profile")
public class RecruiterProfile implements Serializable {
    private static final long serialVersionUID = 5226150132356893997L;

    @Id
    @Column(name = "user_account_id")
    private Long userAccountId;

    @Column(name = "profile_description")
    private String profileDescription;

    @Column(name = "company_id")
    private Long companyId;

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getProfileDescription() {
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}
