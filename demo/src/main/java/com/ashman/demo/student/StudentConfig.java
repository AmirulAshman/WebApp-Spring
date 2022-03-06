package com.ashman.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student ashman = new Student("Ashman", "amirulashman.amsham@gmail.com", LocalDate.of(1997, Month.JANUARY, 2));
            Student anis = new Student("Anis", "anisamanina.amsham@gmail.com", LocalDate.of(1994, Month.MARCH, 29));

            // Save dummy data to database
            repository.saveAll(List.of(ashman,anis));
        };
    }
}
