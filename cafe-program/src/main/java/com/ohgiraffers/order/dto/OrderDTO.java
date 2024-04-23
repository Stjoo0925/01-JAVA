package com.ohgiraffers.order.dto;

public class OrderDTO {
    private String menuName;

    private int price;

    private int quantity;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity, int price) {
        this.quantity = quantity;
        this.price = quantity * price;
    }

    @Override
    public String toString() {
        return "주문리스트 =>" +
                " {메뉴이름 :' " + menuName + '\'' +
                ", 가격 : " + price +
                ", 수량 : " + quantity +
                '}';
    }
}
