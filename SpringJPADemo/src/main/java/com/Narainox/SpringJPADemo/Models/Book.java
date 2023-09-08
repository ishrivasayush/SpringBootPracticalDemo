package com.Narainox.SpringJPADemo.Models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
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