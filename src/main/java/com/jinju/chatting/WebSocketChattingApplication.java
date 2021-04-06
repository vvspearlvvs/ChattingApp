package com.jinju.chatting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebSocketChattingApplication {

	public static void main(String[] args) {
		System.out.print("Server Started..");
		SpringApplication.run(WebSocketChattingApplication.class, args);

	}

}
