package com.ohgiraffers.section03.abstraction.problem3;

public class Car {

    private boolean isOn;

    private int speed;

    private String name;

    public String carName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void startUp() { // 시동을 거는 메소드
        if (isOn) {
            System.out.println("이미 시동이 걸려 있습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동이 걸렸습니다. 이제 출발할 준비가 되었습니다.");
        }
    }

    public  void turnOff() {    //  시동을 끄는 메소드
        if (this.isOn) {
            if (this.speed > 0 ) {
                System.out.println("자동차를 멈추고 다시 종료해주세요");
            } else {
                this.isOn = false;
                System.out.println("시동을 끕니다.");
            }
        } else {
            System.out.println("이미 시동이 꺼져 있습니다.");
        }
    }

    public  void  go() {    //  가속하는 메소드
        if (this.isOn) {
            this.speed += 10;
            System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다.");
        } else {
            System.out.println("차의 시동을 걸어주세요.");
        }
    }

    public void stop() {    //  멈추는 메소드
        if (this.isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다.");
            } else {
                System.out.println("차가 멈춰있는 상태입니다.");
            }
        } else {
            System.out.println("시동이 걸려있지 않습니다.");
        }
    }
}
