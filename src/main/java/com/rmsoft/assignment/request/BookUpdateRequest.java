package com.rmsoft.assignment.request;

import lombok.Getter;

@Getter
public class BookUpdateRequest {

    private Long bookId;
    private String bookName;
    private String isbn;
    private String author;

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

}
