package com.doitgeek.companyprofileservice.service;

import com.doitgeek.companyprofileservice.entity.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
    Optional<Company> findById(Long id);
    List<Company> findAll();
    Company save(Company company);
    void deleteById(Long id);
    Company updateById(Long id, Company company);
}
