package com.Narainox.SpringJPADemo.Repository;

import com.Narainox.SpringJPADemo.Models.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory,Integer> {
}
