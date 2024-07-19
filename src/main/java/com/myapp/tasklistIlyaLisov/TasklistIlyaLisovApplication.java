package com.myapp.tasklistIlyaLisov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TasklistIlyaLisovApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasklistIlyaLisovApplication.class, args);
	}

}
