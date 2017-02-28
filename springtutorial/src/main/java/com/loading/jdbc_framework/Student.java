package com.loading.jdbc_framework;

/**
 * Created by wuyuxiang on 2017/2/28.
 */
public class Student {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id:").append(id).append(",name:").append(name).append(",age:").append(age);
        return sb.toString();
    }
}
