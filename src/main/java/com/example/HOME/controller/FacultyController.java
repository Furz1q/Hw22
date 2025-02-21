package com.example.HOME.controller;

import com.example.HOME.model.Faculty;
import com.example.HOME.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/faculties")
public class FacultyController {

    private final FacultyService facultyService;

    @Autowired
    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }


    @GetMapping("/search")
    public List<Faculty> searchFaculties(@RequestParam String name, @RequestParam String color) {
        return facultyService.searchFaculties(name, color);
    }
}
