package com.la.springboot.webapp.repositories;

import java.util.Optional;

import com.la.springboot.webapp.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    
    @Query("select s from Student s left join fetch s.courses where s.id=?1")
    Optional<Student> findOneWithCourses(Long id);
}
