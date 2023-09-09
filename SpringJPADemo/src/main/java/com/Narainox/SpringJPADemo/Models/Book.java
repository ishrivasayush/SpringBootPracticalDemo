package com.Narainox.SpringJPADemo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Book {
    public Book(String name, String authorName, int cost) {
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String authorName;
    private int cost;
}

/*
Book.java   --> BookTable
Insert the book
Get the Book

Repository
---> JPARepository     Interface    hibernate is a implementation
-----> save(object o)
 */