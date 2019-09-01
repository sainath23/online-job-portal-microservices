package com.doitgeek.jobpostmanagementservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "job_post_activity")
public class JobPostActivity implements Serializable {

    private static final long serialVersionUID = -8184918600892889705L;

    @Id
    @Column(name = "user_account_id")
    private Long userAccountId;

    @Column(name = "job_post_id")
    private Long jobPostId;

    @Column(name = "apply_date")
    private Date applyDate;

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public Long getJobPostId() {
        return jobPostId;
    }

    public void setJobPostId(Long jobPostId) {
        this.jobPostId = jobPostId;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }
}
