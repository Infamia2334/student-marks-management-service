package io.infamia2334.marksmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.infamia2334.marksmanager.models.Result;
import io.infamia2334.marksmanager.models.Student;
import io.infamia2334.marksmanager.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        try {
            List<Student> studentData = studentService.getAllStudents();
            return ResponseEntity.ok().body(studentData);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable String id) {
        try {
            Student student = studentService.getStudent(id);
            return ResponseEntity.ok().body(student);
        } catch(Exception e) {
            return ResponseEntity.badRequest().body(null);
        } 
    }

    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        try {
            studentService.createStudent(student);
            return ResponseEntity.created(null).body("Success");
        } catch (Exception error) {
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

    @PutMapping("/result/{id}")
    public ResponseEntity<Object> addResult(@PathVariable("id") String id, @RequestBody Result result) {
        try {
            studentService.addNewResult(id, result);
            return ResponseEntity.created(null).body("Marks Updated");
        } catch (IllegalStateException error) {
            return ResponseEntity.badRequest().body(error.getMessage());
        }
         catch (Exception error) {
            return ResponseEntity.internalServerError().body(error.getMessage());
        }
    }
}   
