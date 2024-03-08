package ru.hse.facade;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class Student {
    private UUID id;
    private String name;
    private String surname;
    private String secondName;
    private String course;

    public Student() {
    }

    public Student(UUID id, String name, String surname, String secondName, String course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.course = course;
    }

}