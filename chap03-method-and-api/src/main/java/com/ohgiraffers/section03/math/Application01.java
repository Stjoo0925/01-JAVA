package com.ohgiraffers.section03.math;

public class Application01 {

    public static void main(String[] args) {
        /*
        *   api란?
        *   Application programing interface는 응용프로그램에서 사용할 수 있도록
        *   운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
        *   쉽게 말해서 우리가 구현할 수 없거나 구현하기 번거로운 기능들을 jdk를 서치하면 사용할 수 있도록 제공해 놓은 소스코드(클래스나 인터페이스)들을 의미한다.
        *   더 쉽게 누군가 작성해놓은 소스코드를 가져다 사용하는 것이다.
        */
        
        System.out.println(java.lang.Math.abs(-8));
        //abs는 static method이다
    }
}
