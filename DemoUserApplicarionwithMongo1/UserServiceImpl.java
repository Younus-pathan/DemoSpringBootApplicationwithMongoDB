package com.example.DemoUserApplicarionwithMongo1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public Optional<User> getUserByID(String id) {
		
		return userRepository.findById(id);
	}

	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public User updateUser(String id, User user) {
	
		Optional<User> existingUser =userRepository.findById(id);
		if(existingUser.isPresent()) {
		    user.setId(id);
		   return userRepository.save(user);
		}else {
			throw new IllegalArgumentException("Invalid id : "+id);
		}
	}

	@Override
	public void deleteUserById(String id) {
		
		userRepository.deleteById(id);
	}

}
