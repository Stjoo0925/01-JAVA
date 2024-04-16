package com.ohgiraffers.section01.method;

import java.util.Scanner;

public class Application03 {

    public static void main(String[] args) {
       int x = 10;
       int y = 20;

       Application03 app3 = new Application03();
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
