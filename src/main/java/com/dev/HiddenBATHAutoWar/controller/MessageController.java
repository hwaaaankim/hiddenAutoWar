package com.dev.HiddenBATHAutoWar.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    private final SimpMessagingTemplate messagingTemplate;

    public MessageController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    // 모든 사용자에게 메시지 전송
    @MessageMapping("/sendToAll")
    @SendTo("/topic/all")
    public String sendToAll(String message) {
        return message;
    }

    // 게스트 사용자에게만 메시지 전송
    public void sendToGuests(String message) {
        messagingTemplate.convertAndSend("/topic/guests", message);
    }

    // 특정 사용자에게만 메시지 전송 (예: ID가 "member"인 사용자)
    public void sendToMember(String message) {
        messagingTemplate.convertAndSendToUser("member", "/topic/member", message);
    }
}

