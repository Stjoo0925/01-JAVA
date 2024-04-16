package com.ohgiraffers.section01.method;

public class Application01 {

    public static void main(String[] args) {
        /*
        *   메소드
        *   메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        */

        System.out.println("main() 시작됨....");

        Application01 app1 = new Application01();
        //  Application01 이라는 클래스를 생성하여 app1에 담겠다는 의미
        //  ()는 생성자라 한다.
        //  메모리에 올리는 문법
        app1.methodA();
        //  app1.main(); | . - 참조연산자
        //  class는 하나의 자료형이다 (참조자료형)
        System.out.println("main() 종료됨....");
        //선입 후출 | 스텍메모리

    }

    // public = 접근제어자
    public void methodA() {
        methodB();
        //  main에 Application01을 생성했기 때문에 메모리에 올리는 문법이 필요없다
        //  다른 클래스의 메소드를 가져올려면 메모리에 올려줘야 한다
        System.out.println("methodA() 시작됨");
        methodB();
        System.out.println("methodA() 종료됨");
        return; // void는 반환 타입이 없기 때문에 return을 작성 안해도 문제 없다
    }

    public void methodB() {
        System.out.println("methodB() 시작됨");
        methodC();
        System.out.println("methodB() 종료됨");

    }

    public void methodC() {
        System.out.println("methodC() 시작됨");
        System.out.println("methodC() 종료됨");

    }
}
