package io.infamia2334.marksmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class MarksmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarksmanagerApplication.class, args);
	}

}
