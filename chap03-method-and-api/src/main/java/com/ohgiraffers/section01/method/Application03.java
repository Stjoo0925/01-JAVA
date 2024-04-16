package com.ohgiraffers.section01.method;

import java.util.Scanner;

public class Application03 {

    public static void main(String[] args) {
       int x = 10;
       int y = 20;

       Application03 app3 = new Application03();
       int result = app3.add(x, y);
       int result2 = app3.sub(x, y);
       int result3 = app3.mul(x, y);
       int result4 = app3.div(x, y);
       int result5 = app3.mod(x, y);

       System.out.println(result);
       System.out.println(result2);
       System.out.println(result3);
       System.out.println(result4);
       System.out.println(result5);

       /*
       *    myinfo함수를 만들고
       *    이름 : 문자열
       *    나이 : 정수
       *    성별 : 문자
       *    전화번호 : '-'을 포함한 전화번호
       *
       *    위 4개의 자료형을 매개 변수로 받아 하나의 문자열로 더하고 main에서 출력해주세요
       */
        //  1. myInfo 함수 만들기
        //  2. 매개변수 (String name, int age, char gender, String phoone)
        //  3. 매개변수 더하기 String result = name + age + gender + phone
        //  4. return result;


        String result6 = app3.myInfo("주순태", 33, '남', "010-3494-3809");
        System.out.println(result6);
    }

    //  두 수를 더하는 함수
    //  접근제어자 변환타입 함수명(매개변수){}
    public int add(int x, int y) {
        int result = x + y;
        return result;

    }

    public int sub(int x, int y) {
        int result = x - y;
        return result;

    }

    public int mul(int x, int y) {
        int result = x * y;
        return result;

    }

    public int div(int x, int y) {
        int result = x / y;
        return result;

    }

    public int mod(int x, int y) {
        int result = x % y;
        return result;
    }

    public String myInfo (String name, int age, char gender, String phoneNum) {
        String result6 = name + " " + age + " " + gender + " " + phoneNum;
        return result6;
    }
}
