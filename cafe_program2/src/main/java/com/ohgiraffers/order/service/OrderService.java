package com.ohgiraffers.order.service;

import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderService { // OrderService라는 public클래스 시작
    private final OrderRepository orderRepository = new OrderRepository(); // OrderRepository타입의 orderRepository라는 private필드를 생성 final키워드를 붙여 다른객채로 변경할 수 없게함

    public String order(OrderDTO[] orders) { // 스트링타입의 order라는 public메서드를 생성 매개변수로는 OrderDTO[]타입의 orders
        //    if (!OrderDTO[] orders){
        //        return "주문 실패";
        //    }
        for (OrderDTO orderDTO : orders) { // orders배열의 각 요소에 반복 각요소를 orderDTO라는 변수에 할당하는 반복문
            if (orderDTO.getPrice() <= 0) { // OrderDTO클래스의 getPrice메서드의 값이 0보다 작거나 같다면
                return "주문금액은 음수가 될수 없습니다."; // "주문금액은 음수가 될수 없습니다."를 반환
            } // 조건문 종료
        } // 반복문 종료

        String result = orderRepository.order(orders); // 스트링타입의 result라는 변수를 선언후 OrderRepository클래스의 order메서드에 orders라는 인자를 전달한 것을 초기화
        return result; // result를 반환
    } // order메서드 종료

    public ArrayList orderRead() { // ArrayList타입의 orderRead라는 public클래스를 생성
        ArrayList menuList = orderRepository.orderRead(); // ArrayList타입의 menuList를 생성한 후 OrderRepository클래스의 orderRead메서드를 호출한것을 할당
        return menuList; // menuList를 반환
    } // orderRead메서드 종료

    public OrderDTO orderDetail(int no) { // OrderDTO타입의 orderDetail이라는 public메서드 생성 매개변수는 정수타입의 no
        OrderDTO order = orderRepository.orderDetail(no); // OrderDTO타입의 order라는 변수 선언 후 OrderRepository클래스의 orderDetail메서드에 no라는 인자를 전달한것을 초기화
        return order; // order를 반환
    } // orderDetail메서드 종료

    public String orderDelete(int no) { // 스트링타입의 orderDetele이라는 public메서드 생성 매개변수는 정수타입의 no
        String result = orderRepository.orderDelete(no); // 스트링타입의 result라는 변수 선언 후 OrderRepository클래스의 orderDelete메서드에 no라는 인자를 전달한 것을 초기화
        return result; // result를 반환
    } // orderDelete메서드 종료

} // OrderService메서드 종료
