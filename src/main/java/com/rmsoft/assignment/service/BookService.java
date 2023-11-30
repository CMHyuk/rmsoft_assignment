package com.rmsoft.assignment.service;

import com.rmsoft.assignment.entity.Book;
import com.rmsoft.assignment.entity.Member;
import com.rmsoft.assignment.exception.BookNotFound;
import com.rmsoft.assignment.exception.MemberNotFound;
import com.rmsoft.assignment.repository.BookMapper;
import com.rmsoft.assignment.repository.MemberMapper;
import com.rmsoft.assignment.request.BookSaveRequest;
import com.rmsoft.assignment.request.BookUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.rmsoft.assignment.entity.LoanStatus.INACTIVE;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BookService {

    private final BookMapper bookMapper;
    private final MemberMapper memberMapper;

    //도서 등록
    @Transactional
    public void saveBook(BookSaveRequest request) {
        Book book = Book.builder()
                .bookName(request.getBookName())
                .isbn(request.getIsbn())
                .loanStatus(INACTIVE) //처음 도서 등록할 때는 대출이 아닌 상태
                .build();

        bookMapper.saveBook(book);
    }

    @Transactional
    public void updateBook(Long bookId, BookUpdateRequest request) {
        Book book = bookMapper.findById(bookId)
                .orElseThrow(BookNotFound::new);

        bookMapper.updateBook(book.getBookId(), request);
    }

    //도서 대출
    @Transactional
    public void borrowBook(Long bookId, String email) {
        Member member = memberMapper.findByEmail(email)
                .orElseThrow(MemberNotFound::new);

        Book book = bookMapper.findById(bookId)
                .orElseThrow(BookNotFound::new);
    }

    //도서 반납
    @Transactional
    public void returnBook(Long bookId) {
        Book book = bookMapper.findById(bookId)
                .orElseThrow(BookNotFound::new);
    }

}
