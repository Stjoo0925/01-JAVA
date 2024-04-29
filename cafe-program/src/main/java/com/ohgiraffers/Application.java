package com.ohgiraffers;

import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.Scanner;

public class Application {  // 어플리케이션 클래스 시작

    public static void main(String[] args) {    // 메인 메소드시작
        Scanner sc = new Scanner(System.in);    // 스캐너 호출
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
                    System.out.print("몇개의 음료를 주문하시겠습니까? : ");
                    int orderNum = sc.nextInt();
                    sc.nextLine();
                    OrderDTO[] orders = new OrderDTO[orderNum];
                    for (int i = 0; i < orders.length; i++) {
                        System.out.print("주문할 메뉴 이름을 등록해주세요 : ");
                        String name = sc.nextLine();
                        System.out.print("수량을 입력해 주새요 : ");
                        int quantity = sc.nextInt();
                        sc.nextLine();
                        System.out.print("가격을 입력해주세요 : ");
                        int price = sc.nextInt();
                        sc.nextLine();
                        orders[i] = new OrderDTO(name, quantity, price);
                    }
                    result = orderController.order(orders);
                    System.out.println(result);
                }
                case 2 -> { // 주문 삭제
                    System.out.print("삭제할 주문 번호를 입력하세요 : ");
                    int removeNum = sc.nextInt();
                    sc.nextLine();
                    result = orderController.removeOrder(removeNum);
                    System.out.println(result);
                }
                case 3 -> { // 주문 수정
                    System.out.print("수정할 주문 번호 : ");
                    int indexNum = sc.nextInt();
                    sc.nextLine();
                    boolean col = true;
                    while (col) {
                        System.out.print("1. 메뉴 수정 | 2. 수량 수정 | 3. 가격 수정 | 4. 전부 수정 | 5. 종료 : ");
                        int menu2 = sc.nextInt();
                        sc.nextLine();
                        switch (menu2) {
                            case 1 -> {
                                System.out.print("메뉴 수정 : ");
                                String reMenu = sc.nextLine();
                                orderController.modifyOrderByMenuName(indexNum,reMenu);
                            }
                            case 2 -> {
                                System.out.print("수량 수정 : ");
                                int reQuantity = sc.nextInt();
                                sc.nextLine();
                                orderController.modifyOrderByPrice(indexNum,reQuantity);
                            }
                            case 3 -> {
                                System.out.print("가격 수정 : ");
                                int rePrice = sc.nextInt();
                                sc.nextLine();
                                orderController.modifyOrderByQuantity(indexNum,rePrice);
                            }
                            case 4 -> {
                                System.out.print("메뉴 수정 : ");
                                String reMenu = sc.nextLine();
                                System.out.print("수량 수정 : ");
                                int reQuantity = sc.nextInt();
                                sc.nextLine();
                                System.out.print("가격 수정 : ");
                                int rePrice = sc.nextInt();
                                sc.nextLine();
                                OrderDTO reOrder = new OrderDTO(reMenu, reQuantity, rePrice);
                                orderController.modifyOrder(indexNum,reOrder);
                            }
                            case 5 -> {
                                col = false;
                            }
                            default -> {
                                System.out.println("오류!");
                            }
                        }
                    }
                }
                case 4 -> { // 주문 상세조회
                    System.out.print("검색할 주문 번호를 입력하세요 : ");
                    int searchNum = sc.nextInt();
                    sc.nextLine();
                    result = orderController.getOrder(searchNum);
                    System.out.println(result);
                }
                case 5 -> { // 주문 전체조회
                    result = orderController.printAll();
                    System.out.println(result);
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