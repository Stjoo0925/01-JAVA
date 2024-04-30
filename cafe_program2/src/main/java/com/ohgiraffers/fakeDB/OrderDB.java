package com.ohgiraffers.fakeDB;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderDB { // OrderDB라는 public클래스 시작

    private final ArrayList orders; // ArrayList타입의 orders라는 private필드 생성 final키워드를 붙여 오브젝트를 수정하지 못하도록 함
    private static OrderDB orderDB = new OrderDB(); // OrderDB타입의 orderDB라는 private필드를 생성 static키워드를 붙여 프로그램 시작과 동시에 static메모리에 올라가도록 함

    private OrderDB() { // OrderDB라는 private생성자 생성
        orders = new ArrayList(); // ArrayList타입의 orders를 생성
        OrderDTO orderDTO = new OrderDTO("아메리카노", 1000, 3); // OrderDTO타입의 orderDTO를 선언한 후 OrderDTO라는 클래스 객체를 생성 후 매개변수는 아메리카노 1000 3 를 대입한 것을 대입
        orders.add(orderDTO); // orders라는 ArrayList에 orderDTO를 추가(.add())한다
    }

    public static OrderDB getInstance() { // OrderDB타입의 getInstance라는 public메서드를 생성 static키워드를 사용하여 프로그램이 시작할때 static메모리에 올림
        return orderDB; // OrderDB타입의 orderDB라는 변수를 반환
    }

    public void setItem(OrderDTO orderDTO) { // 반환타입이 없는 setItem이라는 public메서드를 생성 매개변수는 OrderDTO타입의 orderDTO
        orders.add(orderDTO); // ArrayList타입의 orders라는 변수에 orderDTO를 추가(.add())한다
    } // setItem메서드 종료

    public ArrayList getOrders() { // ArrayList타입의 getOrders라는 public메서드를 생성
        return orders; // OrderDTO타입의 orders를 반환함
    } // getOrders메서드 종료
} // OrderDB클래스 종료
