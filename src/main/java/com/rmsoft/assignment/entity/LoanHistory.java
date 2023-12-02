package com.rmsoft.assignment.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class LoanHistory {

    private Long loanHistoryId;
    private String bookName;
    private String lender;
    private LocalDate localDate;
    private Boolean isLoan;
    private Long bookId;

    @Builder
    public LoanHistory(String bookName, String lender, LocalDate localDate, Boolean isLoan, Long bookId) {
        this.bookName = bookName;
        this.lender = lender;
        this.localDate = localDate;
        this.isLoan = isLoan;
        this.bookId = bookId;
    }

}
