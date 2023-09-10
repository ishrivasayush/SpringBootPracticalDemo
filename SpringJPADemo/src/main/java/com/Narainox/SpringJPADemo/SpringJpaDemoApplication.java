package com.Narainox.SpringJPADemo;

import com.Narainox.SpringJPADemo.Models.Book;
import com.Narainox.SpringJPADemo.Models.BookCategory;
import com.Narainox.SpringJPADemo.Repository.BookCategoryRepository;
import com.Narainox.SpringJPADemo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class SpringJpaDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}

	@Autowired      //Injecting the Dependency
	BookRepository bookRepository;

	@Autowired
	BookCategoryRepository bookCategoryRepository;

	@Autowired
	JpaRepository<Book,Integer> jp;

	@Override
	public void run(String... args) throws Exception {

		Book book1=new Book("Java","Ayush",456);
		Book book2=new Book("Python","Abhay",459);

		Book book3=new Book("HtMl","Aditi",6789,1);
		Book book4=new Book("CSS","Avedika",679,1);

		bookRepository.save(book3);
		bookRepository.save(book4);

//		Set<Book> books=new HashSet();
//		books.add(book1);
//		books.add(book2);


		//bookCategoryRepository.save(new BookCategory("New Programming languages"));
		//bookCategoryRepository.save(new BookCategory("Programming languages",books));


































//		bookRepository.save(book7);
//		bookRepository.saveAll(b);
//		System.out.println(b);

//		System.out.println(bookRepository.findByAuthorName("Ayush "));
//		System.out.println(bookRepository.findByAuthorName("Abhay"));

//		System.out.println(bookRepository.findByAuthors("Abhay"));



		// jp.save(book);














		//Make the Java development more faster
		//To remove temp file because it is executed when the our
		// applictaion is started so we can add that code in this run function.
		//Executed only once when the application started
	}
}
