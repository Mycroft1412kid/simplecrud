package edu.bjtu.sei.simplecrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimplecrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplecrudApplication.class, args);
	}
	//run执行时间很长，执行过程中所有controller都将初始
}
