
package com.ohgiraffers.order.service;

import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderService {
    //서비스 계층
    // 비지니스 로직 수행 및 데이터 베이스에 대한 리소스를 관리한다.
    private final OrderRepository orderRepository = new OrderRepository();

    public String order(OrderDTO[] orders) {
        for (OrderDTO order : orders) {
            if (!order.getMenuName().equals("아메리카노")) {
                return "주문 실패";
            }
            if (order.getPrice() <= 0 ) {
                return "주문 실패";
            }
        }
        String result = orderRepository.order(orders);

        return  result;
    }

    public OrderDTO correction(int indexNum, OrderDTO reOrder) {
        return orderRepository.correction(indexNum, reOrder);
    }


    public int removeNum(int i) {
        if (orderRepository.orderRemove(i)) {
            return 1;
        } else {
            return -1;
        }
    }

    public OrderDTO printSearch(int searchNum) {

        return orderRepository.printSearch(searchNum);
    }

    public ArrayList printVeiwAll() {
        return orderRepository.printVeiwAll();
    }
}
