package io.infamia2334.marksmanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.infamia2334.marksmanager.models.Result;
import io.infamia2334.marksmanager.models.Student;
import io.infamia2334.marksmanager.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        List<Student> students =  studentRepository.findAll();
        return students;
    }

    public Student getStudent(String id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.get();
    }

    public void createStudent(Student newStudent) {
        studentRepository.save(newStudent);
    }

    public void addNewResult(String id, Result updatedMarks) {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isEmpty()) {
            throw new IllegalStateException("Student not found!");
        }
        Student studentData = student.get();
        studentData.getResults().add(updatedMarks);
        studentRepository.save(studentData);
    }
}
