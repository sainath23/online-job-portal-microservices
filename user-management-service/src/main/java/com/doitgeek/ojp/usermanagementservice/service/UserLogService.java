package com.doitgeek.ojp.usermanagementservice.service;

import com.doitgeek.ojp.usermanagementservice.entity.UserLog;

import java.util.List;
import java.util.Optional;

public interface UserLogService {
    Optional<UserLog> findById(Long id);
    List<UserLog> findAll();
    UserLog save(UserLog userLog);
    void deleteById(Long id);
}
