package com.sqs.springsqspoc.controllers;

import com.sqs.springsqspoc.services.SqsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/sqs")
public class SqsController {

    private SqsService sqsService;

    @Autowired
    public SqsController(SqsService sqsService) {
        this.sqsService = sqsService;
    }

    @PostMapping("/quotes")
    @ResponseStatus(HttpStatus.CREATED)
    public void sendQuote(@RequestBody @Valid Map<String, Object> payload) {
        this.sqsService.sqsSend(payload);
    }
}
