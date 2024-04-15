package com.ohgiraffers.section05.typecasting;

public class Application04 {

    public static void main(String[] args) {
        int inum = 200;
        byte bnum = (byte) inum;
        System.out.println(bnum);
        // 형변환을 할경우 오버플로우 등의 데이터 손실을 고려해야 한다


    }
}
