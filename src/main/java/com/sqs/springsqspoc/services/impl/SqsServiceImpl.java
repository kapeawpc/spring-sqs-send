package com.sqs.springsqspoc.services.impl;

import com.sqs.springsqspoc.services.SqsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

import static com.sqs.springsqspoc.constants.Constants.QUOTE_QUEUE;


@Slf4j
@Service
public class SqsServiceImpl implements SqsService {

    private QueueMessagingTemplate queueMessagingTemplate;

    @Autowired
    public SqsServiceImpl(QueueMessagingTemplate queueMessagingTemplate) {
        this.queueMessagingTemplate = queueMessagingTemplate;
    }

    @Override
    public void sqsSend(Map<String, Object> payload) {

        log.info("Sending message {} to AWS-SQS", payload);
        this.queueMessagingTemplate.convertAndSend(QUOTE_QUEUE, payload);
    }
}
