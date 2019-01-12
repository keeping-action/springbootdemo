package com.ivmiao.service;

import com.ivmiao.service.entity.StudentDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface StudentMapper {

  @Select("SELECT * FROM student WHERE name = #{name}")
  StudentDO getStudentByName(@Param("name") String name);

  
} 
