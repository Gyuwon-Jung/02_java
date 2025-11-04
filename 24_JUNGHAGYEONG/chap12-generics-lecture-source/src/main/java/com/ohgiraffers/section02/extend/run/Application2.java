package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {

    public static void main(String[] args) {
        WildCardFarm wildCardFarm = new WildCardFarm();

        // 농장 생성자체가 불가능 한 것은 매개변수로 사용 할 수 없음
//        wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));
//        wildCardFarm.anyType(new RabbitFarm<Reptile>(new Reptile()));

        RabbitFarm<Rabbit> rabbitFarm1 = new RabbitFarm<>();
        rabbitFarm1.setAnimal(new Rabbit());
        wildCardFarm.anyType(rabbitFarm1);

        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkBunny()));

//        wildCardFarm.extendType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extendType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendType(new RabbitFarm<DrunkBunny>(new DrunkBunny()));

        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkBunny>(new DrunkBunny()));

    }
}
