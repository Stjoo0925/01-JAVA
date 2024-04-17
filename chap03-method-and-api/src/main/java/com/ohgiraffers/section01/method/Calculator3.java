package com.ohgiraffers.section01.method;

import java.util.Scanner;

public class Calculator3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cul = 0;

        while (true) {
            System.out.print("1: 사칙연산, 2: 합계, 3:프로그램종료 : ");
            int option = sc.nextInt();
            if (option == 1) {
                System.out.println("사칙연산 기호를 입력하세요.");
                String arithmetic = sc.next();
                switch (arithmetic) {
                    case "+":
                        System.out.println("두 숫자를 입력하세요 : ");
                        int add1 = sc.nextInt();
                        int add2 = sc.nextInt();
                        int resultAdd = add1 + add2;
                        System.out.println("두 숫자의 합은 : " + resultAdd);
                        cul += resultAdd;
                        break;
                    case "-":
                        System.out.println("두 숫자를 입력하세요 : ");
                        int sub1 = sc.nextInt();
                        int sub2 = sc.nextInt();
                        int resultSub = sub1 + sub2;
                        System.out.println("두 숫자의 차는 : " + resultSub);
                        cul += resultSub;
                        break;
                    case "*":
                        System.out.println("두 숫자를 입력하세요 : ");
                        int mul1 = sc.nextInt();
                        int mul2 = sc.nextInt();
                        int resultMul = mul1 + mul2;
                        System.out.println("두 숫자의 곱은 : " + resultMul);
                        cul += resultMul;
                        break;
                    case "/":
                        System.out.println("두 숫자를 입력하세요 : ");
                        int div1 = sc.nextInt();
                        int div2 = sc.nextInt();
                        int resultDiv = div1 + div2;
                        System.out.println("두 숫자의 나누기는 : " + resultDiv);
                        cul += resultDiv;
                        break;
                    case "%":
                        System.out.println("두 숫자를 입력하세요 : ");
                        int mod1 = sc.nextInt();
                        int mod2 = sc.nextInt();
                        int resultMod = mod1 + mod2;
                        System.out.println("두 숫자의 나머지는 : " + resultMod);
                        cul += resultMod;
                        break;
                    default:
                        System.out.println("올바른 기호를 입력하세요.");
                }
            } else if (option == 2) {
                System.out.println("합계 : " + cul);
                cul = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 번호를 입력 하셨습니다.");
            }
        }
    }
}
