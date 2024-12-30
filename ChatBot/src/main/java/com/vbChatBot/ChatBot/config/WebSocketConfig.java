package com.vbChatBot.ChatBot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {


    public void configurationMessageB(org.springframework.messaging.simp.config.MessageBrokerRegistry registry){

        registry.enableSimpleBroker(("/topic"));
        registry.setApplicationDestinationPrefixes("/app");

    }
    public void registerStompEndpoints(StompEndpointRegistry registry){
         registry.addEndpoint("/chat").setAllowedOrigins("*").withSockJS();
    }
}
