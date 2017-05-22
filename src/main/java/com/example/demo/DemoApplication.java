package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		//        ImplRun ir = new ImplRun(5);
//        new Thread(ir).start();

		ImplThread it = new ImplThread(5);
		it.start();

	}
}
