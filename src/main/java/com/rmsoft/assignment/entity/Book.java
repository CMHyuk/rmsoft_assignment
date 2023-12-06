package com.rmsoft.assignment.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class Book {

    private Long bookId;
    private String bookName;
    private String isbn;
    private String author;
    private Boolean isLoan;

    @Builder
    public Book(String bookName, String isbn, String author, Boolean isLoan) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.author = author;
        this.isLoan = isLoan;
    }

}
