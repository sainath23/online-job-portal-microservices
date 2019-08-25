package com.doitgeek.ojp.usermanagementservice.rest;

import com.doitgeek.ojp.usermanagementservice.constant.AppConstant;
import com.doitgeek.ojp.usermanagementservice.entity.UserAccount;
import com.doitgeek.ojp.usermanagementservice.entity.UserAddress;
import com.doitgeek.ojp.usermanagementservice.exception.UserNotFoundException;
import com.doitgeek.ojp.usermanagementservice.model.ApiResponseModel;
import com.doitgeek.ojp.usermanagementservice.model.UserRegistrationModel;
import com.doitgeek.ojp.usermanagementservice.service.UserAccountService;
import com.doitgeek.ojp.usermanagementservice.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {

    private UserAccountService userAccountService;
    private UserAddressService userAddressService;

    @Autowired
    public UserRestController(UserAccountService userAccountService, UserAddressService userAddressService) {
        this.userAccountService = userAccountService;
        this.userAddressService = userAddressService;
    }

    @GetMapping("/test")
    public String helloWorld() {
        return "Hello World from UserRestController";
    }

    @PostMapping
    public ResponseEntity<ApiResponseModel<UserAccount>> createUserAccount(@Valid @RequestBody final UserRegistrationModel userRegistrationModel) {
        ApiResponseModel<UserAccount> apiResponseModel = new ApiResponseModel<>(AppConstant.SUCCESS,
                                                                                userAccountService.registerUserAccount(userRegistrationModel));
        return new ResponseEntity<>(apiResponseModel, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponseModel<UserAccount>> getUserAccountById(@PathVariable("id") Long id) {
        UserAccount userAccount = userAccountService.findById(id).orElseThrow(() -> new UserNotFoundException("The user does not exists!", id));
        return new ResponseEntity<>(new ApiResponseModel<>(AppConstant.SUCCESS, userAccount), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<ApiResponseModel<List<UserAccount>>> getAllUserAccounts() {
        return new ResponseEntity<>(new ApiResponseModel<>(AppConstant.SUCCESS, userAccountService.findAll()), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponseModel<UserAccount>> updateUserAccount(@PathVariable("id") Long id, @RequestBody UserAccount userAccount) {
        return new ResponseEntity<>(new ApiResponseModel<>(AppConstant.SUCCESS, userAccountService.updateById(id, userAccount)), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteUserAccount(@PathVariable("id") Long id) {
        userAccountService.deleteById(id);
    }

    @PostMapping("/{id}/address")
    public UserAddress createUserAddress() {
        return null;
    }
}
