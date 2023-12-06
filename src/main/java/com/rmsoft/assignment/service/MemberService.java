package com.rmsoft.assignment.service;

import com.rmsoft.assignment.entity.Member;
import com.rmsoft.assignment.exception.member.AlreadyExistsEmailException;
import com.rmsoft.assignment.exception.member.PasswordMismatchException;
import com.rmsoft.assignment.repository.MemberMapper;
import com.rmsoft.assignment.request.MemberSaveRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberMapper memberMapper;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void saveMember(MemberSaveRequest request) {
        Optional<Member> memberOptional = memberMapper.findByEmail(request.getEmail());

        //이메일 중복 방지
        if (memberOptional.isPresent()) {
            throw new AlreadyExistsEmailException();
        }

        //비밀번호, 비밀번호 확인 일치 확인
        if (!request.getPassword().equals(request.getPasswordConfirm())) {
            throw new PasswordMismatchException();
        }

        String encryptedPassword = passwordEncoder.encode(request.getPassword()); //비밀번호 암호화
        Member member = new Member(request.getEmail(), encryptedPassword);
        memberMapper.save(member);
    }

}