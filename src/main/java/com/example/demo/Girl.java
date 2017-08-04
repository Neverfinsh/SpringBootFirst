package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/*
 * Created by Administrator on 2017\8\2 0002.
 */
@ConfigurationProperties(prefix = "girl")
public class Girl {

  private  int age;
  private  String cupSize;


  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCupSize() {
    return cupSize;
  }

  public void setCupSize(String cupSize) {
    this.cupSize = cupSize;
  }
}
