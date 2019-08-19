package com.doitgeek.ojp.usermanagementservice.repository;

import com.doitgeek.ojp.usermanagementservice.entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAddressRepository extends JpaRepository<UserAddress, Long> {
}
