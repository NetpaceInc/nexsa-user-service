package com.nexsa.userservice.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserLoginDto {

    @NotEmpty(message = "email cannot be empty")
    private String email;
    @NotEmpty(message = "mobile number cannot be empty")
    private String mobileNumber;

}
