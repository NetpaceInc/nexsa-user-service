package com.nexsa.userservice.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserDto {

    @NotEmpty(message = "username cannot be empty")
    private String username;
    @NotEmpty(message = "email cannot be empty")
    private String email;
    @NotEmpty(message = "mobile number cannot be empty")
    private String mobileNumber;

}
