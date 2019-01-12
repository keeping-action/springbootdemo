package com.ivmiao.service.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ivmiao.client.dto.StudentDTO;
import com.ivmiao.client.service.StudentService;
import com.ivmiao.service.entity.StudentDO;
import com.ivmiao.service.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright CAINIAO WMS. All rights reserved. Organization : Outbound Optimization Center
 * <p>
 * add your describe
 *
 * @author zhiJin
 * @date 2019/1/10
 */

@Service("userService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public boolean addStudent(StudentDTO studentDTO) {
        System.out.println("add success");
        return false;
    }

    public StudentDTO getStudentByName(String name) {

        StudentDO studentDO =  studentMapper.getStudentByName(name);
        return JSONObject.parseObject(JSON.toJSONString(studentDO),StudentDTO.class);

    }

    public List<StudentDTO> getList() {
        return null;
    }
}

    