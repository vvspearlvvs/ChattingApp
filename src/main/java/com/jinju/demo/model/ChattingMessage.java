package com.jinju.demo.model;

import java.io.Serializable;

public class ChattingMessage implements Serializable{
    private String message;
    private String user;
    private String timestamp;

    public ChattingMessage() {
    }
    public String getTimestamp(){
        return timestamp;
    }
    public void setTimestamp(String timestamp){
        this.timestamp = timestamp;
    }
    public String getUser(){
        return user;
    }
    public void setUser(String user){
        this.user = user;
    }
    public ChattingMessage(String message, String user) {
        this.user = user;
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
    public void setContent(String message){
        this.message = message;
    }
    @Override
    public String toString() {
        return "Message{" +
                "user='" + user + '\'' +
                ", message='" + message + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}