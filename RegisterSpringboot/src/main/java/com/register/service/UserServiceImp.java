package com.register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.entities.User;
import com.register.repositories.UserRepositories;


@Service 
public class UserServiceImp  implements UserService{

	@Autowired
	private UserRepositories userRepository;
	
	
	@Override
	public boolean registeruser(User user) {
		
		try {
			 // check if email already exists
	        User existingUser = userRepository.findByEmail(user.getEmail());
	        if (existingUser != null) {
	            // email already exists
	            return false;
	        }
			
	        // if not exists, save user
			userRepository.save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public User loginUser(String email, String password) {
		User validuser=userRepository.findByEmail(email);
		if (validuser != null && validuser.getPassword().equals(password)) {
			return validuser;
			
		}
		
		return null;
		
		
	}

}
