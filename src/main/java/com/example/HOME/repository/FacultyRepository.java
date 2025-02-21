package com.example.HOME.repository;

import com.example.HOME.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    List<Faculty> findByNameIgnoreCaseContainingOrColorIgnoreCaseContaining(String name, String color);
}
