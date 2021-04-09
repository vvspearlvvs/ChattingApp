package com.jinju.demo.controller;


import com.jinju.demo.constants.KafkaConstants;
import com.jinju.demo.model.ChattingMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping(value="/kafka")
public class ChattingController {

    private KafkaTemplate<String,ChattingMessage> kafkaTemplate;

    //// "url/app/message"로 들어오는 메시지를 "/topic/public"을 구독하고있는 사람들에게 송신
    @PostMapping(value = "/publish")
    public void sendMessage(ChattingMessage message) throws Exception {
        /*
        message.setTimeStamp(System.currentTimeMillis());
        chattingHistoryDAO.save(message);
        sender.send(BOOT_TOPIC, message);
        */
        log.info("Produce message : "+message.toString());
        message.setTimestamp(LocalDateTime.now().toString());
        kafkaTemplate.send(KafkaConstants.KAFKA_TOPIC,message).get();

    }

    @MessageMapping("/sendMessage")
    @SendTo("/topic/group")
    public ChattingMessage broadcastGroupMessage(@Payload ChattingMessage message) throws Exception {
        return message;
    }


}