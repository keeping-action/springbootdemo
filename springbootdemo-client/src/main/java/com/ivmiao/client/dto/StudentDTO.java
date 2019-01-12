package com.ivmiao.client.dto;

import java.io.Serializable;

/**
 * Copyright CAINIAO WMS. All rights reserved. Organization : Outbound Optimization Center
 * <p>
 * add your describe
 *
 * @author zhiJin
 * @date 2019/1/10
 */

public class StudentDTO implements Serializable {

    private Long id;
    private String name;
    private Long age;
    private String address;

    public StudentDTO() {
    }

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

    public StudentDTO(Long id, String name, Long age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", address='" + address + '\'' +
            '}';
    }

}

    