package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {

    private final ArrayList orders = new ArrayList();

    int oldNum = orders.size();

    public String order(OrderDTO orderDTO) {

        orders.add(orderDTO);
        if (oldNum >= orders.size()) {
            return "실패";
        }
        return "완료";
    }

    public OrderDTO correction(int indexNum, OrderDTO reOrderDTO) {
        return (OrderDTO) orders.set(indexNum, reOrderDTO);

    }

    public boolean orderRemove(int removeNum) {
        if (oldNum >= orders.size()) {
            System.out.println("주문목록이 없습니다.");
            return false;
        } else {
            orders.remove(removeNum);
        }
        return true;
    }

    public OrderDTO printSearch(int searchNum) {
        if (searchNum >= 0 && searchNum < orders.size()) {
            return (OrderDTO) orders.get(searchNum);
        } else {
            return null;
        }
    }

    public ArrayList printVeiwAll() {
        return this.orders;
    }
}
