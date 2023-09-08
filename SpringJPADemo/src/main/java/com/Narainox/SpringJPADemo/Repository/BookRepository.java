package com.Narainox.SpringJPADemo.Repository;

import com.Narainox.SpringJPADemo.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
