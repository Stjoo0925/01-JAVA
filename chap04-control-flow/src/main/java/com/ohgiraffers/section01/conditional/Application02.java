package com.ohgiraffers.section01.conditional;
// 프로그램내에서 모두가 사용할 수 있는 Application02라는 클래스를 선언한다.
public class Application02 {
    // 프로그램이 시작시 바로 사용할 수 있도록 static영역에 main이라는 함수를 만들고 문자열 배열의 타입을 가진 args라는 변수를 선언한다.
    public static void main(String[] args) { // main의 시작
        /*
        // D_switch라는 자료형을 가진 cal변수를 만들고 D_switch 타입으로 값을 제공한다.
        // D_switch는 사용자 정의 자료형으로써 타입은 우리가 만든 D_switch를 확인해야한다.
        D_switch cal = new D_switch();
        // cal 변수가 가지고 있는 testSimpleSwitchStatement메소드를 실행한다.
        cal.testSimpleSwitchStatement();
         */

        // 1. 값을 반환 받는다.
        // 2. 반환받은 값을 화면에 출력한다.
        D_switch cal2 = new D_switch();                     // 1
        double calculator2 = cal2.calculator2();
        System.out.println("계산결과 : " + calculator2);      // 2


    } // main의 끝
} // Apppication02의 종료
