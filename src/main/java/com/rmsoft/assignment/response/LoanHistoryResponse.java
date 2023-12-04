package com.rmsoft.assignment.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class LoanHistoryResponse {

    private Long loanHistoryId;
    private String bookName;
    private String lender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate loanReturnDate;

    @Builder
    public LoanHistoryResponse(Long loanHistoryId, String bookName, String lender, LocalDate loanReturnDate) {
        this.loanHistoryId = loanHistoryId;
        this.bookName = bookName;
        this.lender = lender;
        this.loanReturnDate = loanReturnDate;
    }

}
