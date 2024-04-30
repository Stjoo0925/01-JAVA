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
        if (!orders.isEmpty()) {
            orders.remove(removeNum);
            return true;
        } else {
            return false;
        }
    }

    public OrderDTO modifyOrderByMenuName(int indexNum, String name) {
        if (indexNum >= 0 && indexNum < orders.size()) {
            OrderDTO order = (OrderDTO) orders.get(indexNum);
            order.setMenuName(name);
            return order;
        }
        return null;
    }

    public OrderDTO modifyOrderByQuantity(int indexNum, int quantity) {
        if (indexNum >= 0 && indexNum < orders.size()) {
            OrderDTO order = (OrderDTO) orders.get(indexNum);
            order.setQuantity(quantity);
            return order;
        }
        return null;
    }

    public OrderDTO modifyOrderByPrice(int indexNum, int price) {
        if (indexNum >= 0 && indexNum < orders.size()) {
            OrderDTO order = (OrderDTO) orders.get(indexNum);
            order.setPrice(price);
            return order;
        }
        return null;
    }

    public OrderDTO modifyOrder(int indexNum, String name, int quantity, int price) {
        if (indexNum >= 0 && indexNum < orders.size()) {
            OrderDTO order = (OrderDTO) orders.get(indexNum);
            order.setMenuName(name);
            order.setQuantity(quantity);
            order.setPrice(price);
            return order;
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