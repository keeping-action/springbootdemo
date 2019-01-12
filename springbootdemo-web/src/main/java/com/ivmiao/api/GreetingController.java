package com.ivmiao.api;

import com.ivmiao.client.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright CAINIAO WMS. All rights reserved. Organization : Outbound Optimization Center
 * <p>
 * add your describe
 *
 * @author zhiJin
 * @date 2019/1/10
 */

@RestController
public class GreetingController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {

        return "hello "+ studentService.getStudentByName(name);
    }

}

    