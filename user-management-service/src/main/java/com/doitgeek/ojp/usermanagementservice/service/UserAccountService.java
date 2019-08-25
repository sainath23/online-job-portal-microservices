package com.doitgeek.ojp.usermanagementservice.service;

import com.doitgeek.ojp.usermanagementservice.entity.UserAccount;
import com.doitgeek.ojp.usermanagementservice.model.UserRegistrationModel;

import java.util.List;
import java.util.Optional;

public interface UserAccountService {
    Optional<UserAccount> findById(Long id);
    List<UserAccount> findAll();
    UserAccount save(UserAccount userAccount);
    void deleteById(Long id);
    UserAccount updateById(Long id, UserAccount userAccount);
    UserAccount registerUserAccount(UserRegistrationModel userRegistrationModel);
}
