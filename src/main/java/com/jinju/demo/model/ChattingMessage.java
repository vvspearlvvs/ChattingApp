package com.jinju.demo.model;

import java.io.Serializable;

public class ChattingMessage implements Serializable{
    private String sender;
    private String content;
    private String timestamp;

    public ChattingMessage() {
    }
    public String getTimestamp(){
        return timestamp;
    }
    public void setTimestamp(String timestamp){
        this.timestamp = timestamp;
    }
    public String getSender(){
        return sender;
    }
    public void setUser(String sender){
        this.sender = sender;
    }
    public ChattingMessage(String content, String sender) {
        this.sender = sender;
        this.content = content;
    }
    public String getMessage(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
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