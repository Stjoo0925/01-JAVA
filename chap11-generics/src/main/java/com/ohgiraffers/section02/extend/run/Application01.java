package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application01 {

    public static void main(String[] args) {

        // 기준 <T extends Rabbit>을 기준으로
        // Animal 클래스는 Rabbit의 조상타입으로 타입이 맞지 않음
        // RabbitFarm<Animal> Farm1 = new RabbitFarm<>();

        // Mammal 클래스는 Rabbit의 부모타입으로 타입이 맞지 않는다
        // RabbitFarm<Mammal> Farm2 = new RabbitFarm<>();

        // Snake는 Rabbit과 관련이 없는 타입으로 타입이 맞지 않는다.
        // RabbitFarm<Snake> Farm3 = new RabbitFarm<>();

        // Rabbit은 Rabbit과 같은 타입으로 제네릭스 타입의 지정이 가능하다.
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>(new Rabbit());
        farm4.getAnimal().cry();

        // Bunny는 Rabbit의 자식 타입으로 제네릭스 타입의 지정이 가능하다.
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        // DrunkenBunny는 Rabbit의 증손타입으로 제네릭스 타입 지정이 가능하다.
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();
        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();

    }
}
