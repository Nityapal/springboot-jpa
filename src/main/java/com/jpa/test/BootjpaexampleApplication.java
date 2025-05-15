package com.jpa.test;

import java.util.List;
import java.util.Optional;

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
		
//		User user= new User();
//		user.setName("Nitya");
//		user.setCity("delhi");
//		user.setStatus("java programmer");
//		
//		User user1 =userRepository.save(user);
//		System.out.println(user1);
		
		//create object of user
//		User user= new User();
//		user.setName("cinderella");
//		user.setCity("disney");
//		user.setStatus("princess with lost shoe");
		
//		User user1= new User();
//		user1.setName("ratatouille");
//		user1.setCity("pixar");
//		user1.setStatus("chef rat");
		
		//saving single user
		//User res= userRepository.save(user);
		
		//saving multiple users
//		List<User> users= List.of(user,user1);
//		Iterable<User> res =userRepository.saveAll(users);	
//		
//		res.forEach(u->{
//			System.out.println(u);
//		});
//		System.out.println("saved user "+res);
//		System.out.println("done");
		
		//update the user with id 52
//		Optional<User> optional= userRepository.findById(52);
//		User user= optional.get();
//		
//		user.setName("minions");
//		User res= userRepository.save(user);
//		
//		System.out.println(res);
		
		//how to get the data
		//findById(id) - return Optional Containing your data
		//Iterable<User> itr= userRepository.findAll();
		//Iterator<User> i= itr.iterator():
		//while(i.hasNext()){
		//User user= i.next();
		//sopln(user);
		//}
		
		//or
		
		//itr.forEach(new Consumer<User>(){
		//@Override
		//public void accept(User t) {
		//	
		//}
		//});
		
		//or
		
		//itr.forEach(user->{sopln(user)});
		
		//deleting user element
//		userRepository.deleteById(2);
//		System.out.println("deleted");
		
//		Iterable<User> allusers= userRepository.findAll();
//		allusers.forEach(user->System.out.println(user));
//		userRepository.deleteAll(allusers);
		
	}

}
