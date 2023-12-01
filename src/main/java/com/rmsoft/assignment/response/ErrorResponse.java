package com.rmsoft.assignment.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ErrorResponse {

    private final String statusCode;
    private final String message;

    @Builder
    public ErrorResponse(String statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

}
