package com.example.devdemo.controller;

import com.example.devdemo.bean.MessageBean01;
import com.example.devdemo.bean.MessageBean02;
import com.example.devdemo.service.MessageService;
import com.example.devdemo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
public class MessageController {

    @Autowired
    private MessageService  messageService;

    @GetMapping("/getMessage")
    public ResultUtil<List<MessageBean01>>  getMessage(){

        ResultUtil<List<MessageBean01>> message =messageService.getMessage();
        return   message;
    }
}
