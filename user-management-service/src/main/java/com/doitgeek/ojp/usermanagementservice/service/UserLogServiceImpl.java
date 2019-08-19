package com.doitgeek.ojp.usermanagementservice.service;

import com.doitgeek.ojp.usermanagementservice.entity.UserLog;
import com.doitgeek.ojp.usermanagementservice.repository.UserLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserLogServiceImpl implements UserLogService {

    private UserLogRepository userLogRepository;

    @Autowired
    public UserLogServiceImpl(UserLogRepository userLogRepository) {
        this.userLogRepository = userLogRepository;
    }

    @Override
    public Optional<UserLog> findById(Long id) {
        return userLogRepository.findById(id);
    }

    @Override
    public List<UserLog> findAll() {
        return userLogRepository.findAll();
    }

    @Override
    public UserLog save(UserLog userLog) {
        return userLogRepository.save(userLog);
    }

    @Override
    public void deleteById(Long id) {
        userLogRepository.deleteById(id);
    }
}
