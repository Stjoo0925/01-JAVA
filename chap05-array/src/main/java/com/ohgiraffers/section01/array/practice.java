package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
     // 학생수 = 5
     // 학생의 점수를 입력받을수 있는 반복문
     // 토탈값을 반복문에 추가하여 변형

        practice pt = new practice();
        pt.inputNum();

    }

    public void studentAvr() { // 메소드 시작
        Scanner sc = new Scanner(System.in); // 사용자에게 값을 입력 받기 위한 스캐너 호출

        int students = 5; // 학생의 수 초기화
        int[] scores = new int[students]; // 학생수의 변수를 이용하여 배열을 생성
        int result = 0; // 점수의 합을 담기위한 변수 초가화
        for (int i = 0; i < scores.length; i++) { // 반복문 시작 | 학생의 수만큼 반복 시행
            System.out.print(i + " 번 학생의 점수를 입력하세요 : "); // i번 학생의 점수를 입력하는 출력문 작성
            scores[i] = sc.nextInt(); // i번 학생의 점수를 입력받는다
            result += scores[i]; // 점수의 i번의 점수를 결과에 합친다
        } // 반복문 종료
        double average = result / scores.length; // 더블 타입의 평균 변수에 반복문의 결과를 합친 값을 학생의 수로 나눈 것을 기입

        System.out.println("점수의 총합 : " + result); // 점수의 총합을 출력하는 출력문
        System.out.println("점수의 평균 : " + average); // 점수의 평균을 출력하는 출력문
    }

    public void inputNum() { // 메소드 시작
        // 1. 사용자에게 5개의 정수를 입력받아야함
        Scanner sc = new Scanner(System.in); // 점수를 입력받을 스캐너 호출
        int[] num = new int[5]; // 5개의 정수를 입력받을 배열 생성
        // 2. 입력받은 정수는 배열에 저장해야함
        System.out.println("5개의 정수를 입력하세요"); // 5개의 정수를 입력하라는 출력문 작성
        for (int i = 0; i < num.length; i++) { // 5개의 배열에 값을 입력하기 위한 반복문작성 | 반복문 시작
            num[i] = sc.nextInt(); // 사용자가 입력한 정수타입의 값을 스캐너를 이용하여 배열에 저장
        } // 반복문 종료
        // 3. 입력 받은 순서대로 출력해야함
        // 4. 출력 받은 정수는 1, 2, 3, ... 5 순서로 출력해야함
        // 5. 마지막에는 쉽표가 들어가지 말아야함
        for (int i = 0; i < num.length; i++) { // 배열에 저장된 정수의 값을 순서대로 출력하기 위한 반복문 작성
            if (i < num.length - 1) { // 출력문에 마지막에 쉽표를 빼기 위한 조건문 작성
                System.out.print(num[i] + ", "); // 출력문의 마지막 전 값까지 쉼표를 포함하기 위한 출력문
            } else { // 전 조건문의 범위가 마지막 배열 전까지였으므로 else문은 마지막 배열으로 결정된다
                System.out.println(num[i]); // 마지막에는 쉼표가 들어가지 말하야하기 때문에 쉼표를 뺀 출력문 작성
            } // 조건문 종료
        } //반복문 종료
    } // 메소드 종료
}
