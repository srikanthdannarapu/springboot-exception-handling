package com.exceptionhandling;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.exceptionhandling.model.Book;
import com.exceptionhandling.repository.BookRepository;

@SpringBootApplication
public class ExceptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionHandlingApplication.class, args);
	}
	
	 @Bean
	    CommandLineRunner initDatabase(BookRepository repository) {
	        return args -> {
	            repository.save(new Book("Java Lambdas", "Srikanth", new BigDecimal("15.41")));
	            repository.save(new Book("Spring boot Simple", "Anil Suram", new BigDecimal("9.69")));
	            repository.save(new Book("AWS Tutorial", "Rama Raja", new BigDecimal("47.99")));
	        };
	    }

}
