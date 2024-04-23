package com.ohgiraffers.section03.abstraction.problem3;

public class Application01 {

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("승용차");
        Car car1 = new Car();
        car1.setName("승합차");

        CarRacer joo = new CarRacer();
        joo.setCar(car);
        joo.myCarInfo();
        System.out.println();


        joo.starUp();
        car.startUp();
        System.out.println();

        joo.go();
        car.turnOff();
        System.out.println();

        joo.stop();
        joo.turnOff();

    }
}
