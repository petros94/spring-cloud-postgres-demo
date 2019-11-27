package com.example.hellodocker.service;

import com.example.hellodocker.controller.dto.UserDTO;
import com.example.hellodocker.repository.UserRepository;
import com.example.hellodocker.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Optional<User> findByEmail(String email) { return this.userRepository.findByClientEmail(email); }
    public Optional<User> findById(UUID id) { return this.userRepository.findById(id); }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User save(UserDTO userDTO) {
        User user = new User();
        user.setClientEmail(userDTO.getClientEmail());
        user.setClientPhone(userDTO.getClientPhone());
        user.setLastName(userDTO.getLastName());
        user.setName(userDTO.getName());
        return this.userRepository.save(user);
    }
}
