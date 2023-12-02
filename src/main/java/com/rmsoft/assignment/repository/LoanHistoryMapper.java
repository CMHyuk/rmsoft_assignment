package com.rmsoft.assignment.repository;

import com.rmsoft.assignment.entity.LoanHistory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoanHistoryMapper {
    void saveLoanHistory(LoanHistory loanHistory);
    List<LoanHistory> findAllByBookName(String bookName);
}
