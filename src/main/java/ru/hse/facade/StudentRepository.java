package ru.hse.facade;

import java.util.List;

public interface StudentRepository {
    int createStudent(String name, String surname, String secondName, String course);
    List<Student> getAllStudents();
}
