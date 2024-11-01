package com.nexsa.userservice.service.impl;

import com.nexsa.userservice.dto.UserDto;
import com.nexsa.userservice.entity.User;
import com.nexsa.userservice.repository.UserRepository;
import com.nexsa.userservice.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private ModelMapper modelMapper;

    @Override
    public User createUser(UserDto userDto) {
        return userRepository.save(modelMapper.map(userDto, User.class));
    }

    @Override
    public User getUserByEmail() {
        return userRepository.g;
    }
}
