package com.example.devdemo.service;

public class TDemo01 <T>{

     private  T t;
     public  T  getT(){

         return t;
     }
    public <T> T  fun(T t){

       return  t;
    }

    public  static <T> T  test01(T t){

        return  t ;
    }
}
