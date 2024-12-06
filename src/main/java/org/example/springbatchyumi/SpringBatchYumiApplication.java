package org.example.springbatchyumi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBatchYumiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchYumiApplication.class, args);
	}

}
