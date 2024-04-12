package com.ohgiraffers.section03.constant;

public class Application02 {

    public static void main(String[] args) {

        /*
        *   상수의 명명 규칙은 변수의 명명규칙과 컴파일 에러를 발생시키는 규칙은 동일하다.
        *   단, 개발자들끼리의 암묵적인 규칙에서 일부 차이를 보인다.
        *   1. 모든 문자는 영문자와 대문자 혹은 숫자만 사용한다.
        *   2. 단어와 단어 연결은 언더스코어(_)를 사용한다.
        */

        final int AGE1 = 20;
        final int age1 = 10;
        final int AGE2 = 40;

        final int maxAge = 10;
        final int MAX_AGE = 100;
        final int _AGE = 30;
        System.out.println("2," + " 4," + " 6" +  " 은 상수의 이름 규칙을 따르지 않습니다.");
    }
}
