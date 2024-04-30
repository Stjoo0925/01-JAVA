package com.ohgiraffers;

import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.Scanner;

public class Application { //Application라는 public클래스 시작

    public static void main(String[] args) {    // 메인메서드 시작
        Scanner sc = new Scanner(System.in);    // 스캐너클래스 호출
        OrderController orderController = new OrderController();    //OrderController 클래스 생성
        boolean order = true;   // 불리언타입의 order 변수 생성후 true로 값 초기화
        String result = ""; // 스트링타입의 result 변수 생성후 ""로 값 초기화

        while (order) { // order의 값이 true일때 반복하는 반복문 시작
            System.out.println("1. 주제 등록"); // 출력문
            System.out.println("2. 주문 삭제"); // 출력문
            System.out.println("3. 주문 수정"); // 출력문
            System.out.println("4. 주문 상세조회"); // 출력문
            System.out.println("5. 주문 전체조회"); // 출력문
            System.out.print("어떤 메뉴를 동작하시겠습니까 : "); // 출력문
            int input = sc.nextInt(); // 정수타입의 input 변수 생성후 스캐너에서 값을 입력받아 초기화
            sc.nextLine();

            switch (input) { // input에 입력되는 값에 따라 실행되는 조건문 시작
                case 1: // case 1 시작
                    System.out.print("몇개의 음료를 주문하시겠습니까? : "); // 출력문
                    int cnt = sc.nextInt(); // 정수타입의 cnt 변수 생성후 스캐너에 입력받은 값으로 초기화
                    sc.nextLine();
                    OrderDTO[] orders = new OrderDTO[cnt]; // OrderDTO배열 타입을 가지는 orders라는 변수 생성, 배열의 길이는 cnt의 값만큼
                    for (int i = 0; i < orders.length; i++) { // orders의 길이만큼 반복하는 반복문 시작
                        System.out.print("주문할 메뉴 이름을 등록해주세요 : "); // 출력문
                        String menuName = sc.nextLine(); // 문자열타입의 menuName이라는 변수 선언후 스캐너로 입력받은 값 초기화
                        System.out.print("수량을 입력해주세요 : "); // 출력문
                        int quantity = sc.nextInt(); // 정수타입의 quantity라는 변수 선언후 스캐너로 입력받은 값 초기화
                        sc.nextLine();
                        System.out.print("가격을 입력해주세요 : "); // 출력문
                        int price = sc.nextInt(); // 정수타입의 price라는 변수 선언후 스캐너로 입력받은 값 초기화
                        sc.nextLine();
                        orders[i] = new OrderDTO(menuName, quantity, price); // orders의 [i] 번째 인덱스는 생성자 OrderDTO에 menuName, quantity, price의 값을 초기화한 것이다
                    }
                    result = orderController.order(orders); // result 는 orderController의 order메소드를 호출하고 orders라는 파라미터를 전달한것
                    break; // 반복문 종료
                case 2: // case 2 시작
                    System.out.print("삭제할 제품의 번호를 입력해주세요 : "); // 출력문
                    int no = Integer.parseInt(sc.nextLine()); // 정수타입의 no 변수를 선언하여 스캐너로 받은 값을 정수형으로 변환하여 초기화
                    result = no + "번 "; // result는 no변수의 값과 문자열형 "번"을 합친것
                    result += orderController.orderDelete(no); // 반복문이 반복되면서 OrderController클래스의 orderDelete메소드에 no라는 인자를 전달한것을 합산한다
                    break; // 반복문 종료
                case 3: // case 3 시작
                    orderController.orderModify(); // OrderController클래스의 orderModify메소드를 호출
                    break; // 반복문 종료
                case 4: // case 4 시작
                    System.out.println(orderController.orderRead()); // 출력문 | OrderController클래스의 orderRead메서드를 호출 한것을 출력
                    System.out.print("상세 조회할 제품 번호를 입력해주세요 : "); // 출력문
                    int num = sc.nextInt(); // 정수타입의 num 변수를 선언하고 스캐너에서 입력받은 값을 초기화
                    sc.nextLine();
                    result = orderController.orderDetail(num); // result에 OrderController클래스의 orderDetail메서드의 num이라는 인자를 전달한 것을 초기화
                    break; // 반복문 종료
                case 5: // case 5 시작
                    result = orderController.orderRead(); // result에 OrderController클래스의 orderRead메서드를 호출한것을 초기화
                    break; // 반복문 종료

                default: // 이외의 input의 값을 받았을 경우
                    System.out.println("잘못된 입력입니다."); // 출력문
                    break; // 반복문 종료
            }

            System.out.println(result); // result를 출력함

            System.out.print("주문을 종료하시겠습니까 ? | true or false : "); // 출력문
            order = sc.nextBoolean(); // order라는 변수에 스캐너에서 입력받은 값을 초기화
        } // 반복문 종료
    } //메인메서드 종료
} // 클래스 종료
