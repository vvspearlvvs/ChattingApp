package com.jinju.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class ChattingMessage implements Serializable {
    private String message;
    private String user;
    private String timestamp;

    public ChattingMessage() {
    }

    public ChattingMessage(String message, String user) {
        this.user = user;
        this.message = message;
    }
    @Override
    public String toString() {
        return "Message{" +
                "author='" + user + '\'' +
                ", content='" + message + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}