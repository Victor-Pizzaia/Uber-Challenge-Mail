package com.mail.api.core;

public interface EmailSenderUserCase {
    void sendEmail(String to, String subject, String body);
}
