package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

    String name;

    private int hp; // 캡슐화 원칙

    //몬스터의 hp가 0보다 큰 값만 입력 될 수 있도록 하여 버그를 막고자함
    public void setHp(int hp) {
        if (hp > 0) {
            this.hp = hp; // class monster에 있는 hp 를 setHp메소드의 매개변수로 전달 받은 hp를 입력하겠다는 의미
                          // class 필드 변수는 나(this)를 지정할수 있다
        } else {
            System.out.println("몬스터의 체력은 0보다 작을 수 없습니다.");
        }
    }

    public int getHp() {
        return this.hp;
    }
}

