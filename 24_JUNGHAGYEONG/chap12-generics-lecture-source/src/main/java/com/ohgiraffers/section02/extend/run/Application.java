package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application {

    public static void main(String[] args) {

//        RabbitFarm<Rabbit> rabbitFarm = new RabbitFarm<>();
//        rabbitFarm.setAnimal(new Rabbit());
//        rabbitFarm.getAnimal().cry();
//        rabbitFarm.setAnimal(new Bunny());
//        rabbitFarm.getAnimal().cry();
//        rabbitFarm.setAnimal(new DrunkBunny());
//        rabbitFarm.getAnimal().cry();
        /* extends 키워드를 이용하여 특정 타입만 사용하도록 제네릭 범위를 제한할 수 있음 */
//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();

        // 토끼의 후손이거 토끼인 경우에만 타입으로 사용가능
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());
        ((Rabbit) farm4.getAnimal()).cry();
        farm4.getAnimal().cry();

        farm5.setAnimal(new Bunny());
        ((Bunny) farm5.getAnimal()).cry();
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkBunny());
        ((DrunkBunny) farm6.getAnimal()).cry();
        farm6.getAnimal().cry();
    }
}
