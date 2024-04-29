package com.ohgiraffers.underStand.service;

import com.ohgiraffers.underStand.auth.SnsAuth;
import com.ohgiraffers.underStand.dto.MemberDTO;

public class MemberService {

    private SnsAuth snsAuth;

    public MemberService(SnsAuth snsAuth) {
        this.snsAuth = snsAuth;
    }

    public String loginMember(MemberDTO memberDTO) {
        boolean result = snsAuth.login(memberDTO);
        String type = String.valueOf(snsAuth.getClass()).split("impl.")[1];

        return type + "으로 로그인 " + result;
    }
}
