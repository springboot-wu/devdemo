package com.example.devdemo.service.impl;

import com.example.devdemo.bean.car;
import com.example.devdemo.service.TDemo01;

public class Demo02 {

    public static void main(String[] args) {

        car  c = new car();
        c.setName("zhangsan");
        String s = TDemo01.test01("122");
        car car = TDemo01.test01(c);
        System.out.println(car);
        System.out.println("==================");

        TDemo01 <car> td = new TDemo01<car>();
        com.example.devdemo.bean.car t = td.getT();
        System.out.println(t);
    }
}
