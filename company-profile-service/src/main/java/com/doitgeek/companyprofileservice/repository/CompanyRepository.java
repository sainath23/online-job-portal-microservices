package com.doitgeek.companyprofileservice.repository;

import com.doitgeek.companyprofileservice.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
