package com.nexsa.userservice.service;

import com.nexsa.userservice.dto.UserDto;
import com.nexsa.userservice.entity.User;

public interface UserService {
    User createUser(UserDto userDto);
    User getUserByEmail();
}
