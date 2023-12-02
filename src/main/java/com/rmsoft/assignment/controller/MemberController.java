package com.rmsoft.assignment.controller;

import com.rmsoft.assignment.service.MemberService;
import com.rmsoft.assignment.request.MemberSaveRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/member/save")
    public void saveMember(@RequestBody @Valid MemberSaveRequest request) {
        memberService.saveMember(request);
    }

}
