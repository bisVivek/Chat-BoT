package com.vbChatBot.ChatBot.Controller;

import com.vbChatBot.ChatBot.Model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(ChatMessage chatMessage){
        return chatMessage;
    }

    @MessageMapping("/newUser")
    @SendTo("/topic/public")
    public ChatMessage newUser (ChatMessage chatMessage){
        chatMessage.setType("Join");
        return chatMessage;
    }
}
