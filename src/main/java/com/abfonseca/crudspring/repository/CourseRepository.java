package com.abfonseca.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abfonseca.crudspring.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
