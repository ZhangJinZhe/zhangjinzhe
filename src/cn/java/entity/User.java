/**
 * Project Name:easybuy
 * File Name:User.java
 * Package Name:cn.java.entity
 * Date:2017年7月24日上午11:51:59
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package cn.java.entity;

import java.util.Date;

/**
 * Description: <br/>
 * Date: 2017年7月24日 上午11:51:59 <br/>
 * 
 * @author zhangJZ
 * @version
 * @see
 */
public class User {
    private String name;

    private Integer age;

    private Date date;

    public User() {

        super();
        // Auto-generated constructor stub

    }

    public User(String name, Integer age, Date date) {
        super();
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", date=" + date + "]";
    }

}
