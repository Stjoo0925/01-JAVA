package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {
        /*
        A_for aFor = new A_for();
        aFor.testSimpleForStatement();
        */

        Application01 mul_t = new Application01();
        mul_t.info2();

    }
    // 구구단을 만들어주세요
    // 1. 구구단의 구성중 앞의 단을 for문으로 작성
    // 1.1 단의 시작을 알린다
    // 2. 구구단의 구성중 뒤의 단을 for문으로 작성
    // 2.1 단의 끝을 알린다.
    public void multiplication_table() {
        for (int i = 1; i <= 9; i++) {                               // 1
            System.out.println( i + "단 시작");                        // 1.1
            for (int j = 1; j <= 9; j++) {                           // 2
                System.out.println( i + " X " + j + " = " + i * j );
            }
            System.out.println( i + "단 종료\n");                      // 2.1
        }

    }

    public void multiplication_table2() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 0; j <= 9; j += i) {
                if (j != 0) {
                    System.out.println( i + " X " + j + " = " + i * j );
                }
            }
        }
    }

    public void multiplication_table3() {
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                if((j%i == 0) && (i != 1) && (j != 1)) {
                    System.out.println( i + " X " + j + " = " + i * j );
                }
            }
        }
    }

    public void multiplication_table4() {
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                if (i%2 == 0) {
                    System.out.println( i + " X " + j + " = " + i * j );
                }
            }
        }
    }

    // 열명의 이름과 나이를 입력받아 화면에 출력해주세요

    public void info () {
        Scanner info = new Scanner(System.in);
        String name;
        int age;

        for ( int i = 1; i <= 10; i++) {
            System.out.print("학생의 이름을 입력해 주세요: ");
            name = info.nextLine();
            System.out.print("학생의 나이를 입력해 주세요: ");
            age = info.nextInt();
            info.nextLine();

            System.out.println( i + "번 학생의 이름은 " + name + ", 나이는 " + age + "입니다.");
            System.out.println();
        }
    }

    public void info2() {
        Scanner scanner = new Scanner(System.in);
        int student = 10;
        String[] studentNames = new String[student];
        int[] studentAge = new int[student];
        int studentCount = 0;

        while (true) {
            System.out.print("1. 인적사항 등록 | 2. 인적사항 열람 | 3. 종료\n메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                if (studentCount >= student) {
                    System.out.println("더 이상 학생을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("학생 이름을 입력하세요: ");
                studentNames[studentCount] = scanner.nextLine();

                System.out.print("학생의 나이를 입력하세요: ");
                studentAge[studentCount] = scanner.nextInt();

                studentCount++;
            } else if (menu == 2) {
                if (studentCount == 0 ) {
                    System.out.println("등록된 학생이 없습니다.");
                    continue;
                }
                for (int i = 0; i < studentCount; i++) {
                    System.out.println(i + "번 학생의 이름은 " + studentNames[i] + ", 학생의 나이는 " + studentAge[i] + "살 입니다." );
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}
