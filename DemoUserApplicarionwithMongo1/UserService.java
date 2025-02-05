package com.example.DemoUserApplicarionwithMongo1;

import java.util.List;
import java.util.Optional;

public interface UserService {
	User createUser(User user);
	
	Optional<User> getUserByID(String id);
	
	List<User> getAllUsers();
	
	User updateUser(String id,User user);
	
    void deleteUserById(String id);
}
