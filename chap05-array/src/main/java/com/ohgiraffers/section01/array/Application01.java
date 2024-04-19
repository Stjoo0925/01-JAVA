package com.ohgiraffers.section01.array;

public class Application01 {

    public static void main(String[] args) {
        /*
        *   배열이란?
        *   동일한 자료형의 묶음(연속된 메모리 공산에 값을 저장하고 사용하기 위한 용도)이다.
        *   배열은 heap 영역에 new 연산자를 이용하여 할당한다.
        */

        /*
        *   배열의 사용 이유
        *   만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
        *   1. 연속된 메모리 공산을 관리할 수 없다.
        *   2. 반복문을 이용한 연속 처리가 불가능하다.
        */

        String bread = "식빵";
        String bread1 = "식빵";
        String bread2 = "식빵";
        String bread3 = "식빵";
        String bread4 = "식빵";
        String bread5 = "식빵";
        String bread6 = "식빵";
        String bread7 = "식빵";
        String bread8 = "식빵";
        String bread9 = "식빵";
        String bread10 = "식빵";

        // 배열을 사용한다면
        // 배열의 표현식
        // 자료형[] 변수명 = new 자료형[길이] | 배열은 길이를 같는다(자바의 특징)
        String[] breads = new String[10];
        breads[0] = "식빵";
        breads[1] = "식빵";
        breads[2] = "식빵";
        breads[3] = "식빵";
        breads[4] = "식빵";
        breads[5] = "식빵";
        breads[6] = "식빵";
        breads[7] = "식빵";
        breads[8] = "식빵";
        breads[9] = "식빵";

        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(breads[i]);
        }
        */

        // 선언식
        int[] iarr = new int[5]; // 0~4까지의 배열공간을 생성
        char[] carr = new char[10]; // 0~9까지의 배열공간을 생성

        // 배열 변수 초기화표현
        iarr[2] = 10;
        int result = iarr[2];

        System.out.println(iarr[0]); // 0번째 배열을 초기화 하지 않고 출력문에 입력시 0 이 출력된다. | 메모리에 사용할수 있도록 할당하기 위해 임시 값을 할당

        System.out.println(iarr); // 해시코드 출력 | 메모리의 주소값을 출력함 | 클래스형 메모리는 값을 지정할수 없다.

        System.out.println(iarr[2]);

        iarr = null; // 배열 내부의 값을 삭제하는 방법 | 참조자료형은 null값을 포함할 수 있다.
        System.out.println(iarr); // 변수의 주소가 사라짐

        /*
        iarr[0] = 10;
        System.out.println(iarr[0]);       // 재사용하기 위해선 다시 초기화 해야 된다 ex) int[] iarr = new int[5]
        */

        int newResult = 100;

        int newArray[] = new int[newResult];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = 10;
        }

    }
}
