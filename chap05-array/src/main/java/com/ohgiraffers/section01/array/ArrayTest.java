package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {

        ArrayTest arrayTest = new ArrayTest();
        arrayTest.average();

    }

    /* double[] score
    *   A학생의 평균 점수를 구하는 프로그램을 만들어주세요
    *   시험의 과목은 5개로 점수는 정수 단위입니다.
    *   5개 과목의 점수를 입력받고 평균을 구하여 화면에 출력합니다.
    *   예) A학생의 수학 : 90점, 영어 :80점, 국어 : 100점, 과학 :70점, 사회 : 80점 이며 평균은 x입니다.
    */

    public void average() {  //메소드의 시작
        Scanner sc = new Scanner(System.in); // 스캐너 클래스를 메모리에 호출
        int[] score = new int[5]; // 점수를 저장할 배열메모리 지정
        int result = 0; // 과목의 점수를 합할 변수 초기화
        String[] subject = {"수학", "영어", "국어", "과학", "사회"}; // 과목을 저장할 배열을 생성한후 배열에 과목명 할당
        for (int i = 0; i < score.length; i++) { // 반복문 시작 | 점수 인텍스의 개수(i)만큼 실행할 조건문 지정
            System.out.print(subject[i] + "점수를 입력하세요 : "); // i번과목에 맞는 점수를 입력하라는 출력문작성
            score[i] = sc.nextInt(); // 입력한 값은 i번 점수인덱스에 정수타입으로 저장
            result += score[i]; // 점수의 합을 결과 변수에 저장
        }
        double average = result / score.length; // 실수타입 평균변수에 과목점수의 합을 점수인덱스의 개수로 나누기

        for (int i = 0; i < score.length; i++) { // 반복문 시작 | 위의 반복문과 동일한 조건문
            System.out.print(subject[i] + " : " + score[i] + " "); // i번과목 인덱스와 i번점수 인덱스의 값을 호출하여 출력하라
            System.out.println(); // 구분하기 위한 공백 출력문
        }
        System.out.println("평균 점수는 : " + average); // 평균 점수를 출력하는 출력문
    } // 메소드의 종료
}
