package com.blue.springsecurityjwt;

import com.blue.springsecurityjwt.entity.User;
import com.blue.springsecurityjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtApplication {
	@Autowired
	private UserRepository repository;

	@PostConstruct
	public void initUsers(){
		List<User> users = Stream.of(
				new User(101, "Tom", "password", "tom@gmail.com"),
				new User(102, "sam", "pwd1", "sam@gmail.com"),
				new User(103, "Ann", "pwd2", "Ann@gmail.com"),
				new User(104, "Ben", "pwd3", "Ben@gmail.com")
		).collect(Collectors.toList());
		repository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

}
