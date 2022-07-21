package com.rai.ExpenseTrackerBackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.rai.ExpenseTrackerBackEnd.*")
public class ExpenseTrackerBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerBackEndApplication.class, args);
	}

}
