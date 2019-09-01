package com.doitgeek.companyprofileservice.service;

import com.doitgeek.companyprofileservice.entity.BusinessStream;

import java.util.List;
import java.util.Optional;

public interface BusinessStreamService {
    Optional<BusinessStream> findById(Long id);
    List<BusinessStream> findAll();
    BusinessStream save(BusinessStream businessStream);
    void deleteById(Long id);
    BusinessStream updateById(Long id, BusinessStream businessStream);
}
