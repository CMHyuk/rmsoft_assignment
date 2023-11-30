package com.rmsoft.assignment.exception;

public class BookNotFound extends ApplicationException {

    private static final String MESSAGE = "존재하지 않는 도서입니다.";

    public BookNotFound() {
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return 404;
    }

}
