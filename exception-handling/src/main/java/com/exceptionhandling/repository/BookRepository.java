package com.exceptionhandling.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.exceptionhandling.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}