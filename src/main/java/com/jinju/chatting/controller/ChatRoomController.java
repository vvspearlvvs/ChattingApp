package com.jinju.chatting.controller;

import com.jinju.chatting.dao.ChatRoom;
import com.jinju.chatting.service.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/chat")
public class ChatRoomController {
    private final com.jinju.chatting.service.ChatRoomRepository ChatRoomRepository;

    //채팅리스트 화면
    @GetMapping("/room")
    @ResponseBody
    public String rooms(Model model){
        return "/chat/room";
    }
    //모든채팅목록 화면
    @GetMapping("/rooms")
    @ResponseBody
    public List<ChatRoom> room() {
        return ChatRoomRepository.findAllRoom();
    }
    //채팅방 생성
    @GetMapping("/room")
    @ResponseBody
    public ChatRoom crateroom(@RequestParam String name){
        return ChatRoomRepository.createChatRoom(name);
    }
    //채팅방 입장
    @GetMapping("/room/enter/{roomid}")
    @ResponseBody
    public String roomDetail(Model model, @PathVariable String roomid){
        model.addAttribute("roomid",roomid);
        return "/chat/roomdetail";
    }
    //특정채팅방 조회
    @GetMapping("/room/{roomid}")
    @ResponseBody
    public ChatRoom roominfo(@PathVariable String roomid){
        return ChatRoomRepository.findRoomById(roomid);
    }
}
