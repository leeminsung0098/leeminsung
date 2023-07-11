package com.example.lms;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityRepository extends JpaRepository<BookEntity, Integer> {
    BookEntity findByTitle(String title);

}