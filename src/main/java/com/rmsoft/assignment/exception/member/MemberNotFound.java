package com.rmsoft.assignment.exception.member;

import com.rmsoft.assignment.exception.ApplicationException;

public class MemberNotFound extends ApplicationException {

    private static final String MESSAGE = "존재하지 않는 회원입니다.";

    public MemberNotFound() {
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return 404;
    }

}
