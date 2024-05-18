package za.ac.tut.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("za.ac.tut.lms")
public class LibraryManagementSystem1Application {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSystem1Application.class, args);
	}

}
