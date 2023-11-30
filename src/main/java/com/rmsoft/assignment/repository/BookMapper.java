package com.rmsoft.assignment.repository;

import com.rmsoft.assignment.entity.Book;
import com.rmsoft.assignment.request.BookUpdateRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface BookMapper {
    void saveBook(Book book);
    void updateBook(Long bookId, BookUpdateRequest request);
    Optional<Book> findById(Long bookId);
}
