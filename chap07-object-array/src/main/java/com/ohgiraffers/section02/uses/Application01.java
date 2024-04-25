package com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        /*
        *   시스템 요구사항
        *   1. 여러 명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
        *   2. 전체 회원 조회 시 여러 명의 회원 정보를 반환
        */

        Scanner scanner = new Scanner(System.in);

        MemberService memberService = new MemberService();
        while (true) {
            System.out.println("회원관리 프로그램");
            System.out.println("1.회원등록");
            System.out.println("2.회원 전체 조회");
            System.out.println("9.프로그램종료");
            System.out.print("메뉴선택 : ");
            int no = scanner.nextInt();
            scanner.nextLine();
            switch (no) {
                case 1 -> memberService.singUpMembers();
                case 2 -> memberService.showAllMembers();
                case 9 -> {
                    System.out.println("프로그램을 종료합니다");
                    return;
                }
                default -> System.out.println("잘못된 번호를 입력하셨습니다.");
            }

        }

    }
}
