package org.qainsights.chatdemo;

import java.time.LocalDateTime;

public final class Chat {

    private final String message;
    private final LocalDateTime localDateTime;

    public Chat(String message, LocalDateTime localDateTime) {
        this.message = message;
        this.localDateTime = localDateTime;
    }


    public String toString() {
        return this.message + "-" + this.localDateTime;
    }
}
