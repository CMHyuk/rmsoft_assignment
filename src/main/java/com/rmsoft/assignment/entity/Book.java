package com.rmsoft.assignment.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Book {

    private Long bookId;
    private String bookName;
    private String isbn;
    private LoanStatus loanStatus;

    @Builder
    public Book(String bookName, String isbn, LoanStatus loanStatus) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.loanStatus = loanStatus;
    }

}
