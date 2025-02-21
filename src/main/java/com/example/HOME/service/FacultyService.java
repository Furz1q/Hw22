package com.example.HOME.service;

import com.example.HOME.model.Faculty;
import com.example.HOME.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {

    private final FacultyRepository facultyRepository;

    @Autowired
    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public List<Faculty> searchFaculties(String name, String color) {
        return facultyRepository.findByNameIgnoreCaseContainingOrColorIgnoreCaseContaining(name, color);
    }
}
