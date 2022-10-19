package com.nestdigital.xyzbackend.dao;

import com.nestdigital.xyzbackend.Model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {
}
