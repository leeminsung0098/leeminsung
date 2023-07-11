package com.example.lms;

import org.springframework.data.jpa.repository.JpaRepository;

public interface    BookStoreRepository extends JpaRepository<BookStore, Integer> {
//    BookStore findByBookstore(String bookstore);


}
