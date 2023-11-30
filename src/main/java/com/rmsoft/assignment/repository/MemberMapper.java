package com.rmsoft.assignment.repository;

import com.rmsoft.assignment.entity.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface MemberMapper {
    void save(Member member);
    Optional<Member> findByEmail(String email);
}
