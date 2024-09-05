package org.comstudy.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyappMemoStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappMemoStudyApplication.class, args);
		System.out.println("실행 중 >>> http://localhost:8089/memo");
	}

}
