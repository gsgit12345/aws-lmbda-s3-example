package com.example.aws.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    Logger logger = LoggerFactory.getLogger(MessageListener.class);

    @SqsListener(value = "https://sqs.ap-south-1.amazonaws.com/382974126643/ec2-s3-sqs-queue")
    public void loadMessageFromQueue(String message){
        logger.info("Message consumed from the Queue {}", message);

    }
}