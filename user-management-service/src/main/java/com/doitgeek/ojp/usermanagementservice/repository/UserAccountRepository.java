package com.doitgeek.ojp.usermanagementservice.repository;

import com.doitgeek.ojp.usermanagementservice.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
