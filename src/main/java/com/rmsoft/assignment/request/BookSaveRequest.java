package com.rmsoft.assignment.request;

import lombok.Getter;

@Getter
public class BookSaveRequest {
    private String bookName;
    private String isbn;
    private String author;
}
