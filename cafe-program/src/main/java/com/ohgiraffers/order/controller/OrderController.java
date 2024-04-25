package com.ohgiraffers.order.controller;

import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

import java.util.ArrayList;

public class OrderController {

    private final OrderService orderService = new OrderService();

    public String order(OrderDTO[] orders) {
        // 컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.
        for (OrderDTO order : orders) {
            if (order.getMenuName().equals("")) {
                return "메뉴를 정해주세요.";
            }
            if (order.getQuantity() <= 0) {
                return "수량을 입력해주세요.";
            }
        }
        // service 로직으로 넘김.
        String result = orderService.order(orders);
        return result;
    }

    public String delete(int i) {
        if(i < 0) {
            System.out.println("주문 목록은 음수가 될 수 없습니다.");
        }
        int deletionResult = orderService.removeNum(i);
        if (deletionResult == 1) {
            return "주문이 성공적으로 삭제되었습니다.";
        } else if (deletionResult == -1) {
            return "주문 번호가 존재하지 않습니다.";
        } else {
            return "오류가 발생했습니다.";
        }
    }

    public String correction(int indexNum, OrderDTO reOrder) {
        String result = String.valueOf(orderService.correction(indexNum, reOrder));
        return result;
    }

    public String printSearch(int searchNum) {
        OrderDTO searchOrder = orderService.printSearch(searchNum);
        if (searchOrder != null) {
            return searchOrder.toString();
        } else {
            return "주문을 찾을 수 없습니다.";
        }
    }

    public String printAll() {
        if (orderService.printVeiwAll() == null) {
            return "주문 내역이 없습니다.";
        }
        String AllOrder = String.valueOf(orderService.printVeiwAll());
        return AllOrder;
    }
}