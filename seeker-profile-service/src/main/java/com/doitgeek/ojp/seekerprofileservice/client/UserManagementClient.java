package com.doitgeek.ojp.seekerprofileservice.client;

import com.doitgeek.ojp.seekerprofileservice.model.ApiResponseModel;
import com.doitgeek.ojp.seekerprofileservice.model.UserAccountModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user-management-service")
public interface UserManagementClient {

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    ApiResponseModel<UserAccountModel> getUserAccountById(@PathVariable("id") Long id);
}
