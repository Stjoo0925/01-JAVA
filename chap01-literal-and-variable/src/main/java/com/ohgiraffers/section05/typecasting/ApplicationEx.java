package com.ohgiraffers.section05.typecasting;

public class ApplicationEx {

    public static void main(String[] args) {

        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1= 10;
        long num2 = 20;

        // int result1 = num1 + num2;
        // 자동으로 큰 쪽 자료형인 long으로 변경 후 계산하기 때문에 int형 변수에 값을 담을 수 없다.
        long result = num1 + num2;
        // int + long은 서로 다른 자료형이라 데이터 손실이 발생하지 않는 int -> long 변환을 자동수행 후 연산한다.

        System.out.println("result = " + result); // 정상 수행됨

        // 목차. 1-1. 실수 끼리의 자동 형변환
        float fnum = 4.0f;
        double dnum = fnum;

        double result2 = fnum + dnum; // 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산된다.

        System.out.println("result2 = " + result2);

        // 목차. 1-2. 정수는 실수로 자동 형변환 된다.
        /*
        *   정수를 실수로 변경할 때 소수점 자리수가 없어도 실수형태로 표현이 가능하다.
        *   이때 데이터 손실이 없기 때문에 자동 형변환이 가능하다.
        */

        /*
        *   실제 값을 저장하는 매커니즘을 가진 것과 달리 실수형은 지수부와 가수부를 따로 나눠서 작성하기 때문에
        *   바이트 크기보다 훨씬 더 많은 값을 표현할 수 있다.
        */

        //long eight = 888888888888888;     //이것도 자동으로 형변환 된 것이다
        long eight = 8;
        float four = eight;
        System.out.println("four = " + four);
        //따라서 실수와 정수의 연산은 실수로 연산 결과가 반환된다.

        float result3 = four + eight;
        System.out.println("result3 = " + result3);

        // 목자. 1-3. 문자형은 int형으로 자동 형변환 된다.
        char ch1 = 'a';
        int charNumber = ch1;

        System.out.println("charNumber = " + charNumber);
        //int로 type이 정해지지 않은 리터럴 형태의 정수는 char형 변수에 기록 가능하다.
        char ch2 = 65;
        System.out.println("ch2 = " + ch2);

        // 목차. 1-4. 논리형은 형변환 규칙에서 제외된다.
        //어느 자료형이던 boolean형을 형변환 해서 담을 수 없다.

        boolean isTrue = true;
        //byte b = isTrue;
        //short s = isTrue;
        //int i = isTrue;
        //long l = isTrue;
        //char c = isTrue;
        //float f = isTrue;
        //double d = isTrue;

    }
}
