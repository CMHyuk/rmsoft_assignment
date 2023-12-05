package com.rmsoft.assignment.exception.member;

import com.rmsoft.assignment.exception.ApplicationException;

public class AlreadyExistsEmailException extends ApplicationException {

    private static final String MESSAGE = "이미 가입된 이메일입니다.";

    public AlreadyExistsEmailException() {
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return 400;
    }

}
