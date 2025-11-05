package com.sekong.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {
        Application3 application3 = new Application3();
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();
        Animal animal3 = new Animal();
        application3.feed(animal1); // 동일한 타입이기 때문에 가능
        application3.feed(animal2);
        application3.feed(animal3);

        Rabbit rabbit1 = new Rabbit();
        Tiger tiger1 = new Tiger();

        application3.feed(rabbit1); // 묵시적 형변환
        application3.feed(tiger1);

        application3.feed((Animal) rabbit1); // 명시적 형변환
        application3.feed((Animal) tiger1);

        application3.feed(new Rabbit());

    }
//    public void feed(Rabbit rabbit){}
//    public void feed(Tiger tiger){}
    public void feed(Animal animal){
        animal.eat(); // 동적 바인딩
    }
}
