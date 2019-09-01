package com.doitgeek.companyprofileservice.service;

import com.doitgeek.companyprofileservice.entity.BusinessStream;
import com.doitgeek.companyprofileservice.repository.BusinessStreamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessStreamServiceImpl implements BusinessStreamService {

    private BusinessStreamRepository businessStreamRepository;

    @Autowired
    public BusinessStreamServiceImpl(BusinessStreamRepository businessStreamRepository) {
        this.businessStreamRepository = businessStreamRepository;
    }

    @Override
    public Optional<BusinessStream> findById(Long id) {
        return businessStreamRepository.findById(id);
    }

    @Override
    public List<BusinessStream> findAll() {
        return businessStreamRepository.findAll();
    }

    @Override
    public BusinessStream save(BusinessStream businessStream) {
        return businessStreamRepository.save(businessStream);
    }

    @Override
    public void deleteById(Long id) {
        businessStreamRepository.deleteById(id);
    }

    @Override
    public BusinessStream updateById(Long id, BusinessStream businessStream) {
        return null;
    }
}
