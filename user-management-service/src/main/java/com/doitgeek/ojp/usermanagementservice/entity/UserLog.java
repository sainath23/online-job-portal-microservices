package com.doitgeek.ojp.usermanagementservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user_log")
public class UserLog implements Serializable {

    private static final long serialVersionUID = -4575274009045720494L;

    @Id
    @Column(name = "user_account_id")
    private Long userAccountId;

    @Column(name = "last_login_date")
    private Date lastLoginDate;

    @Column(name = "last_job_apply_date")
    private Date lastJobApplyDate;

    @OneToOne
    @JoinColumn(name = "user_account_id", insertable = false, updatable = false)
    @MapsId
    private UserAccount userAccount;

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastJobApplyDate() {
        return lastJobApplyDate;
    }

    public void setLastJobApplyDate(Date lastJobApplyDate) {
        this.lastJobApplyDate = lastJobApplyDate;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
}
