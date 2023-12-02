package com.rmsoft.assignment.entity;

import lombok.AccessLevel;
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
