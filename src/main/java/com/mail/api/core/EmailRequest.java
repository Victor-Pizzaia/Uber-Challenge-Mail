package com.mail.api.core;

public record EmailRequest(String to, String subject, String body) {
}
