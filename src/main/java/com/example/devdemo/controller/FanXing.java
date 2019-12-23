package com.example.devdemo.controller;

import java.util.ArrayList;
import java.util.List;

public class FanXing {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        System.out.println("泛型编译完后相等============");
        System.out.println(list.getClass() == list2.getClass());

    }
}
