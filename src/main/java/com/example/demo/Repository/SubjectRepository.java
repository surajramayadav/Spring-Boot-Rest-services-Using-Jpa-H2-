package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Subject;

public interface SubjectRepository extends CrudRepository<Subject, String> {

}
