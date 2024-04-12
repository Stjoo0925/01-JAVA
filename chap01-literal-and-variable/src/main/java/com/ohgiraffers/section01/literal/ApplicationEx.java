package com.ohgiraffers.section01.literal;

public class ApplicationEx {

    public static void main(String[] args) {


        System.out.println("목차 1-1.");
        System.out.println( 123 + 456 );
        System.out.println( 123 - 23 );
        System.out.println( 123 * 10 );
        System.out.println( 123 / 10 );
        System.out.println( 123 % 10 );
        // 정수와 정수의 사칙연산은 정수로 계산된다.
        System.out.println("");

        System.out.println("목차 1-2.");
        System.out.println( 1.23 + 1.23 );
        System.out.println( 1.23 - 0.23 );
        System.out.println( 1.23 * 10.0 );
        System.out.println( 1.23 / 10 );
        System.out.println( 1.23 % 1.0 );
        // 소수끼리의 사칙연산은 소수로 계산된다.
        System.out.println("");

        System.out.println("목차 1-3.");
        System.out.println( 123 + 0.5 );
        System.out.println( 123 - 0.5 );
        System.out.println( 123 * 0.5 );
        System.out.println( 123 / 0.5 );
        System.out.println( 123 % 0.5 );
        // 정수와 소수의 사칙연산은 정수가 자동으로 변환되어 사칙연산된다.
        System.out.println("");

        System.out.println("목차 2-1.");
        System.out.println( 'a' + 'b' );
        System.out.println( 'a' - 'b' );
        System.out.println( 'a' * 'b' );
        System.out.println( 'a' / 'b' );
        System.out.println( 'a' % 'b' );
        // 문자형 리터럴은 지정된 숫자로 변환되어 계산된다.
        System.out.println("");

        System.out.println("목차 2-2.");
        System.out.println( 'a' + 1 );
        System.out.println( 'a' - 1 );
        System.out.println( 'a' * 2 );
        System.out.println( 'a' / 2 );
        System.out.println( 'a' % 2 );
        // 마찬가지로 문자형 리터럴은 지정된 숫자로 변환되어 계산된다.
        System.out.println("");

        System.out.println("목차 2-3.");
        System.out.println( 'a' + 1.0 );
        System.out.println( 'a' - 1.0 );
        System.out.println( 'a' * 2.0 );
        System.out.println( 'a' / 2.0 );
        System.out.println( 'a' % 2.0 );
        // 지정된 숫자로 변환된 문자형 리터럴이 소수로 자동변형되어 계산된다.
        System.out.println("");

        System.out.println("목차 3-1.");
        System.out.println( "hello" + "world" );
        //System.out.println( "hello" - "world" );
        //System.out.println( "hello" * "world" );
        //System.out.println( "hello" / "world" );
        //System.out.println( "hello" % "world" );
        // 문자열 리터럴은 합을 제외하고 모두 오류가 된다.
        System.out.println("");

        System.out.println("목차 3-2.");
        System.out.println( "helloworld" + 123 );
        System.out.println( "helloworld" + 123.456 );
        System.out.println( "helloworld" + 'a' );
        System.out.println( "helloworld" + true );
        // 문자열 리터럴과 문자열이 아닌 리터럴은 자동으로 문자열 리터럴로 변환되어 합산된다.
        System.out.println( "123" + "456" );
        // ""사이의 리터럴은 문자열 리터럴로 적용된다.
        System.out.println("");

        System.out.println("목차 4-1.");
        System.out.println("오류");
        //System.out.println( true + false );
        //System.out.println( true - false );
        //System.out.println( true * false );
        //System.out.println( true / false );
        //System.out.println( true % false );
        // 논리형 리터럴은 사칙연산시 오류가 된다.
        System.out.println("");

        System.out.println("목차 4-2.");
        System.out.println("오류");
        //System.out.println( true + 1 );
        //System.out.println( true - 1 );
        //System.out.println( true * 1 );
        //System.out.println( true / 2 );
        //System.out.println( true % 2 );
        // 논리형 리터럴과 정수형 리터럴은 사칙연산 할 수 없다.
        System.out.println("");

        System.out.println("목차 4-3.");
        System.out.println("오류");
        //System.out.println( true + 1.0 );
        //System.out.println( true - 1.0 );
        //System.out.println( true * 1.0 );
        //System.out.println( true / 1.0 );
        //System.out.println( true % 1.0 );
        // 논리형 리터럴과 소수형 리터럴은 사칙연산 할 수 없다.
        System.out.println("");

        System.out.println("목차 4-4.");
        System.out.println("오류");
        //System.out.println( true + 'a' );
        //System.out.println( true - 'a' );
        //System.out.println( true * 'a' );
        //System.out.println( true / 'a' );
        //System.out.println( true % 'a' );
        // 논리형 리터럴과 문자형 리터럴은 마찬가지로 문자형 리터럴이 지정된 정수로 변형되므로 사칙연산 할 수 없다.
        System.out.println("");

        System.out.println("목차 4-5.");
        System.out.println( true + "a" );
        System.out.println("오류");
        //System.out.println( true - "a" );
        //System.out.println( true * "a" );
        //System.out.println( true / "a" );
        //System.out.println( true % "a" );
        // 논리형 리터럴과 문자열리터럴은 앞선 예제와 같이 합을 제외하곤 사칙연산 할 수 없다.
        System.out.println("");
    }
}
