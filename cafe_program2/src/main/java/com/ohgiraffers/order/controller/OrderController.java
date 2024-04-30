package com.ohgiraffers.order.controller;

import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

import java.util.ArrayList;

public class OrderController { // OrderController라는 public클래스 시작
    private final OrderService orderService = new OrderService(); // OrderService타입의 orderService라는 이름의 private필드를 생성 final이란 키워드를 붙여 다른객체로 변경할수 없음

    public String order(OrderDTO[] orders) { // 스트링타입의 order public메서드를 생성 매개변수는 OrderDTO[] orders이다
        for (OrderDTO orderDTO : orders) { // orders배열의 각 요소에 반복 각요소를 orderDTO라는 변수에 할당하는 반복문
            if (orderDTO.getMenuName().equals("")) { // OrderDTO클래스의 getMenuName메서드의 값이 공백일 경우(.equals(""))
                return "메뉴를 정해주세요"; // "메뉴를 정해주세요"를 반환
            } // 조건문 종료
            if (orderDTO.getQuantity() <= 0) { // OrderDTO클래스의 getQuantity메서드의 값이 0보다 작거나 같을 경우
                return "수량을 입력해주세요"; // "수량을 입력해주세요"를 반환
            } // 조건문 종료
        } // 반복문 종료
        String result = orderService.order(orders); // 스트링타입의 result라는 변수를 초기화 한후 OrderService라는 클래스의 order메서드의 orders라는 인자를 전달한 것을 초기화
        return result; // 변수 result를 반환
    } // order메서드 종료

    public String orderModify() { // 스트링타입의 orderModify라는 public메서드를 생성
        return "주문수정"; // "주문수정"을 반환
    } // orderModify메서드 종료

    public String orderDelete(int no) { // 스트링타입의 orderDelete라는 public메서드를 생성하고 매개변수로는 정수타입의 no
        String result = orderService.orderDelete(no); // 스트링타입의 result 변수를 선언한후 OrderService클래스의 orderDelete메서드에 no라는 인자를 전달한 것을 초기화

        return result; // result 변수를 반환
    } // orderDelete메서드 종료

    public String orderRead() { // 스트링타입의 orderRead라는 public메서드를 생성
        ArrayList orderList = orderService.orderRead(); // ArrayList타입의 orderList 변수 선언 후 OrderService클래스의 orderRead메서드를 호출한 것을 초기화
        String result = "주문 목록 : " + orderList.toString(); // 스트링타입 result라는 변수 선언 후 "주문 목록 : " + orderList변수를 참조하여 toString메서드 호출 한 것을 초기화
        return result; // result 변수를 반환
    } // orderRead메서드 종료

    public String orderDetail(int no) { // 스트링타입의 orderDetail이라는 public메서드 생성 매개변수는 정수타입의 no
        if (no < 0) { // 매개변수 no의 값이 0보다 작을경우 아래의 조건문을 실행
            return "메뉴 번호를 잘못 입력하였습니다."; // "메뉴 번호를 잘못 입력하였습니다."를 반환
        } // 조건문 종료
        OrderDTO orderDTO = orderService.orderDetail(no); // OrderDTO타입의 orderDTO라는 변수를 선언한 후 OrderService클래스의 orderDetail메서드에 no라는 변수를 인자로 전달한 것을 초기화
        if (orderDTO == null) { // orderDTO의 값이 없다면 아래의 조건문을 실행
            return "존재하지 않는 주문입니다."; // "존재하지 않는 주문입니다."를 반환
        } // 조건문 종료
        return orderDTO.toString(); // OrderDTO클래스의 toString메서드를 반환
    } // orderDetail메서드 종료
} // OrderController클래스 종료
