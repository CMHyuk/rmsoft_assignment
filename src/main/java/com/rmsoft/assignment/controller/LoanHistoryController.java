package com.rmsoft.assignment.controller;

import com.rmsoft.assignment.response.LoanHistoryResponse;
import com.rmsoft.assignment.service.LoanHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/loanHistory")
public class LoanHistoryController {

    private final LoanHistoryService loanHistoryService;

    @GetMapping("/findAll")
    public List<LoanHistoryResponse> findAll(@RequestParam String bookName) {
        return loanHistoryService.findAllByBookName(bookName);
    }

}
