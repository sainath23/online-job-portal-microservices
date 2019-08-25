package com.doitgeek.ojp.usermanagementservice.repository;

import com.doitgeek.ojp.usermanagementservice.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserTypeRepository extends JpaRepository<UserType, Long> {
    Optional<UserType> findByUserTypeName(String userTypeName);
}
