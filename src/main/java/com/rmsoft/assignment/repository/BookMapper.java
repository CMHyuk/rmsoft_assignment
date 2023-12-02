package com.rmsoft.assignment.repository;

import com.rmsoft.assignment.entity.Book;
import com.rmsoft.assignment.request.BookUpdateRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface BookMapper {
    void saveBook(Book book);
    void updateBook(BookUpdateRequest bookUpdateRequest);
    void updateLoanStatus(Long bookId, Boolean isLoan);
    Optional<Book> findById(Long bookId);
}
