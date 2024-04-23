package com.ohgiraffers.order.controller;

import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

public class OrderController {

    private OrderService orderService = new OrderService();

    public String order(OrderDTO order) {
        // 컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.
        if (order.getMenuName().equals("")) {
            return "메뉴를 정해주세요.";
        }

        if (order.getQuantity() <= 0) {
            return "수량을 입력해주세요.";
        }

        // service 로직으로 넘김.
        String result = orderService.order(order);
        return result;
    }

    public void delete(int i) {
        System.out.println("삭제할 상품의 번호를 입력해주세요.");
        orderService.removeNum(i);
    }

    public String correction() {
        return "수정하기";
    }

    public String detailedInquiry() {
        return "상세 조회하기";
    }

    public void viewAll() {
        orderService.printVeiwAll();
    }

}
