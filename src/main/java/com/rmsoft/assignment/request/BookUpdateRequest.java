package com.rmsoft.assignment.request;

import com.rmsoft.assignment.entity.LoanStatus;
import lombok.Getter;

@Getter
public class BookUpdateRequest {
    private String bookName;
    private String isbn;
    private LoanStatus loanStatus;
}
