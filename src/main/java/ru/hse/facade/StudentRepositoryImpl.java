package ru.hse.facade;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class StudentRepositoryImpl implements StudentRepository {
    private final JdbcTemplate jdbcTemplate;
    @Override
    public int createStudent(String name, String surname, String secondName, String course) {
        return 0;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }
}
