package com.ohgiraffers.section02.demensinal;

import java.util.Scanner;

public class Checkerboard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 19;
        int cols = 19;
        int[][] checkerboard = new int[rows][cols];

        // 바둑판의 돌을 놓는다
        while (true) {
            System.out.print("1. 바둑돌 놓기 | 2. 종료 : ");
            int menu = scanner.nextInt();
            if (menu == 1) {
                int inputRow;
                int inputCol;
                System.out.print("바둑돌을 놓을 행을 입력하세요: ");
                inputRow = scanner.nextInt();
                System.out.print("바둑돌을 놓을 열을 입력하세요: ");
                inputCol = scanner.nextInt();
                if (checkerboard[inputRow][inputCol] != 0) {
                    System.out.println("이미 돌을 놓은 자리입니다");
                } else if(checkerboard[inputRow][inputCol] == 0) {
                    System.out.print("바둑돌의 색 1. 흑 | 2. 백 | 종료를 원하시면 3을 입력하세요.");
                    int menu2 = scanner.nextInt();
                    if (menu2 == 1) {
                        checkerboard[inputRow][inputCol] = 1;
                    } else if (menu2 == 2) {
                        checkerboard[inputRow][inputCol] = 2;
                    } else if (menu2 == 3) {
                        break;
                    }
                }

            } else if (menu == 2) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(checkerboard[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
