package com.ohgiraffers.order.dao;

import com.ohgiraffers.fakeDB.OrderDB;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository { // OrderRepository라는 public클래스 시작
    private final OrderDB orderDB = OrderDB.getInstance(); // OrderDB타입의 orderDB라는 private필드를 선언한 후 OrderDB클래스의 getInstance메서드를 호출한것을 초기화 final키워드를 이용해 객채의 변경을 막는다

    public String order(OrderDTO[] orders) { // 스트링타입의 order라는 public메서드를 생성 매개변수는 OrderDTO[]타입의 orders
        int oldNum = orderDB.getOrders().size(); // 정수타입의 oldNum을 선언한 후 OrderDB클래스의 getOrders메서드의 크기(.size())를 초기화

        for (OrderDTO orderDTO : orders) { // orders배열의 각 요소에 반복 각요소를 orderDTO라는 변수에 할당
            orderDB.setItem(orderDTO); // OrderDB클래스의 setItem메서드에 orderDTO라는 인자를 전달한 것을 호출
        } // 반복문 종료

        if (oldNum >= orderDB.getOrders().size()) { // oldNum변수가 OrderDB클래스의 getOrders메서드의 크기(.size()) 보다 크거나 같은 경우 아래 조건문 실행
            return "등록 실패"; // "등록 실패"를 반환
        } // 조건문 종료
        return "등록 성공"; // "등록 성공"을 반환
    } // order메서드 종료

    public ArrayList orderRead() { // ArratList타입의 orderRead라는 public메서드 생성
        String text = orderDB.getOrders().toString(); // 스트링타입 text라는 변수를 선언한 후 OrderDB클래스의 getOrders메서드의 toString을 할당
        System.out.println("~~~~~"); // 출력문
        System.out.println(orderDB.getOrders().toString()); // 출력문 | OrderDB클래스의 getOrders메서드의 toStrig을 출력

        System.out.println("~~~~~"); // 출력문
        return orderDB.getOrders(); // OrderDB클래스의 getOreders메서드를 반환
    } // orderRead메서드 종료

    public OrderDTO orderDetail(int no) { // OrderDTO타입의 orderDetail이라는 public메서드를 생성 매개변수는 정수타입의 no
        OrderDTO order = (OrderDTO) orderDB.getOrders().get(no); // OrderDTO타입의 order를 선언한 후 OrderDTO타입으로 형변환한 OrderDB클래스의 getOrders메서드의 no번 인덱스를 가져옴(get(no))
        return order; // order를 반환함
    } // orderDetail메서드 종료

    public String orderDelete(int no) { // 스트링타입의 orderDelete라는 public메서드를 생성
        int oldSize = orderDB.getOrders().size(); // 정수타입의 oldSize를 선언한 후 OrderDB클래스의 getOrders메서드의 크기(.size)를 할당
        orderDB.getOrders().remove(no); // OrderDB클래스의 getOrders라는 메서드의 no번 인덱스를 삭제(.remove())
        if (orderDB.getOrders().size() >= oldSize) { // OrderDB클래스의 getOrders메서드의 크기(.size())가 oldsize보다 크거나 같다면 아래의 조건문 실행
            return "주문 취소가 실패하였습니다"; // "주문 취소가 실패햐였습니다"를 반환
        } // 조건문 종료
        return "주문이 취소되었습니다."; // "주문이 취소되었습니다."를 반환
    } // orderDelete메서드 종료

} // OrderRepository클래스 종료
