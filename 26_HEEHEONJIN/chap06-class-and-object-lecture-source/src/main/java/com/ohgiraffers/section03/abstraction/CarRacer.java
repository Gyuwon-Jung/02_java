package main.java.com.ohgiraffers.section03.abstraction;

public class CarRacer {
/*    CarRacer 클래스가 Car 클래스의 인스턴스를 멥버변수로 소유하고 있다. 즉 CarRacer는 Car를 가지고 있다.
        ==> CarRacer는 자동차의 기능을 직접 수행하는것이 아니라 자신이 소유한 Car객체에게 기능을 위임하고 있다.
    has-a 관계(포함관계)*/
    private Car car = new Car();

    public void starUp(){
        car.startUp();
    }

    public void stepAccelator() {
        car.go();
    }

    public void stepBrakes() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }
}
