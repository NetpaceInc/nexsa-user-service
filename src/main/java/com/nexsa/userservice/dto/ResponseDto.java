package com.nexsa.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class ResponseDto {
    private String status;

    private String message;

    private Object body;
}
