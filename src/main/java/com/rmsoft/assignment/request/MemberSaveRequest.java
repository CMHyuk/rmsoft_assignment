package com.rmsoft.assignment.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;

@Getter
public class MemberSaveRequest {

    @Email(message = "이메일 형식으로 작성해주세요")
    private String email;

    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,}$", message = "비밀번호는 최소 8자 이상, 특수문자를 포함해야 합니다.")
    private String password;

    private String passwordConfirm;
}
