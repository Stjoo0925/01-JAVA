package com.ohgiraffers.section03.dto.problem1;

import java.util.ArrayList;

public class MemberRepository {

    ArrayList data = new ArrayList(); // 배열의 길이를 지정하지 않아도 됨


    public void addMember(String name, char gender, int age, String phone, String address) {
        data.add(name);
        data.add(gender);
        data.add(age);
        data.add(phone);
        data.add(address);
    }

    public void print() {
        System.out.println(this.data);
    }
}