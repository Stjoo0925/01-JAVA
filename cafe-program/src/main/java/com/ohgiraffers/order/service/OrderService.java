
package com.ohgiraffers.order.service;

import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderService {
    //서비스 계층
    // 비지니스 로직 수행 및 데이터 베이스에 대한 리소스를 관리한다.
    private final OrderRepository orderRepository = new OrderRepository();
    OrderDTO orderDTO = new OrderDTO();

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

    public OrderDTO modifyOrderByMenuName(int indexNum, String name) {
        OrderDTO modifiedOrder = orderRepository.modifyOrderByMenuName(indexNum, name);
        if (modifiedOrder != null) {
            return modifiedOrder;
        } else {
            return null;
        }
    }

    public OrderDTO modifyOrderByQuantity(int indexNum, int quantity) {
        OrderDTO modifiedOrder = orderRepository.modifyOrderByQuantity(indexNum, quantity);
        if (modifiedOrder != null) {
            return modifiedOrder;
        } else {
            return null;
        }
    }

    public OrderDTO modifyOrderByPrice(int indexNum, int price) {
        OrderDTO modifiedOrder = orderRepository.modifyOrderByPrice(indexNum, price);
        if (modifiedOrder != null) {
            return modifiedOrder;
        } else {
            return null;
        }
    }

    public OrderDTO modifyOrder(int indexNum, String name, int quantity, int price) {
        OrderDTO modifiedOrder = orderRepository.modifyOrder(indexNum, name, quantity, price);
        if (modifiedOrder != null) {
            return modifiedOrder;
        } else {
            return null;
        }
    }

    public OrderDTO getOrder(int searchNum) {

        return orderRepository.getOrder(searchNum);
    }

    public ArrayList veiwAllOrder() {
        return orderRepository.getTotalOrder();
    }
}
