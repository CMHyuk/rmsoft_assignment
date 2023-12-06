package com.rmsoft.assignment.exception.loanhistory;

import com.rmsoft.assignment.exception.ApplicationException;

public class DuplicateLoanException extends ApplicationException {

    private static final String MESSAGE ="이미 대출된 도서입니다";

    public DuplicateLoanException() {
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return 409;
    }

}
