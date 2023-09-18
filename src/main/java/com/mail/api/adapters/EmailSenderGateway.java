package com.mail.api.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
