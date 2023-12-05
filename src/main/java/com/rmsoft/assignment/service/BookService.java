package com.rmsoft.assignment.service;

import com.rmsoft.assignment.entity.Book;
import com.rmsoft.assignment.entity.Member;
import com.rmsoft.assignment.exception.book.BookNotFound;
import com.rmsoft.assignment.exception.loanhistory.BookNotLoanedException;
import com.rmsoft.assignment.exception.loanhistory.DuplicateLoanException;
import com.rmsoft.assignment.exception.member.MemberNotFound;
import com.rmsoft.assignment.repository.BookMapper;
import com.rmsoft.assignment.repository.MemberMapper;
import com.rmsoft.assignment.request.BookSaveRequest;
import com.rmsoft.assignment.request.BookUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BookService {

    private final BookMapper bookMapper;
    private final MemberMapper memberMapper;
    private final LoanHistoryService loanHistoryService;

    //도서 등록
    @Transactional
    public void saveBook(BookSaveRequest request) {
        Book book = Book.builder()
                .bookName(request.getBookName())
                .isbn(request.getIsbn())
                .isLoan(false) //처음 도서 등록할 때는 대출이 아닌 상태
                .build();

        bookMapper.saveBook(book);
    }

    //도서 수정
    @Transactional
    public void updateBook(Long bookId, BookUpdateRequest bookUpdateRequest) {
        Book book = bookMapper.findById(bookId)
                .orElseThrow(BookNotFound::new);

        bookUpdateRequest.setBookId(book.getBookId());

        bookMapper.updateBook(bookUpdateRequest);
    }

    //도서 대출
    @Transactional
    public void borrowBook(Long bookId, String email) {
        Member member = memberMapper.findByEmail(email)
                .orElseThrow(MemberNotFound::new);

        Book book = bookMapper.findById(bookId)
                .orElseThrow(BookNotFound::new);

        //이미 대출된 도서 대출 시 에러 발생
        if (book.getIsLoan()) {
            throw new DuplicateLoanException();
        }

        bookMapper.updateLoanStatus(bookId, true);
        loanHistoryService.saveLoanHistory(bookId, email);
    }

    //도서 반납
    @Transactional
    public void returnBook(Long bookId, String email) {
        Book book = bookMapper.findById(bookId)
                .orElseThrow(BookNotFound::new);

        //대출하지 않는 도서를 반납하려고 할 때
        if (!book.getIsLoan()) {
            throw new BookNotLoanedException();
        }

        bookMapper.updateLoanStatus(bookId, false);
        loanHistoryService.saveLoanHistory(bookId, email);
    }

}