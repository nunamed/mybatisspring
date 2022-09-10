package com.pojo;

import org.springframework.stereotype.Repository;

@Repository
public class UserImpl implements User{
    int id = 0;
    String name ="hh";
    int age = 18;
    boolean sex = true;
    @Override
    public String toString() {
        return "UserImpl [age=" + age + ", id=" + id + ", name=" + name + ", sex=" + sex + "]";
    }
    
}
