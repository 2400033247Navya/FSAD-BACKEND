package com.klu.safehaven.service;



	import com.klu.safehaven.entity.User;
	import com.klu.safehaven.repository.UserRepository;
	import org.springframework.stereotype.Service;

	import java.util.List;

	@Service
	public class UserService {

	    private final UserRepository userRepository;

	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public User saveUser(User user) {
	        return userRepository.save(user);
	    }
<<<<<<< HEAD
	    
=======
>>>>>>> cd8e7c56fa4f36d2e181ce77dec831de6f65d8b8

	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }
<<<<<<< HEAD
	    
=======
>>>>>>> cd8e7c56fa4f36d2e181ce77dec831de6f65d8b8
	}

