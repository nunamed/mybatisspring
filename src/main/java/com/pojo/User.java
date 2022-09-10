package com.pojo;

public interface User {
    int id=0;
    String name=null;
    int age=0;
    boolean sex=false;
    String toString();
    
    // public int getId() {
    //     return id;
    // }
    // public void setId(int id) {
    //     this.id = id;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    // public void setSex(boolean sex) {
    //     this.sex = sex;
    // }
    // public String getName() {
    //     return name;
    // }
    // public int getAge() {
    //     return age;
    // }
    // public boolean isSex() {
    //     return sex;
    // }
    // @Override
    // public String toString() {
    //     String xb=sex?"男":"女";
    //     return "User [age=" + age + ", id=" + id + ", name=" + name + ", sex=" + xb + "]";
    // }
}
