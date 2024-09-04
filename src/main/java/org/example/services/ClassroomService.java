package org.example.services;

import org.example.entities.Classroom;
import org.example.repositories.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;

    public void save(Classroom classroom) {
        classroomRepository.save(classroom);
    }

    public List<Classroom> getAllClassrooms() {
        saveAll();
        return classroomRepository.findAll();
    }

    public void saveAll(){
        List<Classroom> list = Arrays.asList(
                new Classroom(1, "1A", null),
                new Classroom(2, "1B", null),
                new Classroom(3, "2A", null),
                new Classroom(4, "2B", null),
                new Classroom(5, "2C", null),
                new Classroom(6, "3A", null)
        );

        classroomRepository.saveAll(list);
    }
}
