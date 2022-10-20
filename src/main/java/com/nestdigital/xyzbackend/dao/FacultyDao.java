package com.nestdigital.xyzbackend.dao;

import com.nestdigital.xyzbackend.Model.FacultyModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FacultyDao extends CrudRepository<FacultyModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `faculties` WHERE `id` =:id",nativeQuery = true)
    void deletefacultyById(Integer id);

@Query(value = "SELECT `id`, `address`, `department`, `designation`, `dob`, `doj`, `name`, `number`, `qualification` FROM `faculties` WHERE `name` =:name",nativeQuery = true)
    List<FacultyModel> searchfaculty(String name);
}
