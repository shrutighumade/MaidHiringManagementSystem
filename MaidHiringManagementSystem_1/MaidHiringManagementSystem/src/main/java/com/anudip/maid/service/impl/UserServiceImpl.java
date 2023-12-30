package com.anudip.maid.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.maid.entity.User;
import com.anudip.maid.repository.UserRepository;
import com.anudip.maid.service.UserService;



@Service
public class UserServiceImpl implements UserService {
	
	 private UserRepository userRepository;
	
	
	
    @Autowired
	public UserServiceImpl(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}



	@Override
	public User loadUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}



	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(null);
	}



	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}



	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		
	}



}
