package com.ivmiao.service.entity;

/**
 * Copyright CAINIAO WMS. All rights reserved. Organization : Outbound Optimization Center
 * <p>
 * add your describe
 *
 * @author zhiJin
 * @date 2019/1/12
 */

public class StudentDO {

    private Long id;
    private String name;
    private Long age;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentDO{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", address='" + address + '\'' +
            '}';
    }
}

    