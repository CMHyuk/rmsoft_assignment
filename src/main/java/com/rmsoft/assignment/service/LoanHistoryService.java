package com.rmsoft.assignment.service;

import com.rmsoft.assignment.entity.Book;
import com.rmsoft.assignment.entity.LoanHistory;
import com.rmsoft.assignment.entity.Member;
import com.rmsoft.assignment.exception.book.BookNotFound;
import com.rmsoft.assignment.exception.member.MemberNotFound;
import com.rmsoft.assignment.repository.BookMapper;
import com.rmsoft.assignment.repository.LoanHistoryMapper;
import com.rmsoft.assignment.repository.MemberMapper;
import com.rmsoft.assignment.response.LoanHistoryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static java.time.LocalDate.now;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class LoanHistoryService {

    private final BookMapper bookMapper;
    private final MemberMapper memberMapper;
    private final LoanHistoryMapper loanHistoryMapper;

    @Transactional
    public void saveLoanHistory(Long bookId, String email) {
        Member member = memberMapper.findByEmail(email)
                .orElseThrow(MemberNotFound::new);

        Book book = bookMapper.findById(bookId)
                .orElseThrow(BookNotFound::new);

        LoanHistory loanHistory = LoanHistory.builder()
                .bookName(book.getBookName())
                .author(book.getAuthor())
                .lender(member.getEmail())
                .loanReturnDate(now())
                .isLoan(book.getIsLoan())
                .build();

        loanHistoryMapper.saveLoanHistory(loanHistory);
    }

    //대출 이력 조회
    public List<LoanHistoryResponse> findAllByBookName(String bookName) {
        List<LoanHistory> loanHistories = loanHistoryMapper.findAllByBookName(bookName);
        return loanHistories.stream().map(loanHistory -> LoanHistoryResponse.builder()
                        .loanHistory(loanHistory)
                        .build())
                .collect(Collectors.toList());
    }

}