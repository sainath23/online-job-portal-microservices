package com.doitgeek.ojp.seekerprofileservice.exception;

import com.doitgeek.ojp.seekerprofileservice.model.ApiResponseModel;

public class UserManagementClientException extends RuntimeException {
    private static final long serialVersionUID = 6745103838460617167L;
    private ApiResponseModel apiResponseModel;
    private int status;

    public UserManagementClientException(ApiResponseModel apiResponseModel, int status) {
        this.apiResponseModel = apiResponseModel;
        this.status = status;
    }

    public UserManagementClientException(String message, int status) {
        super(message);
        this.status = status;
    }

    public UserManagementClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserManagementClientException(Throwable cause) {
        super(cause);
    }

    public ApiResponseModel getApiResponseModel() {
        return apiResponseModel;
    }

    public int getStatus() {
        return status;
    }
}
