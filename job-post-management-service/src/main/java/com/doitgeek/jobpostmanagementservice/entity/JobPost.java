package com.doitgeek.jobpostmanagementservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "job_post")
public class JobPost implements Serializable {
    private static final long serialVersionUID = 2050224159531442120L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "posted_by_id")
    private Long postedById;

    @Column(name = "job_type_id")
    private Long jobTypeId;

    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "is_company_name_hidden")
    private Character isCompanyNameHidden;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "job_description")
    private String jobDescription;

    @Column(name = "job_location_id")
    private Long jobLocationId;

    @Column(name = "is_active")
    private Character isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostedById() {
        return postedById;
    }

    public void setPostedById(Long postedById) {
        this.postedById = postedById;
    }

    public Long getJobTypeId() {
        return jobTypeId;
    }

    public void setJobTypeId(Long jobTypeId) {
        this.jobTypeId = jobTypeId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Character getIsCompanyNameHidden() {
        return isCompanyNameHidden;
    }

    public void setIsCompanyNameHidden(Character isCompanyNameHidden) {
        this.isCompanyNameHidden = isCompanyNameHidden;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public Long getJobLocationId() {
        return jobLocationId;
    }

    public void setJobLocationId(Long jobLocationId) {
        this.jobLocationId = jobLocationId;
    }

    public Character getIsActive() {
        return isActive;
    }

    public void setIsActive(Character isActive) {
        this.isActive = isActive;
    }
}
