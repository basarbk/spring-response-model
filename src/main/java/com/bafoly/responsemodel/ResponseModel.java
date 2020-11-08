package com.bafoly.responsemodel;

import java.util.stream.IntStream;

import com.bafoly.responsemodel.user.User;
import com.bafoly.responsemodel.user.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ResponseModel {

	public static void main(String[] args) {
		SpringApplication.run(ResponseModel.class, args);
	}

	@Bean
	CommandLineRunner run(UserRepository userRepository){
		return args -> IntStream.rangeClosed(1, 30).forEach(i -> {
			User user = new User();
			user.setUsername("user" + i);
			user.setLastname("lastname" + i);
			user.setEmail("user" + i + "@mail.com");
			user.setPassword("password");
			userRepository.save(user);
		});
	}

}
