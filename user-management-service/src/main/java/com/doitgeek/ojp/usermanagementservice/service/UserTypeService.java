package com.doitgeek.ojp.usermanagementservice.service;

import com.doitgeek.ojp.usermanagementservice.entity.UserType;

import java.util.List;
import java.util.Optional;

public interface UserTypeService {
    Optional<UserType> findById(Long id);
    List<UserType> findAll();
    UserType save(UserType userType);
    void deleteById(Long id);
    Optional<UserType> findByUserTypeName(String userTypeName);
}
