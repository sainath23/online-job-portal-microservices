package com.doitgeek.ojp.usermanagementservice.repository;

import com.doitgeek.ojp.usermanagementservice.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType, Long> {
}
