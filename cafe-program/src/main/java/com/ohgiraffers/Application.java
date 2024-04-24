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
            System.out.println("6. 주문 종료");
            System.out.print("어떤 메뉴를 동작하시겠습니까? : ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1 -> { // 주문 등록
                    System.out.print("주문할 메뉴 이름을 등록해주세요 : ");
                    String name = sc.nextLine();
                    System.out.print("수량을 입력해 주새요 : ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    System.out.print("가격을 입력해주세요 : ");
                    int price = sc.nextInt();
                    sc.nextLine();
                    OrderDTO orderDTO = new OrderDTO(name, quantity, price);
                    orderController.order(orderDTO);
                }
                case 2 -> { // 주문 삭제
                    System.out.print("삭제할 주문 번호를 입력하세요 :");
                    int removeNum = sc.nextInt();
                    sc.nextLine();
                    result = orderController.delete(removeNum);
                    System.out.println(result);
                }
                case 3 -> { // 주문 수정
                    System.out.print("수정할 주문 번호 : ");
                    int indexNum = sc.nextInt();
                    sc.nextLine();
                    System.out.print("메뉴 수정 : ");
                    String reMenu = sc.nextLine();
                    System.out.print("수량 수정 : ");
                    int reQuantity = sc.nextInt();
                    sc.nextLine();
                    System.out.print("비용 수정 : ");
                    int rePrice = sc.nextInt();
                    sc.nextLine();
                    OrderDTO reOrder = new OrderDTO(reMenu, reQuantity, rePrice);
                    String correctionResult = orderController.correction(indexNum,reOrder);
                }
                case 4 -> { // 주문 상세조회
                    System.out.print("검색할 주문 번호를 입력하세요 :");
                    int searchNum = sc.nextInt();
                    sc.nextLine();
                    result = orderController.printSearch(searchNum);
                    System.out.println(result);
                }
                case 5 -> { // 주문 전체조회
                    orderController.printAll();
                }
                case 6 -> {
                    System.out.println("주문을 종료합니다.");
                    order = false;
                }
                default -> {
                    System.out.println("잘못된 입력입니다.");
                }
            }
        }
    }
}
