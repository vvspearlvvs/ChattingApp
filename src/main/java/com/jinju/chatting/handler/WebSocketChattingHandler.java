package com.jinju.chatting.handler;
/*
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jinju.chatting.dao.ChatMessage;
import com.jinju.chatting.dao.ChatRoom;
import com.jinju.chatting.service.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
@RequiredArgsConstructor
@Slf4j

public class WebSocketChattingHandler extends TextWebSocketHandler {
    private final ObjectMapper objectMapper;
    private final ChatService chatService;

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception{
        String payload = message.getPayload();
        log.info("#클라이언트로부터 받은 메세지, payload {}",payload);

        //TextMessage textMessage = new TextMessage("chatting 서버접속 테스트 완료 ");
        //session.sendMessage(textMessage);

        ChatMessage chatMessage = objectMapper.readValue(payload,ChatMessage.class);
        ChatRoom room = chatService.findRoomById(chatMessage.getRoomid());
        room.handleActions(session,chatMessage,chatService);

    }
}
*/