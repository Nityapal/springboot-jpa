package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

    private final UserRepository userRepository;

    BootjpaexampleApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository =context.getBean(UserRepository.class);
		
		User user= new User();
		user.setName("Nitya");
		user.setCity("delhi");
		user.setStatus("java programmer");
		
		User user1 =userRepository.save(user);
		System.out.println(user1);
	}

}
