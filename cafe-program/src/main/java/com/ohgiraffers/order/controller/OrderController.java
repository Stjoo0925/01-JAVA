package com.ohgiraffers.order.controller;

import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

public class OrderController {

    private final OrderService orderService = new OrderService();

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

    public String delete(int i) {
        int result = orderService.removeNum(i);
        if (result == 1) {
            return "주문이 성공적으로 삭제되었습니다.";
        } else if (result == -1) {
            return "주문 삭제에 실패하였습니다.";
        } else {
            return "존재하지 않는 주문 번호입니다.";
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
        String allResult1 = String.valueOf(orderService.printVeiwAll());
        System.out.println(allResult1);
        return allResult1;
    }

}
