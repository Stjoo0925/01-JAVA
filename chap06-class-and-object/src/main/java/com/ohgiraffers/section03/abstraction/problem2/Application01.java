package com.ohgiraffers.section03.abstraction.problem2;

public class Application01 {

    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();
        CarRacer cr = new CarRacer();

        cr.starUp(car);
        cr.go(car1);
        cr.stop(car1);
        cr.turnOff(car1);

    }
}
