package com.example.messagesenderapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class MessageSenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageSenderApplication.class, args);
    }

}
