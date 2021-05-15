package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentRepository repository = new InMemoryStudentRepository();

    //REST Endpoints
    //create student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student) {

        repository.save(student);
    }

    //retrieve a student
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id) {

        return repository.get(id);
    }

    //delete a student
    @DeleteMapping("/student/remove/{id}")
    public void deleteStudent(@PathVariable String id) {

        repository.delete(id);
    }

    //update a student
    @PutMapping("student/update/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable String id) {

        repository.update(id, student);
    }
    //get age
    @GetMapping("/student/age/{id}")
    public String getStudentAgeGroup(@PathVariable String id) {

        return repository.getAge(id);
    }

}
