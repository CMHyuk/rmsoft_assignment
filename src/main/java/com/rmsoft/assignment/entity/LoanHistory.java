package com.rmsoft.assignment.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import static lombok.AccessLevel.PROTECTED;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class LoanHistory {

    private Long loanHistoryId;
    private String bookName;
    private String author;
    private String lender;
    private LocalDate loanReturnDate;
    private Boolean isLoan;

    @Builder
    public LoanHistory(String bookName, String author, String lender, LocalDate loanReturnDate, Boolean isLoan) {
        this.bookName = bookName;
        this.author = author;
        this.lender = lender;
        this.loanReturnDate = loanReturnDate;
        this.isLoan = isLoan;
    }

}
