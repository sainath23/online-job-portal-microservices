package com.doitgeek.ojp.usermanagementservice.service;

import com.doitgeek.ojp.usermanagementservice.entity.UserAccount;

import java.util.List;
import java.util.Optional;

public interface UserAccountService {
    Optional<UserAccount> findById(Long id);
    List<UserAccount> findAll();
    UserAccount save(UserAccount userAccount);
    void deleteById(Long id);
}
