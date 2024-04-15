package com.ohgiraffers.section05.logical;

public class Application02 {

    public static void main(String[] args) {
        /*
        *   논리 연산자의 우선순위와 활용
        *   논리 and 연산자와 논리 or 연산자의 우선순위
        *   && : 11순위
        *   || : 12순위
        *   논리 and 연산자 우선순위가 논리 or 연산자 우선쉰위 보다 높다
        */

        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : " + (1 <= num1 && num1 <= 100)); // 삼항연산

        int num2 = 166;
        System.out.println("num2 가 1부터 100 사이인지 확인 : " + (1 <= num2 && num2 <= 100));

        char ch1 = 'G';
        System.out.println("ch1이 대문자인지 확인하기 : " + (65 <= ch1 && ch1 <= 90) ); // 65, 90

        char ch3 = 'Y';
        System.out.println("영문자 Y인지 확인하기 : " + (ch3 == 89) ); // Y의 아스키코드는 89

        char ch4 = 'y';
        System.out.println("영문자 y인지 확인하기 : " + (ch4 == 121) ); // y의 아스키코드는 121

        // 복잡할 수 있음
        char ch5 = 'f';
        System.out.println("영문자인지 확인 : " + ((65 <= ch5 && ch5 <= 90) || (97 <= ch5 && ch5 <= 122)));
        // 대문자 범위 65 ~ 90, 소문자 범위 97 ~ 122
    }
}
