package com.jinju.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChattingMessage{
    private String sender;
    private String content;
    private String timestamp;

    public ChattingMessage() {
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", content='" + content + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}