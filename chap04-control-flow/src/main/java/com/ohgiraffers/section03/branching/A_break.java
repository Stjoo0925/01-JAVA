package com.ohgiraffers.section03.branching;

public class A_break {

    /*
    *   break문 실행 흐름을 확인하기 위한 용도의 기능을 제공 분기문(break) 기본 흐름에 대해 확인
    */

    public  void testSimpleBreakStatement() {
        int first = 2;
        test:
        while (true) {
            if (first >= 10) {
                break test;
            }
            int seconnd = 0;
            while (seconnd <= 9) {
                if (seconnd >= 5) {
                    break;
                }

                if (seconnd == 0 ) {
                    seconnd++;
                    continue;
                }

                System.out.println(first + " * " + seconnd + " = " + (first * seconnd));
                seconnd++;
            }

            first++;
        }
    }
}
