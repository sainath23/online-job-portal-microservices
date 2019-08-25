package com.doitgeek.ojp.usermanagementservice.service;

import com.doitgeek.ojp.usermanagementservice.constant.AppConstant;
import com.doitgeek.ojp.usermanagementservice.entity.UserAccount;
import com.doitgeek.ojp.usermanagementservice.entity.UserAddress;
import com.doitgeek.ojp.usermanagementservice.entity.UserLog;
import com.doitgeek.ojp.usermanagementservice.entity.UserType;
import com.doitgeek.ojp.usermanagementservice.exception.UserNotFoundException;
import com.doitgeek.ojp.usermanagementservice.model.UserRegistrationModel;
import com.doitgeek.ojp.usermanagementservice.repository.UserAccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserAccountServiceImpl.class);

    private UserAccountRepository userAccountRepository;

    private UserAddressService userAddressService;

    private UserTypeService userTypeService;

    private UserLogService userLogService;

    @Autowired
    public UserAccountServiceImpl(UserAccountRepository userAccountRepository,
                                  UserAddressService userAddressService,
                                  UserTypeService userTypeService,
                                  UserLogService userLogService) {
        this.userAccountRepository = userAccountRepository;
        this.userAddressService = userAddressService;
        this.userTypeService = userTypeService;
        this.userLogService = userLogService;
    }

    @Override
    public Optional<UserAccount> findById(Long id) {
        return userAccountRepository.findById(id);
    }

    @Override
    public List<UserAccount> findAll() {
        return userAccountRepository.findAll();
    }

    @Override
    public UserAccount save(UserAccount userAccount) {
        return userAccountRepository.save(userAccount);
    }

    @Override
    public void deleteById(Long id) {
        userAccountRepository.deleteById(id);
    }

    @Override
    public UserAccount updateById(Long id, UserAccount userAccount) {
        if(findById(id).isPresent()) {
            return save(userAccount);
        }
        throw new UserNotFoundException("The user with id = " + id + " does not exists!", id);
    }

    @Override
    @Transactional
    public UserAccount registerUserAccount(UserRegistrationModel userRegistrationModel) {
        UserType userType = userTypeService.findByUserTypeName(userRegistrationModel.getUserType()).orElseThrow(() -> new RuntimeException("Invalid user type."));
        UserAccount newUserAccount = userRegistrationModel.getUserAccount();
        newUserAccount.setUserTypeId(userType.getId());
        newUserAccount.setIsActive(AppConstant.YES);
        newUserAccount.setRegistrationDate(new Date());
        save(newUserAccount);

        UserAddress newUserAddress = userRegistrationModel.getUserAddress();
        newUserAddress.setUserAccount(newUserAccount);
        userAddressService.save(newUserAddress);

        UserLog userLog = new UserLog(null, null, newUserAccount);
        userLogService.save(userLog);

        return newUserAccount;
    }
}
