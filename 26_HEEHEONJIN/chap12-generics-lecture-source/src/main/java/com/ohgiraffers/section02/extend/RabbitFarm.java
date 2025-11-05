package com.ohgiraffers.section02.extend;

// 상속
// 인터페이스를 상속시 implements 키워드 대신 extends 사용한다.
//public class RabbitFarm<T extends Animal> {
public class RabbitFarm<T extends Rabbit> {


// 클래스와 인텊[이스 상속 시 &를 사용한다.
// 대신 앞에는 클래스가 와야하고 인터페이스는 위에 온다.
//  ==> & 로 여러 타입을 동시에 가지는 경우에만 타입 변수에 맞는 타입으로 여긴다. (둘중 하가 아니다)
//public class RabbitFarm<T extends Rabbit & Animal> { //무조건 하나의 내용이 있어야 된다.

//클래스 여러개는 &사용이 불가하며, ,(콤마)사용 시 컴파일 에러는 발생하지 않지만
// 작성한 클래스를 뜌 다른 타입변수로 본다. -> 하나의 클래스만 상속 받아 구현 할 수 있다.
//public class RabbitFarm<T extends Rabbit, Reptile> {

    private T animal;
    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
