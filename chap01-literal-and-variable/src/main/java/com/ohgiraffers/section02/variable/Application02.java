package com.ohgiraffers.section02.variable;

public class Application02 {

    public static void main(String[] args) {

        /*
        *   자료형이란?
        *   다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 compiler와 약속한 키워드 이다.
        *   예) 앞으로 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
        *      이러한 자료형은 기본자료형(primitive type)과 참조자료형(Referance type)으로 나뉘어진다.
        *   그 중 기본자료형 8가지 부터 살펴본다.
        */

        // 기본자료형 - primitive type
        // 정수를 취급하는 자료형은 4가지가 있다.
        byte bnum;   // 1byte  - 주황색으로 표시한 부분은 예약어라고 한다
        short snum;  // 2byte
        int inum;    // 4byte
        long lnum;   // 8byte

        // 소수를 취급하는 자료형은 2가지가 있다.
        float fnum;  // 4byte
        double dnum; // 8byte

        // 문자를 취급하는 자료형은 한 가지가 있다.
        char ch;   // 2byte

        // 논리형을 취급하는 자료형은 한 가지가 있다.
        boolean isTrue;  // 1byte

        // ------문자열은 기본자료형은 아니다.
        // 문자열을 취급하는 자료형
        String str;  // 4byte

        // 변수를 초기화 하기
        bnum = 127;
        snum = 32767;
        inum = 2147483647;
        lnum = 922337203685477580L;

        System.out.println(bnum);
        System.out.println(snum);
        System.out.println(inum);
        System.out.println(lnum);
        System.out.println("");

        // 실수에 값을 초기화 하기
        fnum = 0.3f;
        dnum = 0.4;

        // 논리를 취급하는 자료형
        isTrue = true;
        isTrue = false;

        ch = 'A'; // 문자형에 숫자를 대입하면 아스키코드표에 대조하여 문자로 변환된다
                  // ex) 97을 입력하면 소문자 a로 변환된다.

        // 문자열을 취급하는 자료형에 값 대입
        str = "안녕하세요";

        System.out.println(bnum+ch); // char는 아스키코드로 변환되어 계산된다.

    }
}
