package com.ohgiraffers.section02.variable;

public class Application01 {

    public static void main(String[] args) {

        /*
        * 변수의 사용목적
        *   1. 값에 의미를 부여하기 위한 목적
        *   2. 한 번 저장해둔 값을 재사용 하기 위한 목적
        *   3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다.
        */

        System.out.println("======= 값에 의미 부여 테스트 =======");
        System.out.println("보너스를 포함한 급여 : " + (10000000 + 2000000) + "원" );
        System.out.println("");

        // 백만원 이하는 절삭
        int variable; // 변수 선언문
        variable = 10; // 변수 초기화
        System.out.println(variable); //변수를 이용한 프린트

        int salary = 10; // 변수의 선언과 초기화를 동시에 실행
        int bouns = 2;   // 변수는 메로리의 주소값과 같다.

        System.out.println("보너스를 포함한 급여 : " + (salary + bouns) + "백만원");
        System.out.println("");

        // 한 번 저장해둔 값을 재사용하기 위한 목적
        System.out.println("====== 변수에 저장한 값 재사용 테스트 ======");
        System.out.println("1번 고객에게 포인트 100포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 110포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 120포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 130포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 140포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 150포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 160포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 170포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 180포인트 지급하였습니다.");
        System.out.println("");

        System.out.println("변수를 사용하는 경우"); // 변수를 재사용하는 경우, 기존에 변수를 다시 사용
        int point = 100;
        System.out.println("1번 고객에게 포인트 " + point + "포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 " + (point += 10) + "포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 " + (point += 10) + "포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 " + (point += 10) + "포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 " + (point += 10) + "포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 " + (point += 10) + "포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 " + (point += 10) + "포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 " + (point += 10) + "포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 " + (point += 10) + "포인트 지급하였습니다.");
        System.out.println("");


    }
}
