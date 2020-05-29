package com.ruoyi.system.domain;

/**
 * @author ：fsh
 * @date ：Created in 2020/5/29
 * @description ：
 * @version: 1.0
 */
public class Admin {
    private String id;
    private int age;

    public Admin() {
    }

    public Admin(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
