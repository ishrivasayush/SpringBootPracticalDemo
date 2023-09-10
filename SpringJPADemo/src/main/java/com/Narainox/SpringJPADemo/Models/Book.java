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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "book_name")
    private String name;
    @Column(name = "book_author_name")
    private String authorName;
    private int cost;



    @ManyToOne
    @JoinColumn      //Join the primary key of the table BookCategory
    private BookCategory bookCategory;


    public Book( String name, String authorName, int cost, int bookCategory) {
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
        this.bookCategory=new BookCategory();
        this.bookCategory.setId(bookCategory);
    }


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