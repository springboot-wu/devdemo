package com.example.devdemo.bean;

import java.math.BigDecimal;

public class car {
  // init
    private String  name;
 private Integer num;
 private BigDecimal a;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "car{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", a=" + a +
                '}';
    }
}
