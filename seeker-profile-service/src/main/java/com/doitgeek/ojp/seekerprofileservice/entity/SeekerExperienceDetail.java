package com.doitgeek.ojp.seekerprofileservice.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "seeker_experience_detail")
public class SeekerExperienceDetail implements Serializable {

    private static final long serialVersionUID = -8887901601189886700L;

    @EmbeddedId
    private SeekerExperienceDetailPK pk;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "is_current_job")
    private Character isCurrentJob;

    @Column(name = "location")
    private String location;

    @Column(name = "description")
    private String description;

    public SeekerExperienceDetailPK getPk() {
        return pk;
    }

    public void setPk(SeekerExperienceDetailPK pk) {
        this.pk = pk;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Character getIsCurrentJob() {
        return isCurrentJob;
    }

    public void setIsCurrentJob(Character isCurrentJob) {
        this.isCurrentJob = isCurrentJob;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
