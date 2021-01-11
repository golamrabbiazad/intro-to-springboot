package com.vscode.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student brian = new Student(
                    "Brian Holt",
                    "brianholt@gmail.com",
                    LocalDate.of(1987, Month.MAY, 2),
                    34
            );
            Student will = new Student(
                    "Will Sentance",
                    "willsentance@gmail.com",
                    LocalDate.of(1984, Month.JUNE, 11),
                    37
            );
            repository.saveAll(List.of(brian, will));
        };
    }
}
