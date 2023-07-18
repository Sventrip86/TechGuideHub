package com.techguidehub.service;

import org.springframework.stereotype.Service;
import com.techguidehub.model.User;
import com.techguidehub.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

   
    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);

    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}