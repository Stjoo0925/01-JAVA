package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {
       /*
       *    // Scanner 사용자 정의 자료 타입 | new 메모리에 class를 올리는 명령어
       *    // sc 변수명 == 메모리의 주소 == 값
       *    // System.in = os를 제어할수 있는 권한을 주는 문법
       *    System.out.print("당신의 이름을 입력해주세요 : ");
       *    String name = sc.nextLine(); // 단일 스레드 환경이기 때문에 사용자의 입력이 되기 전까지 다음 프로그램을 대기한다
       *    System.out.println("입력하신 당신의 이름은 " + name + " 입니다.");
       *
       *    System.out.print("당신의 나이를 입력해주세요 : ");
       *    int age = sc.nextInt();
       *    System.out.println("당신의 나이는 " + age + "세 입니다.");
       */


        /*
        *   1. inputInfo 라는 메소드를 만들어야 한다.
        *       접근제어자 String 메서드명() {}
        *   2. 사용자에게 입력 받는다.
        *       Scanner sc = new Scanner();
        *   3. 키, 나이 성별, 이름을 입력 받아 문자열로 합친다.
        *       double height;
        *       int age;
        *       char gender;
        *       String name;
        *       return 합친문구;
        *   4. 문자열로 반환한다.
        *       main 메소드에서 어플리케이션 변수선언
        *       Application 변수명1 = new Application();
        *       String 변수명2 = 변수명1.메서드명();
        *       출력문(변수명2);
        */

        Application01 app1 = new Application01();
        String info = app1.inputInfo();
        System.out.println(info);

    }

    public String inputInfo() {

        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("당신의 나이를 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("당신의 키를 입력하세요 : ");
        double height = sc.nextDouble();
        sc.nextLine();

        System.out.print("당신의 셩별을 입력하세요 : ");
        char gender = sc.next().charAt(0);

        return "======== InputInfo Result ========" + "\n이름 : " + name + "\n나이 : "   + age + "\n키 : " + height + "\n성별 : " + gender;
    }
}
