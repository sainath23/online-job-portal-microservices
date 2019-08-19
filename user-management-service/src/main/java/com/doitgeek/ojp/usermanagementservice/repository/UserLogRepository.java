package com.doitgeek.ojp.usermanagementservice.repository;

import com.doitgeek.ojp.usermanagementservice.entity.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLogRepository extends JpaRepository<UserLog, Long> {
}
