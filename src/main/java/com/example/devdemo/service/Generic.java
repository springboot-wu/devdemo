package com.example.devdemo.service;

import java.util.ArrayList;

//此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
//在实例化泛型类时，必须指定T的具体类型
public class Generic<T>{ 
    //key这个成员变量的类型为T,T的类型由外部指定  
    private T key;
 
    public Generic(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }
 
    public T getKey(){ //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }
}

class  test{
    public void showKeyValue1(Generic<Number> obj){
        System.out.println("\"泛型测试\",\"key value is \" +"+ obj.getKey());



        int[]  array = new int[10];//这是错误的
        array[0]=1;
    }
    Generic<Integer> gInteger = new Generic<Integer>(123);
    Generic<Number> gNumber = new Generic<Number>(456);





}