package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {
        Application01 appCal = new Application01();
        /*
        //case 1
        appCal.calculator();
        */

        /*
        // case 2
        String cal2 = appCal.calculator2();
        System.out.println(cal2);
        */

        //case 3
        String call = appCal.call();
        System.out.println(call);
    }
    /*
    *  계산기 만들기
    *   두 수와 수식을 입력받아
    *   수식에 맞는 연산을 수행하는 프로그램을 만들어주세요.
    */

    public void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("============================");

        System.out.print("두번째 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("============================");

        System.out.print("연산기호를 입력해주세요 : ");
        char arithmetic = sc.next().charAt(0);
        System.out.println("============================");

        if (arithmetic == '+' ) {
            int resultAdd = num1 + num2;
            System.out.println("두 숫자의 합은 : " + resultAdd);
            System.out.println("============================");

        } else if (arithmetic == '-' ) {
            int resultSub = num1 - num2;
            System.out.println("두 숫자의 차는 : " + resultSub);
            System.out.println("============================");

        } else if (arithmetic == '*' ) {
            int resultMul = num1 * num2;
            System.out.println("두 숫자의 곱은 : " + resultMul);
            System.out.println("============================");

        } else if (arithmetic == '/' ) {
            double resultDiv = (double) num1 / num2;
            System.out.println("두 숫자의 나누기는 : " + resultDiv);
            System.out.println("============================");

        } else if (arithmetic == '%' ) {
            int resultMod = num1 % num2;
            System.out.println("두 숫자의 나머지는 : " + resultMod);
            System.out.println("============================");

        } else {
            System.out.println("잘못된 기호 입니다.");
            System.out.println("============================");
        }
    }

    //  1. calculator 메서드를 만든다.
    public String calculator2() {
        //  입력 받을 수 있는 기능을 추가한다.
        Scanner sc2 = new Scanner(System.in);
        //  2-1. 첫번째 숫자를 입력받는다.
        int first = sc2.nextInt();
        sc2.nextLine();
        //  2-2. 두번째 숫자를 입력받는다.
        int second = sc2.nextInt();
        sc2.nextLine();
        //  3. 연산 기호를 입력받는다.
        char operator = sc2.nextLine().charAt(0);
        //  4. 연산 기호를 확인한다.

        double result = 0;
        if (operator == '+') {
            //  5. 연산을 진행한다.
            result = first + second;
        } else if (operator == '-') {
            //  5. 연산을 진행한다.
            result = first - second;
        } else if (operator == '*') {
            //  5. 연산을 진행한다.
            result = first * second;
        } else if (operator == '/') {
            //  5. 연산을 진행한다.
            result = (double) first / second;
        } else {
            return "오류!";
        }
        return String.valueOf(result);
    }
    //  6. main에 반환한다.

    //  한번에 연산식 입력받기
    public String call() {
        Scanner sc3 = new Scanner(System.in);
        String input = sc3.nextLine();
        String[] target = input.split(" ");
        int result = 0;
        if (target[1].equals("+")) {
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
        } else if (target[1].equals("-")) {
            result = Integer.parseInt(target[0]) - Integer.parseInt(target[2]);
        } else if (target[1].equals("*")) {
            result = Integer.parseInt(target[0]) * Integer.parseInt(target[2]);
        } else if (target[1].equals("/")) {
            result = Integer.parseInt(target[0]) / Integer.parseInt(target[2]);
        } else {
            System.out.println("오류!");
        }

        return String.valueOf(result);
    }

}


