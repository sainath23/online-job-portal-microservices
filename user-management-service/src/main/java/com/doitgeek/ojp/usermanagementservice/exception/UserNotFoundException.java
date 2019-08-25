package com.doitgeek.ojp.usermanagementservice.exception;

public class UserNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 6745103838460617167L;
    private final Long id;

    public UserNotFoundException(String message, Long id) {
        super(message);
        this.id = id;
    }

    public UserNotFoundException(String message, Throwable cause, Long id) {
        super(message, cause);
        this.id = id;
    }

    public UserNotFoundException(Throwable cause, Long id) {
        super(cause);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
