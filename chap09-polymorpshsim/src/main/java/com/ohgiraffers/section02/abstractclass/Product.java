package com.ohgiraffers.section02.abstractclass;

public abstract class Product {

    private int nonStaticField;

    private static int staticField;

    public Product() {

    }

    public void setNonStaticField() {
        System.out.println("Product 클래스의 nonStaticField 호출함");
    }

    public static void setStaticField() {
        System.out.println("Product 클래스의 staticMethod 호출함");
    }

    public abstract void absMethod();
}
