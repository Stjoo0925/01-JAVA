package com.ohgiraffers.section01.method;

import java.util.Scanner;

public class Application03Ref {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1: 사칙연산, 2: 총합, 3:프로그램종료");
            int option = sc.nextInt();

            if (option == 1) {

            } else if (option == 2) {

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 번호를 입력 하셨습니다.");
            }
        }

       Application03Ref app3 = new Application03Ref();

       int result = app3.add(x, y);
       int result2 = app3.sub(x, y);
       int result3 = app3.mul(x, y);
       int result4 = app3.div(x, y);
       int result5 = app3.mod(x, y);

       System.out.println(result);
       System.out.println(result2);
       System.out.println(result3);
       System.out.println(result4);
       System.out.println(result5);

    }

    //  두 수를 더하는 함수
    //  접근제어자 변환타입 함수명(매개변수){}
    public int add(int X, int Y) {
        int result = X + Y;
        return result;
    }

    public int sub(int X, int Y) {
        int result = X - Y;
        return result;
    }

    public int mul(int X, int Y) {
        int result = X * Y;
        return result;
    }

    public int div(int X, int Y) {
        int result = X / Y;
        return result;
    }

    public int mod(int X, int Y) {
        int result = X % Y;
        return result;
    }
}
