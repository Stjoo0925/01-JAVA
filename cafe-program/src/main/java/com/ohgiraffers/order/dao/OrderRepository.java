package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {

    private final ArrayList orders = new ArrayList();

    OrderDTO orderDTO = new OrderDTO();

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

    public boolean removeOrder(int removeNum) {
        if (!orders.isEmpty() && removeNum == 0) {
            orders.remove(removeNum);
            return true;
        } else {
            return false;
        }
    }

    public OrderDTO modifyOrder(int indexNum, OrderDTO reOrder) {
        return (OrderDTO) orders.set(indexNum, reOrder);

    }

    public OrderDTO modifyOrderByMenuName(int indexNum, String name) {
        if (!orders.isEmpty()) {
            orderDTO.setMenuName(name);
        }
        return null;

    }

    public OrderDTO modifyOrderByPrice(int indexNum, int price) {
        if (!orders.isEmpty()) {
            orderDTO.setPrice(price);
        }
        return null;

    }

    public OrderDTO modifyOrderByQuantity(int indexNum, int quantity) {
        if (!orders.isEmpty()) {
            orderDTO.setQuantity(quantity);
        }
        return null;

    }

    public OrderDTO getOrder(int searchNum) {
        if (!orders.isEmpty() && searchNum == 0) {
            return (OrderDTO) orders.get(searchNum);
        } else {
            return null;
        }
    }

    public ArrayList getTotalOrder() {
        if (!orders.isEmpty()) {
            return this.orders;
        } else {
            return null;
        }
    }
}