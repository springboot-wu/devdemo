package com.example.devdemo.service;

import com.example.devdemo.bean.MessageBean01;
import com.example.devdemo.util.ResultUtil;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MessageService {

    public ResultUtil<List<MessageBean01>> getMessage(){

        MessageBean01  mb = new MessageBean01();
        MessageBean01  mb1 = new MessageBean01("1","2","3","4","anm","df","we","sd",new Date(),new Date(),"11",
                "11","ds","ds", BigDecimal.valueOf(12.22),BigDecimal.valueOf(12.22),"ew","sd","sd","12","ds","1212","12","12","121","12");
        MessageBean01  mb2 = new MessageBean01("1","2","3","4","anm","df","we","sd",new Date(),new Date(),"11",
                "11","ds","ds", BigDecimal.valueOf(12.22),BigDecimal.valueOf(12.22),"ew","sd","sd","12","ds","1212","12","12","121","12");

        List<MessageBean01>  list = new ArrayList<>();
        list.add(mb1);
        list.add(mb2);
        ResultUtil.result(200,"string",list);

        return   ResultUtil.result(200,"string",list);

    }
}
