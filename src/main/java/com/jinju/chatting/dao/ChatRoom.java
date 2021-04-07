package com.jinju.chatting.dao;

//import com.jinju.chatting.service.ChatService;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.socket.WebSocketSession;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/*
//websocket.ver
@Getter
public class ChatRoom {
    private String roomId; //채팅방id
    private String name;   //채팅방이름
    //입장한 클라이언트들의 세션정보리스트
    private Set<WebSocketSession> sessions = new HashSet<>();

    @Builder
    public ChatRoom(String roomId, String name) {
        this.roomId = roomId;
        this.name = name;
    }

    public void handleActions(WebSocketSession session, ChatMessage chatMessage, ChatService chatService) {
        if (chatMessage.getType().equals(ChatMessage.MessageType.ENTER)) {
            sessions.add(session);
            chatMessage.setMessage(chatMessage.getSender() + "님이 입장했습니다.");
        }
        sendMessage(chatMessage, chatService);
    }

    public <T> void sendMessage(T message, ChatService chatService) {
        sessions.parallelStream().forEach(session -> chatService.sendMessage(session, message));
    }
}
*/
@Getter
@Setter
//stomp.ver
public class ChatRoom{
    private String roomid; //채팅방id
    private String name;   //채팅방이름

    public static ChatRoom create(String name){
        ChatRoom chatroom = new ChatRoom();
        chatroom.roomid = UUID.randomUUID().toString();
        chatroom.name = name;
        return chatroom;
    }
}