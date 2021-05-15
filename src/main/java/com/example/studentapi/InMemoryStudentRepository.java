package com.example.studentapi;

import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {

    Map<String,Student> database = new HashMap<>();

    @Override
    public void save(Student student) {
        //save student
        database.put(student.id, student);
        System.out.println("Student "+student.name+ " Saved");
    }

    @Override
    public  Student get(String id) {
        return  database.get(id);
    }

    @Override
    public void delete(String id) {

        database.remove(id);
        System.out.println("Deleted student " + id);
    }

    @Override
    public void update(String id, Student student) {

        database.put(id, student);
        System.out.println("Updated student " + student.name);
    }

    @Override
    public  String getAge(String id) {
        int age = database.get(id).age;
        String group = "";
        if(age<20 && age>=13) {
            group = "Teenager.";
        }
        return group;
    }
}
