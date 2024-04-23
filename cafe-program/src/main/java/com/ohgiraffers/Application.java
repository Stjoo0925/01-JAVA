package com.ohgiraffers;

import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean order = true;
        OrderController orderController = new OrderController();
        String result = "";

        while (order) {

            System.out.println("1. 주문 등록");
            System.out.println("2. 주문 삭제");
            System.out.println("3. 주문 수정");
            System.out.println("4. 주문 상세조회");
            System.out.println("5. 주문 전체조회");
            System.out.print("어떤 메뉴를 동작하시겠습니까? : ");

            int menu = sc.nextInt();
            sc.nextLine();

            OrderDTO orderDTO = new OrderDTO();

            switch (menu) {
                case 1 -> { // 주문 등록
                    System.out.print("주문할 메뉴 이름을 등록해주세요 : ");
                    orderDTO.setMenuName(sc.nextLine());

                    System.out.print("수량을 입력해 주새요 : ");
                    int quantity = sc.nextInt();

                    System.out.print("가격을 입력해주세요 : ");
                    int price = sc.nextInt();

                    orderDTO.setQuantity(quantity, price);

                    result = orderController.order(orderDTO);

                }
                case 2 -> { // 주문 삭제
                    System.out.print("삭제할 주문 번호를 입력하세요 :");
                    int removeNum = sc.nextInt();
                    sc.nextLine();
                    orderController.delete(removeNum);

                }
                case 3 -> { // 주문 수정
                    orderController.correction();

                }
                case 4 -> { // 주문 상세조회
                    orderController.detailedInquiry();


                }
                case 5 -> { // 주문 전체조회
                    orderController.viewAll();

                }
                default -> {
                    System.out.println("잘못된 입력입니다.");
                }
            }

            System.out.println(result);

            System.out.print("주문을 계속하시겠습니까?");
            order = sc.nextBoolean();
        }
    }
}
