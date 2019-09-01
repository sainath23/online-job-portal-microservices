package com.doitgeek.ojp.seekerprofileservice.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SeekerEducationDetailPK implements Serializable {

    private static final long serialVersionUID = -2021120585120956769L;

    @Column(name = "user_account_id")
    private Long userAccountId;

    @Column(name = "degree_name")
    private String degreeName;

    @Column(name = "field_of_study")
    private String fieldOfStudy;

    public SeekerEducationDetailPK() {
    }

    public SeekerEducationDetailPK(Long userAccountId, String degreeName, String fieldOfStudy) {
        this.userAccountId = userAccountId;
        this.degreeName = degreeName;
        this.fieldOfStudy = fieldOfStudy;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeekerEducationDetailPK that = (SeekerEducationDetailPK) o;
        return userAccountId.equals(that.userAccountId) &&
                degreeName.equals(that.degreeName) &&
                fieldOfStudy.equals(that.fieldOfStudy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userAccountId, degreeName, fieldOfStudy);
    }
}
