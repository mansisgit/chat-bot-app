package com.example.chatbot.util;

import java.util.UUID;

public final class IdGeneratorUtil {

    private IdGeneratorUtil() {
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}
