package com.doitgeek.ojp.seekerprofileservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "seeker_education_detail")
public class SeekerEducationDetail implements Serializable {

    private static final long serialVersionUID = -4343275006729724226L;

    @EmbeddedId
    private SeekerEducationDetailPK pk;

    @Column(name = "institute_name")
    private String instituteName;

    @Column(name = "start_year")
    private Integer startYear;

    @Column(name = "end_year")
    private Integer endYear;

    @Column(name = "grade_system")
    private String gradeSystem;

    @Column(name = "grade")
    private BigDecimal grade;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_account_id", insertable = false, updatable = false)
    @MapsId("user_account_id")
    private SeekerProfile seekerProfile;

    public SeekerEducationDetailPK getPk() {
        return pk;
    }

    public void setPk(SeekerEducationDetailPK pk) {
        this.pk = pk;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
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

    public SeekerProfile getSeekerProfile() {
        return seekerProfile;
    }

    public void setSeekerProfile(SeekerProfile seekerProfile) {
        this.seekerProfile = seekerProfile;
    }
}
