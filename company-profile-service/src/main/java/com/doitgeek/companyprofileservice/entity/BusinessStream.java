package com.doitgeek.companyprofileservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "business_stream")
public class BusinessStream implements Serializable {

    private static final long serialVersionUID = 8937364301804622109L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "business_stream_name")
    private String businessStreamName;

    public BusinessStream() {
    }

    public BusinessStream(String businessStreamName) {
        this.businessStreamName = businessStreamName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusinessStreamName() {
        return businessStreamName;
    }

    public void setBusinessStreamName(String businessStreamName) {
        this.businessStreamName = businessStreamName;
    }
}
