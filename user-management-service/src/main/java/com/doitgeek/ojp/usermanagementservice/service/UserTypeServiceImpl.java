package com.doitgeek.ojp.usermanagementservice.service;

import com.doitgeek.ojp.usermanagementservice.entity.UserType;
import com.doitgeek.ojp.usermanagementservice.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserTypeServiceImpl implements UserTypeService {
    
    private UserTypeRepository userTypeRepository;

    @Autowired
    public UserTypeServiceImpl(UserTypeRepository userTypeRepository) {
        this.userTypeRepository = userTypeRepository;
    }

    @Override
    public Optional<UserType> findById(Long id) {
        return userTypeRepository.findById(id);
    }

    @Override
    public List<UserType> findAll() {
        return userTypeRepository.findAll();
    }

    @Override
    public UserType save(UserType userType) {
        return userTypeRepository.save(userType);
    }

    @Override
    public void deleteById(Long id) {
        userTypeRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<UserType> findByUserTypeName(String userTypeName) {
        return userTypeRepository.findByUserTypeName(userTypeName);
    }
}
