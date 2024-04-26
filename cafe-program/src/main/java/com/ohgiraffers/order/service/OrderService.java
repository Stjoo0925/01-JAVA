
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

    public int removeOrder(int i) {
        if (orderRepository.removeOrder(i)) {
            return 1;
        } else {
            return -1;
        }
    }

    public OrderDTO modifyOrder(int indexNum, OrderDTO reOrder) {
        return orderRepository.modifyOrder(indexNum, reOrder);
    }

    public OrderDTO modifyOrderByMenuName(int indexNum, String reName) {

        return orderRepository.modifyOrderByMenuName(indexNum, reName);
    }

    public OrderDTO modifyOrderByPriceByPrice(int indexNum, OrderDTO rePrice) {
        return orderRepository.modifyOrder(indexNum, rePrice);
    }

    public OrderDTO modifyOrderByQuantity(int indexNum, OrderDTO reQuantity) {
        return orderRepository.modifyOrder(indexNum, reQuantity);
    }

    public OrderDTO getOrder(int searchNum) {

        return orderRepository.getOrder(searchNum);
    }

    public ArrayList printVeiwAll() {
        return orderRepository.getTotalOrder();
    }
}
