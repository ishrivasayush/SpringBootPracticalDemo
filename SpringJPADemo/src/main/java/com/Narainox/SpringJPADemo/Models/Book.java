package com.Narainox.SpringJPADemo.Models;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Table(name="my_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "book_name")
    private String name;
    @Column(name = "book_author_name")
    private String authorName;
    private int cost;


    public Book(String name, String authorName, int cost) {
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
    }
}

/*
Book.java   --> BookTable
Insert the book
Get the Book

Repository
---> JPARepository     Interface    hibernate is a implementation
-----> save(object o)
 */