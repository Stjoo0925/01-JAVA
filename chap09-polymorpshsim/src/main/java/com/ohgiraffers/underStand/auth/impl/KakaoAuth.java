package com.ohgiraffers.underStand.auth.impl;

import com.ohgiraffers.underStand.auth.SnsAuth;
import com.ohgiraffers.underStand.dto.MemberDTO;

public class KakaoAuth implements SnsAuth {

    @Override
    public boolean login(MemberDTO member) {
        System.out.println("카카오 로그인 성공.");
        return true;
    }
}
