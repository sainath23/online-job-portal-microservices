package com.doitgeek.ojp.usermanagementservice.exception;

import com.doitgeek.ojp.usermanagementservice.constant.AppConstant;
import com.doitgeek.ojp.usermanagementservice.model.ApiResponseModel;
import io.micrometer.core.lang.NonNullApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@NonNullApi
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomExceptionHandler.class);

    // Handle all other exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleAllException(Exception ex) {
        LOGGER.error(ex.getMessage(), ex);
        ApiResponseModel apiResponseModel = new ApiResponseModel();
        apiResponseModel.setStatus(AppConstant.ERROR);
        apiResponseModel.setErrorMessage(ex.getMessage());
        return new ResponseEntity<>(apiResponseModel, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // Handle UserNotFoundException
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<?> handleUserNotFoundException(UserNotFoundException ex) {
        LOGGER.error(ex.getMessage(), ex);
        ApiResponseModel apiResponseModel = new ApiResponseModel();
        apiResponseModel.setStatus(AppConstant.ERROR);
        apiResponseModel.setErrorMessage(ex.getMessage());
        return new ResponseEntity<>(apiResponseModel, HttpStatus.NOT_FOUND);
    }

    // Handle validation errors
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status, WebRequest request) {
        LOGGER.error(ex.getMessage(), ex);
        Map<String, String> errorMessageMap = new HashMap<>();
        ex.getBindingResult()
                .getFieldErrors()
                .forEach(fieldError -> errorMessageMap.put(fieldError.getField(), fieldError.getDefaultMessage()));

        ApiResponseModel apiResponseModel = new ApiResponseModel();
        apiResponseModel.setStatus("ERROR");
        apiResponseModel.setErrorMessage("Validation Failed");
        apiResponseModel.setErrorMessages(errorMessageMap);

        return new ResponseEntity<>(apiResponseModel, HttpStatus.BAD_REQUEST);
    }
}
