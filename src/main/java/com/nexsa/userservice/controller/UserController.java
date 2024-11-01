package com.nexsa.userservice.controller;

import com.nexsa.userservice.constant.UserHttpConstants;
import com.nexsa.userservice.dto.ResponseDto;
import com.nexsa.userservice.dto.UserDto;
import com.nexsa.userservice.dto.UserLoginDto;
import com.nexsa.userservice.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@Validated
public class UserController {

    private UserService userService;
    private ModelMapper modelMapper;

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

    @PostMapping("/")
    public ResponseEntity<ResponseDto> createUser(@Valid @RequestBody UserDto userDto){
        UserDto user = modelMapper.map(userService.createUser(userDto), UserDto.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(UserHttpConstants.USER_STATUS_201,
                UserHttpConstants.USER_STATUS_201_MSG, user));
    }

    @PostMapping("/")
    public ResponseEntity<String> login(@Valid @RequestBody UserLoginDto userLoginDto){

        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(UserHttpConstants.USER_STATUS_201,
                UserHttpConstants.USER_STATUS_201_MSG, user));
    }

}
