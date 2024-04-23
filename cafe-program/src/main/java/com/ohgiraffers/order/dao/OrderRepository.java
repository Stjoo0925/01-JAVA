package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {

    ArrayList orders = new ArrayList();

    int oldNum = orders.size();

    public String order(OrderDTO orderDTO) {


        orders.add(orderDTO);

        if (oldNum >= orders.size()) {
            return "실패";
        }

        return "완료";
    }

    public void printVeiwAll() {
        System.out.println(this.orders);
    }

    public void orderRemove(int removeNum) {
        if (oldNum >= orders.size()) {
            System.out.println("주문 목록이 없습니다.");
        } else {
            orders.remove(removeNum);
        }

    }
}
