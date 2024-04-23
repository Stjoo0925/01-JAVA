package com.ohgiraffers.section03.abstraction.problem3;

public class CarRacer {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void starUp() {
        this.car.startUp();
    }

    public void turnOff() {
        this.car.turnOff();
    }

    public void go () {
        this.car.go();
    }

    public void stop () {
        this.car.stop();
    }

    public void myCarInfo() {
        System.out.println(this.car.carName());
    }
}
