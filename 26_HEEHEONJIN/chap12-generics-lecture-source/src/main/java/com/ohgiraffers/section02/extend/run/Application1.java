package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {
    public static void main(String[] args) {

//        RabbitFarm<Rabbit> rabbitFarm = new RabbitFarm<>();
//
//        rabbitFarm.setAnimal(new Rabbit());
//        rabbitFarm.getAnimal.cry();
//
//        rabbitFarm.setAnimal(new Bunny());
//        rabbitFarm.getAnimal.cry();
//
//        rabbitFarm.setAnimal(new DrunkBunny());
//        rabbitFarm.getAnimal.cry();
        /* extends 키워드를 이용하여 특정 타입만 사용하도록 제네릭 범위를 제한할 수 있다.*/

//        RabbitFarm<Animal> farm1 =  new RabbitFarm<Animal>(); // 이거는 안 된다.
//        RabbitFarm<Mammal> farm2 =  new RabbitFarm<Mammal>(); // 요것두 안 된다.
//        RabbitFarm<Snake> farm3 =  new RabbitFarm<Snake>(); // 요것두 안 된다.

        RabbitFarm<Rabbit> farm4 =  new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());
        ((Rabbit) farm4.getAnimal()).cry(); // 명시적 형변환
        farm4.getAnimal().cry(); //묵시적 형변환

        farm5.setAnimal(new Bunny());
        ((Bunny) farm5.getAnimal()).cry();
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkBunny());
        ((DrunkBunny) farm6.getAnimal()).cry();
        farm6.getAnimal().cry();
    }
}
