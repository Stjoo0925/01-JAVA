package com.ohgiraffers.section02.looping;

public class B_while {

    public  void testSimpleWhileStatement() {

        /*
        *   [while문 표현식]
        *   초기식;
        *   while(조건식) {
        *   조건식을 만족하는 경우 수행할 구문(반복할 구문);
        *   증감식;
        *   }
        *
        *   while(조건식) {
        *   조건식을 만족하는 경우 수행할 구문
        *   }
        */

        int i = 1;
        while (i <= 10) { // 반복해야 하는 대상의 길이를 알 수 없을때 사용한다.
            System.out.println(i);
            i++;
        }

        for(;true;) {

        }
    }

    public void multiplication_table() { // 구구단의 메소드를 시작
        // 구구단 만들기
        // 구구단의 범위 설정 (first <= 9, second <= 9)
        // 구구단의 출력문 9 X 9 = 81
        // 구구단에 사용할 변수 설정
        int first = 1; // 앞단의 변수 선언 및 초기화
        // int second = 1; | *** 뒷단의 변수가 while문 밖에 있을때와 안에 있을때 차이를 생각해볼것!
        while ( first <= 9 ) { // 앞단의 반복문 시작
            int second = 1; // 뒷단의 변수 선언 및 초기화 | *** 뒷단의 변수가 while문 밖에 있을때와 안에 있을때 차이를 생각해볼것!
            System.out.println( first + " 단 시작"); // 단의 시작을 구분하기 위해 출력문을 작성
            while ( second <= 9) { // 뒷단의 반복문 시작
                System.out.println(first + " X " + second + " = " + (first * second)); // 구구단 출력문 작성
                second++; // 뒷단의 단수를 증가시켜 뒷단의 반복문 다시 한번 시작
                          // 뒷단의 조건이 false가 되었을때 뒷단의 반복문 종료 | j <= 10
            } // 뒷단의 반복문 종료
            System.out.println(first + " 단 종료"); // 단의 종료를 구분을 위해 출력문을 작성
            first++; // 앞단의 단수를 증가
                     // 앞단의 조건이 false가 되었을때 앞단의 반복문 종료 | i <= 10
        } // 앞단의 반복문 종료
    } // 구구단의 메소드를 종료
}
