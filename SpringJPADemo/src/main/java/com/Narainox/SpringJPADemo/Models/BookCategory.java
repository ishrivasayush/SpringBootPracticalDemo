package com.Narainox.SpringJPADemo.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    //One to many
    //one book category has many books
    @OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
    private Set<Book> books;

    public BookCategory(String name) {
        this.name = name;
    }

    public BookCategory(String name , Set<Book> books) {
        this.books = books;
        this.name=name;
        this.books.forEach(x->x.setBookCategory(this));
    }

    // AUTO
    // insert the first entry in table 1 --> 1   hibernate_sequence
    // insert the first entry in table 2 --> 2
    // insert the second entry in table 2 --> 3

    //IDENTITY
    // insert the first entry in table 1 --> 1
    // insert the first entry in table 2 --> 1
    // insert the second entry in table 2 --> 2
}
