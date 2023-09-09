package com.Narainox.SpringJPADemo;

import com.Narainox.SpringJPADemo.Models.Book;
import com.Narainox.SpringJPADemo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringJpaDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}

	@Autowired      //Injecting the Dependency
	BookRepository bookRepository;

	@Autowired
	JpaRepository<Book,Integer> jp;

	@Override
	public void run(String... args) throws Exception {
		Book book1=new Book("Java","Ayush",5500);
		Book book2=new Book("Python","Abhay",5200);

		bookRepository.save(book1);
		bookRepository.save(book2);



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
