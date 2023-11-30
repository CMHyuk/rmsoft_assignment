package com.rmsoft.assignment.exception;

public class PasswordMismatchException extends ApplicationException {

    private static final String MESSAGE = "비밀번호 확인이 일치하지 않습니다";

    public PasswordMismatchException() {
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return 400;
    }

}
