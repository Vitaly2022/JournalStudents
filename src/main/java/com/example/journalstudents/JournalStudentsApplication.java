package com.example.journalstudents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = { "com.example.journalstudents" })
public class JournalStudentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JournalStudentsApplication.class, args);
	}

}
