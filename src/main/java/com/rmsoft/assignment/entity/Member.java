package com.rmsoft.assignment.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static lombok.AccessLevel.PROTECTED;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class Member {

    private Long memberId;
    private String email;
    private String password;
    private List<Book> books = new ArrayList<>();

    @Builder
    public Member(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
