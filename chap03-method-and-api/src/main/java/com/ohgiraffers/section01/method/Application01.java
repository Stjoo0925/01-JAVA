package main.java.com.ohgiraffers.section01.method;

public class Application01 {

    public static void main(String[] args) {
        /*
        *   메소드
        *   메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        */

        System.out.println("main() 시작됨....");

        Application01 app1 = new Application01();
        //Application01 이라는 클래스를 생성하여 app1에 담겠다는 의미
        app1.methodA();
        
    }

    // public = 접근제어자
    public void methodA() {
        System.out.println("methodA()를 호출함");

    }
}
