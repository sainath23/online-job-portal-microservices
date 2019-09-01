package com.doitgeek.ojp.seekerprofileservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "seeker_profile")
public class SeekerProfile implements Serializable {

    private static final long serialVersionUID = 4351586231570336348L;

    @Id
    @Column(name = "user_account_id")
    private Long userAccountId;

    @Column(name = "current_salary")
    private Long currentSalary;

    @Column(name = "is_annually")
    private Character isAnnually;

    @Column(name = "currency")
    private String currency;

    @JsonIgnore
    @OneToMany(mappedBy = "seekerProfile")
    private Set<SeekerEducationDetail> seekerEducationDetails;

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

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

    public Set<SeekerEducationDetail> getSeekerEducationDetails() {
        return seekerEducationDetails;
    }

    public void setSeekerEducationDetails(Set<SeekerEducationDetail> seekerEducationDetails) {
        this.seekerEducationDetails = seekerEducationDetails;
    }
}
