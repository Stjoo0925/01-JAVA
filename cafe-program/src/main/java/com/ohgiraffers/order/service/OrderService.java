package com.ohgiraffers.order.service;

import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;

public class OrderService {
    //서비스 계층
    // 비지니스 로직 수행 및 데이터 베이스에 대한 리소스를 관리한다.
    private OrderRepository orderRepository = new OrderRepository();

    public String order(OrderDTO order) {
        if (!order.getMenuName().equals("아메리카노")) {
            return "주문 실패";
        }

        if (order.getPrice() <= 0 ) {
            return "주문 실패";
        }

        String result = orderRepository.order(order);
        return  result;
    }

    public void printVeiwAll() {
        orderRepository.printVeiwAll();
    }

    public  void removeNum(int i) {
        orderRepository.orderRemove(i);
    }
}
