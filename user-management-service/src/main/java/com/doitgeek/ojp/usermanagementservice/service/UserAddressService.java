package com.doitgeek.ojp.usermanagementservice.service;

import com.doitgeek.ojp.usermanagementservice.entity.UserAddress;

import java.util.List;
import java.util.Optional;

public interface UserAddressService {
    Optional<UserAddress> findById(Long id);
    List<UserAddress> findAll();
    UserAddress save(UserAddress userAddress);
    void deleteById(Long id);
}
