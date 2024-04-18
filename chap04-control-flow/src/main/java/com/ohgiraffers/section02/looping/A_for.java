package com.ohgiraffers.section02.looping;

public class A_for {

    public void testSimpleForStatement() {
        /*
        *   [for문 표현식]
        *   for(초기식; 조건식; 증감식) {
        *       // 조건식이 참인 경우 실행할 구문 == 반복할 구문
        *   }
        */

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("천원 단위 : " + j);
                // 1. int i = 0
                // 2. i <= 0
                // 3. 내부의 for문 실행
                // 4. int j = 1
                // 5. j <= 0
                // 6. 증감연산자 실행
                //7 . 조건이 완료 되면 내부의 for문을 벋어남
            }
            System.out.println("만원 단위 : " + i);
            // for문의 실행 규칙
            // 1. int = i (최초 실행시에만 작동)
            // 2. i <= 10 (최초 실행 이후 2번부터 조건식이 충족할때 까지 반복작동)
            // 3. {스코프 내용 실행}
            // 4. 증감연산
        }
    }
}
