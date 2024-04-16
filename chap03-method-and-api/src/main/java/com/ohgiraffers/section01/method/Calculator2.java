package com.ohgiraffers.section01.method;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1: 사칙연산, 2: 합계, 3:프로그램종료 : ");
            int option = sc.nextInt();
            int cul = 0;

            if (option == 1) {
                System.out.println("1. + \n2. -\n3. *\n4. /\n5. %");
                int arithmetic = sc.nextInt();

                if ( arithmetic == 1 ) {
                    System.out.println("두 숫자를 입력하세요 : ");
                    int add1 = sc.nextInt();
                    int add2 = sc.nextInt();
                    int resultAdd = add1 + add2;
                    System.out.println("합은 : " + resultAdd);
                    cul += cul + resultAdd;


                } else if ( arithmetic == 2 ) {
                    System.out.println("두 숫자를 입력하세요 : ");
                    int sub1 = sc.nextInt();
                    int sub2 = sc.nextInt();
                    int resultSub = sub1 - sub2;
                    System.out.println("차는 : " + resultSub);
                    cul += cul + resultSub;

                } else if ( arithmetic == 3 ) {
                    System.out.println("두 숫자를 입력하세요 : ");
                    int mul1 = sc.nextInt();
                    int mul2 = sc.nextInt();
                    int resultMul = mul1 * mul2;
                    System.out.println("곱은 : " + resultMul);
                    cul += cul + resultMul;

                } else if ( arithmetic == 4 ) {
                    System.out.println("두 숫자를 입력하세요 : ");
                    int div1 = sc.nextInt();
                    int div2 = sc.nextInt();
                    int resultDiv = div1 * div2;
                    System.out.println("나누기는 : " + resultDiv);
                    cul += cul + resultDiv;

                } else if ( arithmetic == 5 ) {
                    System.out.println("두 숫자를 입력하세요 : ");
                    int mod1 = sc.nextInt();
                    int mod2 = sc.nextInt();
                    int resultMod = mod1 % mod2;
                    System.out.println("나머지는 : " + resultMod);
                    cul += cul + resultMod;

                } else {
                    System.out.println("올바른 연산기호를 입력하세요.");
                }

            } else if (option == 2) {
                System.out.println("합계 : " + cul);
                cul = 0;
                continue;

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 번호를 입력 하셨습니다.");
                continue;
            }
        }

    }

    public int add(int x, int y) {
        int add = x + y;
        return add;
    }

    public int sub(int x, int y) {
        int sub = x - y;
        return sub;
    }

    public int mul(int x, int y) {
        int mul = x * y;
        return mul;
    }

    public int div(int x, int y) {
        int div = x / y;
        return div;
    }

    public int mod(int X, int Y) {
        int mod = X % Y;
        return mod;
    }
}
