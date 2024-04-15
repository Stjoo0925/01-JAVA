package com.ohgiraffers.section03.increment;

public class Application01 {

    public static void main(String[] args) {
        /*
        *   증감연산자
        *   피연산자의 앞 또는 뒤에 사용이 가능하다.
        *   '++' : 1의 증가를 의미한다.
        *   '--' : 1의 감소를 의미한다.
        *   ++X || X++
        */

        int num = 0;
        int x = 10 + (++num);
        System.out.println(x);
        System.out.println(num); // x의 연산시 num에 1을 증가시켜 연산한다. | 연산이후 num = 1;

        num = 0;
        x = 10 + (num++);
        System.out.println(x);
        System.out.println(num); // x의 연산이 끝난후 num의 값을 1올린다. | 마찬가지로 연산이후 num = 1;

        num =0;
        int result = num++ * 10;
        // result = num * 10;
        // num += 1;
        System.out.println(result);

        result = ++num * 10;
        // num += 1;
        // result = num * 10;
        System.out.println(result);
    }
}
