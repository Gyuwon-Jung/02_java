package com.ohgiraffers.section02.extend;

// 상속
// 인터페이스 상속 시 implements 대신에 extends를 사용함
//public class RabbitFarm<T implements Animal> {}
//public class RabbitFarm<T extends Animal> {

public class RabbitFarm <T extends Rabbit> {

// 클래스와 인터페이스 상속 시 &를 사용함
// 대신 앞에는 클래스가 와야하고 인터페이스는 뒤에 옴
// ==> &로 여러 타입을 동시에 가지는 경우에만 타입변수에 맞는 타입으로 여김(둘 중 하나가 아님)
//public class RabbitFarm <T extends Rabbit & Animal> {

// 클래스 여러개는 &사용이 불가하며, ,(콤마)사용 시 컴파일 에러는 발생하지 않지만
// 작성한 클래스를 또 다른 타입변수로 봄 => 하나의 클래스만 상속받아 구분 가능 함
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
