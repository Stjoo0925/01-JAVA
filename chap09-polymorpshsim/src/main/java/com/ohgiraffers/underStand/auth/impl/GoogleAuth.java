package com.ohgiraffers.underStand.auth.impl;

import com.ohgiraffers.underStand.auth.SnsAuth;
import com.ohgiraffers.underStand.dto.MemberDTO;

public class GoogleAuth implements SnsAuth {

    @Override
    public boolean login(MemberDTO member) {
        System.out.println("구글 로그인 성공");
        return true;
    }
}
