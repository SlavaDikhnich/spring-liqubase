package com.example.spring_liquibase.service;

import com.example.spring_liquibase.dto.UserDto;
import com.example.spring_liquibase.model.User;
import com.example.spring_liquibase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User save(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setCreatedAt(LocalDateTime.now());

        return userRepository.save(user);
    }

    public Iterable<User> getAll() {
        return userRepository.findAll();
    }
}
