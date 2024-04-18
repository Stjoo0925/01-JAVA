package com.ohgiraffers.section01.conditional;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// D_swhitch라는 클래스를 모두가 사용할 수 있도록 만든다.
public class D_switch {
    public static void main(String[] args) {
        /*
        D_switch cal = new D_switch();
        cal.testSimpleSwitchStatement();
        */

        // 1. 학생의 성적을 입력 할수 있게 스캐너를 만든다
        // 2. 학생의 성적을 입력한다.
        // 3. 성적분류 메소드 실행한다.
        Scanner scanner3 = new Scanner(System.in);          // 1.
        D_switch gradeResult = new D_switch();

        System.out.print("학생의 성적을 입력하세요 : ");          // 2.
        int gradeInput = scanner3.nextInt();

        gradeResult.grade(gradeInput);                      // 3.

    }
    // 클래스 내부 속성

    // testSimpleSwitchStatement라는 반환값이 없는 메서드를 모두가 사용할 수 있도록 만든다.
    public void testSimpleSwitchStatement() { // testSimpleSwitchStatement 메서드의 시작
        /*
        *   [switch문 표현식]
        *   switch(비교대상값) {
        *       case 비교값 : 비교값이 참인 경우 실행할 구문; break;
        *       case 비교값2 : 비교값2가 참인 경우 실행할 구문; break;
        *       default : case에 모두 해당하지 않는 경우; break;
        *   }
        */

        // 사용자에게 값을 입력받을 수 있는 객체를 생성함
        Scanner scanner = new Scanner(System.in);
        // 화면에 아래의 출력문을 출력함
        System.out.print("Please enter a number1: ");
        // 사용자가 입력한 값을 정수로 받아서 number1에 대입함
        int number1 = scanner.nextInt();
        // 화면에 아래의 출력문을 출력함
        System.out.print("Please enter a number2: ");
        // 사용자가 입력한 값을 정수로 받아서 number2에 대입함
        int number2 = scanner.nextInt();
        // 화면에 아래의 출력문을 출력함
        System.out.print("Please enter a symbol: ");
        // 사용자가 입력한 값을 문자로 받아 symbol에 대입함
        char symbol = scanner.next().charAt(0);
        //아래의 계산기를 완성합니다.
        // 연산은 +, -, *, / 가 가능하며 이외는 계산 불가능이라는 결과를 화면에 출력합니다.
        switch (symbol) { //symbol으 변수를 기준으로 아래의 값과 일치하는지 확인함
            // symbol과 case가 같다면 출력문을 출력함
            case '+' -> System.out.print("Add result : " + (number1 + number2));
            // symbol과 case가 같다면 출력문을 출력함
            case '-' -> System.out.print("Sub result : " + (number1 - number2));
            // symbol과 case가 같다면 출력문을 출력함
            case '*' -> System.out.print("Mul result : " + (number1 * number2));
            // symbol과 case가 같다면 출력문을 출력함
            case '/' -> System.out.print("Div result : " + (number1 / number2));
            // symbol과 case가 전부 다르다면 출력문을 출력함
            default -> System.out.print("=== Invalid symbol ===");
        }
    }// 이하 메서드의 종료

    // 계산기를 만들고 결과를 반환하여 Application02에서 출력해주세요
    // + - * / 만 제공하고 일치하는 연산이 없는 경우 연산불가라는 결과를 출력하고 반환 값을 0.0으로 출력주세요

    //  1. 값을 입력받음
    //  2. 첫 번째 수를 입력받음
    //  3. 두 번째 수를 입력받음.
    //  4. 연산기호 입력
    //  5. 연산기호를 비교
    //  6. 값을 반환
    //  7. 연산값이 없는 경우(default) 연산불가라는 결과를 출력, 반환값은 0.0이 된다.

    public double calculator2() {
        Scanner scanner2 = new Scanner(System.in);          // 1

        System.out.print("Please enter a number1: ");       // 2
        int number1 = scanner2.nextInt();

        System.out.print("Please enter a number2: ");       // 3
        int number2 = scanner2.nextInt();

        System.out.print("Please enter a symbol: ");        // 4
        char symbol = scanner2.next().charAt(0);
        double result = 0.0;

        switch (symbol) {                                   // 5
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> result = number1 / number2;
            default -> {
                System.out.print("연산불가 ");                 // 7
            }
        }
        return result;                                      // 6
    }
    //등급 계산기 프로그램
    // main에서 학생의 성적을 입력받고 아래의 메서드에서 학생의 등급을 화면에 출력해주세요
    // 100 = a+
    // 100~90 = a
    // 90~85 = b+
    // 85~75 = b
    // 75~60 = c
    // 60 미만 d
    // f는 없다.

    // 1. String타입 으로 성적을 구성할수 있는 메소드를 생성한다.
    // 2. 메인에서 입력한 정수를 구분할수 있는 조건문을 작성한다
    // 3. 출력한다.
    public void grade(int gradeInput) {                       // 1.
        String result;
        if (gradeInput == 100) {                                // 2.
            result = "A+";
        } else if (90 <= gradeInput && gradeInput < 100 ) {
            result = "A";
        } else if (85 <= gradeInput && gradeInput < 90 ) {
            result = "B+";
        } else if (75 <= gradeInput && gradeInput < 85) {
            result = "B";
        } else if (60 <= gradeInput && gradeInput < 75) {
            result = "C";
        } else {
            result = "D";
        }

        System.out.println("학생의 학점은 : " + result);            // 3.
    }
} // D_switch의 종료
