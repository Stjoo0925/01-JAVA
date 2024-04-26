
package com.ohgiraffers.order.dto;

public class OrderDTO { // 데이터를 전달하기 쉽게 하기 위해 사용하는 클래스
    private String menuName;

    private int price;

    private int quantity;

    private int indexNum;

    public int getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(int indexNum) {
        this.indexNum = indexNum;
    }

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

    public OrderDTO (String menuName) {
        this.menuName = menuName;
    }

    public OrderDTO (int price) {
        this.price = price;
    }


    public OrderDTO (String menuName, int price, int quantity) {
        this.menuName = menuName;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderDTO () {

    }

    @Override
    public String toString() {
        return  "\n" + "================ 주문리스트 ===============" + " \n" +
                "메뉴이름 : " + menuName + " | " +
                "가격 : " + price + " | " +
                "수량 : " + quantity + "\n" +"========================================" + "\n";
    }
}
