package com.example.studentapi;

public interface StudentRepository {

    void save(Student student);

    Student get(String id);

    void delete(String id);

    void update(String id, Student student);

    String getAge(String id);
}
