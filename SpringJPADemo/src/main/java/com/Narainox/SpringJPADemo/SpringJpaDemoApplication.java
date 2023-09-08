package com.Narainox.SpringJPADemo;

import com.Narainox.SpringJPADemo.Models.Book;
import com.Narainox.SpringJPADemo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

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
		Book book=new Book();
		bookRepository.save(book);

		jp.save(book);














		//Make the Java development more faster
		//To remove temp file because it is executed when the our
		// applictaion is started so we can add that code in this run function.
		//Executed only once when the application started
	}
}
