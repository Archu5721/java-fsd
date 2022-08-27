package com.example.authentication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.authentication.entity.User;
import com.example.authentication.repository.UserRepo;
import com.example.authentication.service.UserService;

@SpringBootTest
class UserAuthenticationApplicationTests {
	
	@Autowired
	UserRepo repo;
	
	@Autowired
	UserService userService;
	
	@Test
	void isUser() {
		User user = new User();

		user.setName("Alex");
		user.setEmail("alex123@gmail.com");
		user.setPassword("alexxx");
		assertEquals("Alex",user.getName());
		assertEquals("alex123@gmail.com",user.getEmail());
		assertEquals("alexxx", user.getPassword());
	}
	@Test
	void testServiceCall() {
		Iterable<User> users = userService.GetAllUsers();
		Integer count = 0;
		
		for(User u: users)
			count++;
		
		assertNotEquals(count, 0);
	}
	
	@Test
	void countUsers() {
		Iterable<User> users = userService.GetAllUsers();
		Integer count = 0;
		
		for(User u: users)
			count++;
		
		assertEquals(count, 6);
	}
	
	@Test
	void checkAllUsers() {
		Iterable<User> users = userService.GetAllUsers();
		
		for(User u: users)
			assertNotNull(u);
	}
	 @Test
	    public void passwordNotNull() {
	    	
			Iterable<User> users = repo.findAll();
			for(User u: users)
				assertNotNull(u.getPassword());
	    }

	    @Test
	    public void nameNotNull() {
	    	
			Iterable<User> users = repo.findAll();
			for(User u: users)
				assertNotNull(u.getName());
	    }

	    @Test
	    public void emailNotNull() {
	    	
			Iterable<User> users = repo.findAll();
			for(User u: users)
				assertNotNull(u.getEmail());
	    }

}
