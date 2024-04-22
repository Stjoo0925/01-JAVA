package com.ohgiraffers.section02.demensinal;

import java.util.Scanner;

public class CheckerBoardRef {

    public static void main(String[] args) {
        CheckerBoardRef checkerBoardRef = new CheckerBoardRef();
        checkerBoardRef.checker();

    }

    public void checker() {
        String[][] board = new String[19][19];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = "[ ]";
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        String play = "";
        Scanner scanner = new Scanner(System.in);
        int[] index = new int[2];
        int turn = 0;

        while (!play.equals("exit")) {
            System.out.print("첫 번째 좌표를 입력해주세요 : ");
            index[0] = scanner.nextInt();
            System.out.print("두 번째 좌표를 입력해주세요 : ");
            index[1] = scanner.nextInt();

            if (board[index[0]][index[1]].equals("[ ]")) {
                if (turn % 2 == 0) {
                    board[index[0]][index[1]] = "[흑]";
                } else {
                    board[index[0]][index[1]] = "[백]";
                }
            } else {
                System.out.println("같은 위치에 바둑돌을 놓을 수 없습니다.");
                turn += 2;
                continue;
            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            turn++;

            System.out.print("계속 플레이를 원하시면 아무키나 입력하시고, 종료를 원하시면 exit를 입력해주세요. : ");
            play = scanner.next();
            if (play.equals("exit")) {
                break;
            } else {

            }
        }


    }
}