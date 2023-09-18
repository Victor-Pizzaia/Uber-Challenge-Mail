package com.mail.api.core.exceptions;

public class EmailServiceException extends RuntimeException {

    public EmailServiceException(String msg) {
        super(msg);
    }

    public EmailServiceException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
