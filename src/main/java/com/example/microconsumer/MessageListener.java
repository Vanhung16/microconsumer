package com.example.microconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @RabbitListener(queues = MQConfig.QUEUE)
    public void showListerner(CustomMessage customMessage){
        System.out.println(customMessage.getMessage());
    }
}
