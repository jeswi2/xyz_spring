package com.nestdigital.xyzbackend.dao;

import com.nestdigital.xyzbackend.Model.StudentModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {
    @Modifying
    @Query(value = "DELETE FROM `students` WHERE `id`=:id",nativeQuery = true)
    void deleteStudentId(Integer id);
@Query(value = "SELECT `id`, `admno`, `blood`, `college`, `department`, `dob`, `g_address`, `g_name`, `name`, `pa_email`, `pa_name`, `rollno` FROM `students` WHERE `admno` =:admno OR `name` = :name",nativeQuery = true)
    List<StudentModel> searchstudent(String name,Integer admno);
}
