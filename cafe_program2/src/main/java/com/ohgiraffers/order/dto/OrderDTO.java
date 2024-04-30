package com.ohgiraffers.order.dto;

public class OrderDTO { // OrderDTO라는 public클래스 시작

    private String menuName; // 스트링타입의 menuName이라는 private필드 선언
    private int price; // 정수타입의 price이라는 private필드 선언
    private int quantity; // 정수타입의 quantity라는 private필드 선언

    public OrderDTO(String menuName, int price, int quantity) { // OrderDTO라는 public 생성자(메서드) 생성 매개변수는 스트링타입의 menuName, 정수타입의 price, 정수타입의 quantity
        this.menuName = menuName; // 필드의 menuName에 매개변수 menuName를 대입
        this.price = quantity * price; // 필드의 price에 매개변수 price를 대입
        this.quantity = quantity; // 필드의 quantity에 매개변수 quantity를 대입
    }

    public String getMenuName() { // 스트링타입의 getMenuName이라는 public메서드 생성
        return menuName; // 필드의 menuName을 반환
    } // getMenuName메서드 종료

    public void setMenuName(String menuName) { // 반환타입이 없는 setMenuName이라는 public메서드를 생성 매개변수는 스트링타입의 menuName
        this.menuName = menuName; // 필드의 menuName에 매개변수 menuName을 대입
    } // setMenuName메서드 종료

    public int getPrice() { // 정수타입의 getPrice라는 public메서드를 생성
        return price; // 필드의 price를 반환
    } // getPrice메서드 종료

    public void setPrice(int price) { // 반환타입이 없는 setPrice라는 public메서드 생성 매개변수는 정수타입의 price
        this.price = price; // 필드의 price에 매개변수 price를 대입
    } // setPrice메서드 종료

    public int getQuantity() { // 정수타입의 getQuantity라는 public메서드를 생성
        return quantity; // 필드의 quantity를 반환
    } // getQuantity메서드 종료

    public void setQuantity(int quantity) { // 반환타입이 없는 setQuantity라는 public메서드를 생성 매개변수는 정수타입의 quantity
        this.quantity = quantity; // 필드의 quantity에 매개변수 quantity를 대입
    } // setQuantity메서드 종료

    @Override // 어노테이션(재정의)
    public String toString() { // 스트링타입의 toString이라는 public클래스를 생성
        return "OrderDTO{" + // 아래의 값을 반환
                "menuName='" + menuName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    } // toString메서드 종료
} // OrderDTO클래스 종료
