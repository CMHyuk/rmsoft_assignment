package com.rmsoft.assignment.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Book {

    private Long bookId;
    private String bookName;
    private String isbn;
    private Boolean isLoan;

    @Builder
    public Book(String bookName, String isbn, Boolean isLoan) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.isLoan = isLoan;
    }

}
