package com.ivmiao.sprintbootdemo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ivmiao.client.dto.StudentDTO;
import com.ivmiao.client.service.StudentService;

import java.util.List;

/**
 * Copyright CAINIAO WMS. All rights reserved. Organization : Outbound Optimization Center
 * <p>
 * add your describe
 *
 * @author zhiJin
 * @date 2019/1/12
 */
@Service(version = "${demo.service.version}")
public class NewStudentServiceImpl implements StudentService {

    public boolean addStudent(StudentDTO studentDTO) {
        return false;
    }

    public StudentDTO getStudentByName(String name) {
        System.out.println("--------------");
        return new StudentDTO();
    }

    public List<StudentDTO> getList() {
        return null;
    }
}

    