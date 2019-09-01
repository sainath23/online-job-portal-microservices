package com.doitgeek.ojp.seekerprofileservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "seeker_skill_set")
public class SeekerSkillSet implements Serializable {

    private static final long serialVersionUID = 5757445669060420177L;

    @Id
    @Column(name = "user_account_id")
    private Long userAccountId;

    @Column(name = "skill_set_id")
    private Long skillSetId;

    @Column(name = "skill_set_level")
    private Long skillSetLevel;

    public SeekerSkillSet() {
    }

    public SeekerSkillSet(Long userAccountId, Long skillSetId, Long skillSetLevel) {
        this.userAccountId = userAccountId;
        this.skillSetId = skillSetId;
        this.skillSetLevel = skillSetLevel;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public Long getSkillSetId() {
        return skillSetId;
    }

    public void setSkillSetId(Long skillSetId) {
        this.skillSetId = skillSetId;
    }

    public Long getSkillSetLevel() {
        return skillSetLevel;
    }

    public void setSkillSetLevel(Long skillSetLevel) {
        this.skillSetLevel = skillSetLevel;
    }
}
