package com.rmsoft.assignment.exception.loanhistory;

import com.rmsoft.assignment.exception.ApplicationException;

public class BookNotLoanedException extends ApplicationException {

    private static final String MESSAGE = "대출하지 않는 도서는 반납할 수 없습니다.";

    public BookNotLoanedException() {
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return 400;
    }

}
