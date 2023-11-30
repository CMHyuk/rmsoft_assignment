package com.rmsoft.assignment.controller;

import com.rmsoft.assignment.service.BookService;
import com.rmsoft.assignment.request.BookSaveRequest;
import com.rmsoft.assignment.request.BookUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @PostMapping("/save")
    public void saveBook(@RequestBody BookSaveRequest request) {
        bookService.saveBook(request);
    }

    @PatchMapping("/update/{bookId}")
    public void updateBook(@PathVariable Long bookId, BookUpdateRequest request) {
        bookService.updateBook(bookId, request);
    }

    @PatchMapping("/borrow/{bookId}")
    public void borrowBook(@PathVariable Long bookId, @RequestParam String email) {
        bookService.borrowBook(bookId, email);
    }

    @PatchMapping("/return/{bookId}")
    public void returnBook(@PathVariable Long bookId) {
        bookService.returnBook(bookId);
    }

}
