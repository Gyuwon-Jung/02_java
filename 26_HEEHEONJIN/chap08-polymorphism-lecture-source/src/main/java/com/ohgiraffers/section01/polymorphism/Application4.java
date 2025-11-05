package main.java.com.ohgiraffers.section01.polymorphism;

public class Application4 {
    public static void main(String[] args) {
        Application4 application4 = new Application4();
        Animal randomAnimal = application4.getRadomAnimal();
        randomAnimal.cry();
    }

    public Animal getRadomAnimal() {
        int random = (int) (Math.random() * 2); // 0 과 1만 나옴
//        if(random == 0){
//            animal = new Rabbit();
//        } else {
//            animal = new Tiger();
//        }
        return (random == 0)? new Rabbit():new Tiger();
    }
}
