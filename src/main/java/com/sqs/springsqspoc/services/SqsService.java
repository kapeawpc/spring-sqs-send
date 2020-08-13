package com.sqs.springsqspoc.services;

import java.util.Map;

public interface SqsService {

    void sqsSend(Map<String, Object> payload);
}
