// package com.chat.app.config;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.messaging.simp.config.MessageBrokerRegistry;
// import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
// import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
// import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

// @Configuration
// @EnableWebSocketMessageBroker
// public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

//   @Override
//   public void configureMessageBroker(MessageBrokerRegistry registry) {
    
//     // TODO Auto-generated method stub
//     // WebSocketMessageBrokerConfigurer.super.configureMessageBroker(registry);
//     registry.addEndpoint("/chat")
//             .setAllowedOrigins("http://localhost:8080")
//             .withSockJS();
//   }

//   @Override
//   public void registerStompEndpoints(StompEndpointRegistry registry) {
//     // TODO Auto-generated method stub
//     // WebSocketMessageBrokerConfigurer.super.registerStompEndpoints(registry);

//     //set message broker
//     registry.enableSimpleBroker("/topic");    // who ever will subscribe to this topic will get message from broadcast

//     //expect message with /app/sendmessage
//     registry.setApplicationDestinationPrefixes("/app");
    

//   }
  
// }


package com.chat.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // Configure message broker
        registry.enableSimpleBroker("/topic"); // broadcast messages to this topic
        registry.setApplicationDestinationPrefixes("/app"); // messages sent to /app will be routed to @MessageMapping methods
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Configure WebSocket endpoint
        registry.addEndpoint("/chat")
                .setAllowedOrigins("http://localhost:8080")
                .withSockJS();
    }
}
