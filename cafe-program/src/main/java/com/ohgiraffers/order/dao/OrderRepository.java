package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {

    private final ArrayList orders = new ArrayList();

    int oldNum = orders.size();

    public String order(OrderDTO[] order) {
        for (OrderDTO orderDTO : order) {
            orders.add(orderDTO);
        }
        if (oldNum >= orders.size()) {
            return "주문실패";
        }
        return "주문완료";
    }

    public OrderDTO correction(int indexNum, OrderDTO reOrderDTO) {
        return (OrderDTO) orders.set(indexNum, reOrderDTO);

    }

    public boolean orderRemove(int removeNum) {
        if (!orders.isEmpty() && removeNum == 0) {
            orders.remove(removeNum);
            return true;
        } else {
            return false;
        }
    }

    public OrderDTO printSearch(int searchNum) {
        if (!orders.isEmpty() && searchNum == 0) {
            return (OrderDTO) orders.get(searchNum);
        } else {
            return null;
        }
    }

    public ArrayList printVeiwAll() {
        if (!orders.isEmpty()) {
            return this.orders;
        } else {
            return null;
        }
    }
}