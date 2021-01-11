package com.vscode.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Brian Holt", "brianholt@gmail.com", LocalDate.of(1987, Month.MAY, 2), 34)
        );
    }
}
