package com.ciaranmckenna.springbooth2schooladmin.repository;

import com.ciaranmckenna.springbooth2schooladmin.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRespository extends CrudRepository<Student, Integer> {
}
