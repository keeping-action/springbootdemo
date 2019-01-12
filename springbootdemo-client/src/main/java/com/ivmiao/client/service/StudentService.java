package com.ivmiao.client.service;

import com.ivmiao.client.dto.StudentDTO;

import java.util.List;

/**
 * Copyright CAINIAO WMS. All rights reserved. Organization : Outbound Optimization Center
 * <p>
 * add your describe
 *
 * @author zhiJin
 * @date 2019/1/10
 */

public interface StudentService {

    boolean addStudent(StudentDTO studentDTO);

    StudentDTO getStudentByName(String name);

    List<StudentDTO> getList();
}
