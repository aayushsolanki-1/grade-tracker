package com.aayush.grade_tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    // Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // Add a student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    // Delete a student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        repository.deleteById(id);
    }

    // Get average grade
    @GetMapping("/average")
    public Map<String, Double> getAverage() {
        List<Student> all = repository.findAll();
        OptionalDouble avg = all.stream()
                .mapToDouble(Student::getGrade)
                .average();
        return Map.of("average", avg.orElse(0.0));
    }
}