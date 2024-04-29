package com.ohgiraffers.underStand.auth;

import com.ohgiraffers.underStand.dto.MemberDTO;

public interface SnsAuth {

    boolean login(MemberDTO member);
}
