package com.ohgiraffers.section03.abstraction.problem1;

public class Application01 {

    public static void main(String[] args) {
        Car car = new Car();
        CarRacer cr = new CarRacer();
        cr.setName("주순태");

        car.setOn(true);
        if (car.isOn()) {
            System.out.println("시동이 걸렸습니다.");
            System.out.println("자동차를 출발합니다.");
            // 자동차를 출발한다고 가정함
            cr.setOn(true);
            if (cr.isOn()) {
                car.setSpeed(10);
            }
            System.out.println("자동차의 현재 속도 " + car.getSpeed() + "km/h");

            if (car.getSpeed() == 0) {
                System.out.println("자동차의 시동을 끕니다.");
                car.setOn(false);
            } else {
                System.out.println("자동차를 정지하지 않은 상태에서는 자동차를 멈출 수 없습니다.");
            }

            System.out.println("자동차를 멈추겠습니다");
            car.setSpeed(0);
            System.out.println("이제 자동차를 정지할 수 있습니다.");
            car.setOn(false);

        }


    }

}
