package com.doitgeek.ojp.seekerprofileservice.exception;

import com.doitgeek.ojp.seekerprofileservice.model.ApiResponseModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.Reader;

@Component
public class UserManagementClientErrorDecoder implements ErrorDecoder {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserManagementClientErrorDecoder.class);
    private final ErrorDecoder defaultErrotDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        if(response.status() >= 400 && response.status() <= 499) {
            ApiResponseModel apiResponseModel = null;
            try {
                Reader reader = response.body().asReader();
                String result = IOUtils.toString(reader);
                ObjectMapper objectMapper = new ObjectMapper();
                apiResponseModel = objectMapper.readValue(result, ApiResponseModel.class);
            } catch (Exception e) {
                LOGGER.error(e.getMessage(), e);
            }

            if (apiResponseModel != null) {
                return new UserManagementClientException(apiResponseModel, response.status());
            }
            return new UserManagementClientException(response.reason(), response.status());
        }
        if (response.status() >= 500 && response.status() <= 599) {
            return new UserManagementClientException("Internal server error", response.status());
        }
        return defaultErrotDecoder.decode(methodKey, response);
    }
}
