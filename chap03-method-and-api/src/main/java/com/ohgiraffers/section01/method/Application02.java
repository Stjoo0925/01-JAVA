package com.ohgiraffers.section01.method;

public class Application02 {

    public static void main(String[] args) {
        /*
        *   전달인자(인수,인자)(argument)와 매개변수(parameter)를 이용한 메소드 호출
        */

        /*
        *   변수의 종류
        *   1. 지역변수
        *   2. 매개변수
        *   3. 전역변수(필드)
        *   4. 클래스(static)변수 - 프로그램 시작과 동시에 항상실행되는 변수(정적 메모리에 상시 올려둠)
        */

        /*
        *   지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. 이것을 지역변수의 스코프라고 한다.
        *   다른 메소드간 서로 공유해야 하는 값상 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
        *   이 때 전달하는 값을 전달인자(argument)라고 부르고
        *   메소드 선언부 괄호안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
        */

        int age = 20;
        Application02 app1 = new Application02();
        app1.testMethod(40);
        app1.testMethod(age);
        //  testMethod 의 ()를 인자라 한다.
        //  정수를 합하는 메소드를 생성하라.

        int sum2 = app1.add2(1,2);
        System.out.println(sum2);

        int sum = app1.add(1, 2);
        System.out.println("합은 = " + sum);

    }

    public void testMethod(int age) {
        //  testMethod 의 ()를 매개변수라 한다.

        System.out.println("당신의 나이는 " + age + "세 입니다.");

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add2(int X, int Y) {
        int sum = X + Y;
        return sum;
    }
}
