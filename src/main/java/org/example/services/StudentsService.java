package org.example.services;

import org.example.entities.Students;
import org.example.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    @Autowired
    private StudentsRepository studentsRepository;


    public List<Students> getAllStudents() {
        return studentsRepository.findAll();
    }

    public void addStudent(Students students) {
        studentsRepository.save(students);
    }
}
