package com.rmsoft.assignment.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class BindErrorResponse {

    private final List<String> message;

    @Builder
    public BindErrorResponse(List<String> message) {
        this.message = message;
    }

}
