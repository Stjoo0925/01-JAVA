package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {

    ArrayList orders = new ArrayList();

    public String order(OrderDTO orderDTO) {

        int oldNum = orders.size(); // 0

        orders.add(orderDTO);

        if (oldNum >= orders.size()) {
            return "등록실패";
        }

        return "등록성공";
    }

    public void printVeiwAll() {
        System.out.println(this.orders);
    }

    public void orderRemove(int removeNum) {
        System.out.print("삭제할 주문번호를 입력해주세요 : ");
        orders.remove(removeNum);
    }
}
