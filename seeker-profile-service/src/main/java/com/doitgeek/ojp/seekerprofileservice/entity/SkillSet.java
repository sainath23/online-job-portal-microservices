package com.doitgeek.ojp.seekerprofileservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "skill_set")
public class SkillSet implements Serializable {

    private static final long serialVersionUID = 5792354682719254888L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "skill_set_name")
    private String skillSetName;

    public SkillSet() {
    }

    public SkillSet(Long id, String skillSetName) {
        this.id = id;
        this.skillSetName = skillSetName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkillSetName() {
        return skillSetName;
    }

    public void setSkillSetName(String skillSetName) {
        this.skillSetName = skillSetName;
    }
}
