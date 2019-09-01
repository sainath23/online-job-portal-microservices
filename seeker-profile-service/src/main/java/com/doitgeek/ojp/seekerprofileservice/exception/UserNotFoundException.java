package com.doitgeek.ojp.seekerprofileservice.exception;

public class UserNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 8882100564522051735L;

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundException(Throwable cause) {
        super(cause);
    }
}
