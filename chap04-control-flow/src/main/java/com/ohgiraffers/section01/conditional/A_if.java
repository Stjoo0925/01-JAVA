package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement() {
        /*
        *   [if 표현식]
        *   if(조건식) {
        *   조건식이 참인 경우에 실행할 명령문
        *   }
        *
        *   조건식 : true or false가 나오는 연산식을 의미한다.
        *
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("값(정수)을 입력해주세요 : ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("0은 2의 배수가 아닙니다.");

        } else if (num % 2 == 0) {
            System.out.println(num + "은(는) 2의 배수 입니다.");

        } else {
            System.out.println(num + "은(는) 2의 배수가 아닙니다.");

        }
    }
}
