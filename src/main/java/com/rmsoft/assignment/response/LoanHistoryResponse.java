package com.rmsoft.assignment.response;

import com.rmsoft.assignment.entity.LoanHistory;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

import static java.time.LocalDate.now;

@Getter
@NoArgsConstructor
public class LoanHistoryResponse {

    private Long loanHistoryId;
    private String bookName;
    private String lender;
    private String loanStatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate loanReturnDate;

    @Builder
    public LoanHistoryResponse(LoanHistory loanHistory) {
        this.loanHistoryId = loanHistory.getLoanHistoryId();
        this.bookName = loanHistory.getBookName();
        this.lender = loanHistory.getLender();
        if (loanHistory.getIsLoan()) {
            this.loanStatus = "대출";
        }
        if (!loanHistory.getIsLoan()) {
            this.loanStatus = "반납";
        }
        this.loanReturnDate = now();
    }

}
