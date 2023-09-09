package com.Narainox.SpringJPADemo.Repository;

import com.Narainox.SpringJPADemo.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    public List<Book> findByAuthorName(String name);

   // @Query(value = "Select * from Book b where b.author_name=:my_name", nativeQuery = true)
    //public List<Book> findByAuthor(String my_name);

    /*
    JPQL here
    when we use the jpql than the name of authorName should be same as the properties
    of Book Model .
    and =: same as method parameter
     */
    @Query(value = "select b from Book b where b.authorName=:authors_name")
    public List<Book> findByAuthors(String authors_name);
}
