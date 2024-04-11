package com.ohgiraffers.section01.literal;

public class Application02 {

    public static void main(String[] args) {
        //  2+2, 2-2, 2*2, 2/2 [사칙연산]
        System.out.println( 2 + 2 );
        System.out.println( 2 - 2 );
        System.out.println( 2 * 2 );
        System.out.println( 2 / 2 );

        //123 % 10 [나머지]
        System.out.println( 123 % 10 );

        //실수의 사칙연산, 목연산
        // 1.23 + 1.23
        System.out.println( 1.23 + 1.23 );
        // 1.23 - 1.23
        System.out.println( 1.23 - 1.23 );
        // 1.23 * 1.23
        System.out.println( 1.23 * 1.23 );
        // 1.23 / 1.23
        System.out.println( 1.23 / 1.23 );
        // 1.23 % 1.0
        System.out.println( 1.23 % 1.0 );

        // "123" + "12"
        System.out.println( "123" + "12" ); // 123, 12

        // "123" - "12" = 에러
        //System.out.println( "123" - "12" ); 문자열은 합을 제외하고 모두 오류

        // "123" + 12 =12312
        System.out.println( "123" + 12 );
    }
}
