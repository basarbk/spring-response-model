package com.bafoly.responsemodel;

import java.util.Random;
import java.util.stream.IntStream;

import com.bafoly.responsemodel.article.Article;
import com.bafoly.responsemodel.article.ArticleRepository;
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
	CommandLineRunner run(UserRepository userRepository, ArticleRepository articleRepository){
		return args -> IntStream.rangeClosed(1, 30).forEach(i -> {
			User user = new User();
			user.setUsername("user" + i);
			user.setLastname("lastname" + i);
			user.setEmail("user" + i + "@mail.com");
			user.setPassword("password");
			userRepository.save(user);
			Random random = new Random();
			int count = random.nextInt(4);
			
			IntStream.rangeClosed(1, count).forEach(j -> {
				Article article = new Article();
				article.setOwner(user);
				article.setTitle("title "+ j);
				article.setContent("content "+j);
				articleRepository.save(article);
			});
		});
	}

}
