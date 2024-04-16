package com.ohgiraffers.section01.method;

public class Application04 {

    public static void main(String[] args) {
        int first = 100;
        int second = 50;

        Calculator cal = new Calculator();
        int min = cal.minNumberOf(first, second);
        System.out.println("두 숫자중 작은 수는: " + min);

        int max = cal.maxNumberOf(first, second);
        System.out.println("두 숫자중 큰 수는: " + max);
    }
}
