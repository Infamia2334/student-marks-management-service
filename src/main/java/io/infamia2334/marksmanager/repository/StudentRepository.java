package io.infamia2334.marksmanager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.infamia2334.marksmanager.models.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    
}
