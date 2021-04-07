package com.jinju.chatting.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@RequiredArgsConstructor
@EnableWebSocketMessageBroker
/*
//websokcet.ver
@EnableWebSocket
public class WebSockConfig implements WebSocketConfigurer {
    private final WebSocketHandler webSocketHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(webSocketHandler,"/ws/chat").setAllowedOrigins("*");
    }

}
*/

//stomp.ver
public class WebSockConfig implements WebSocketMessageBrokerConfigurer{
     public void configureMessageBroker(MessageBrokerRegistry config){
        config.enableSimpleBroker("/sub");
        config.setApplicationDestinationPrefixes("/pub");

    }

    public void registerStompEndpoints(StompEndpointRegistry registry){
         registry.addEndpoint("/ws-stomp").setAllowedOrigins("*")
                 .withSockJS();
    }


}