package com.example.lms;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.util.List;

@Setter
@Getter
@Entity
public class BookStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String bookstore;

    @OneToMany(mappedBy = "bookStore")
    private List<BookEntity> bookStoreList;





}
