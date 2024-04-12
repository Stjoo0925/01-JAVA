package com.ohgiraffers.section04.overflow;

public class Application01 {

    public static void main(String[] args) {

        // 자료형 별 값의 최대 범위를 벗어나는 경우 발생한 carry를 버림처리 하고 sing bit를 반전시켜 최소값으로 순환시킴

        byte num1 = 127;
        System.out.println("byte num : " + num1 );
        num1++;  // 증감연산자 - 앞뒤 위치에 따라 시기가 결정됨
        //byte type은 127이 넘아가면 오버플로우 된다

        System.out.println("byte num : " + num1 );

        int firstNum = 1000000;
        int secondNum = 700000;
        System.out.println("firstNum * secondNum = " + (firstNum * secondNum ) );
        //2,147,483,647 이상 넘어가면 int type은 오버플로우 된다

        long longMulti = firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + longMulti);

        long result = (long) firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + result);

    }
}
