package com.example.messagesenderapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageSender {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${springjms.detailsQueue}")
    private String queue;

    @PostMapping("/message")
    public void sendMessage(@RequestBody String message) {
        jmsTemplate.convertAndSend(queue, message);
        System.out.println("Message sent: " + message);
    }
}