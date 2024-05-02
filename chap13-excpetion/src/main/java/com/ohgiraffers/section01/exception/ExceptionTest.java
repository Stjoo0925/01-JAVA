package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("가지고 계신 돈은 " + money + " 윈 입니다.");

        if (money >= price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
        } else {
            // 에외를 강제로 발생시킴
            throw new Exception();
        }
        System.out.println("즐 쇼~~~~");
    }
}
