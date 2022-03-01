package com.example.PaginationAndSorting.repository;

import java.util.List;

import com.example.PaginationAndSorting.model.Tutorial;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

    Page<Tutorial> findByPublished(boolean published, Pageable pageable);
    Page<Tutorial> findByTitleContaining(String title, Pageable Pageable);
    List<Tutorial> findByTitleContaining(String title, Sort sort);    
}


