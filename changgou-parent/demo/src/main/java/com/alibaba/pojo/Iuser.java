package com.alibaba.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 作 者: 陆奉学
 * 工 程 名:  springboot-thymeleaf
 * 包    名:  com.alibaba.pojo
 * 日    期:  2021-09-2021/9/9
 * 时    间:  23:46
 * 描    述:
 */

public class Iuser {
    private Integer id;
    private  Integer age;
    private  String name;
    private String sex;

    public Iuser id(Integer id) {
        this.id = id;
        return this;
    }
    public Iuser age(Integer age) {
        this.age = age;
        return this;
    }
    public Iuser name(String name) {
        this.name = name;
        return this;
    }
    public Iuser sex(String sex) {
        this.sex = sex;
        return this;
    }
    public Iuser() {

    }

    public Iuser(Integer id, Integer age, String name, String sex) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Iuser{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
