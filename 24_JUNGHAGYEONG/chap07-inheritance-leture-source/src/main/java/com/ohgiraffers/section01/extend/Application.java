package com.ohgiraffers.section01.extend;

public class Application {

    public static void main(String[] args) {

        /* 부모 클래스 */
        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        /*
        * 상속은 IS-A관계로 구분되는 경우에만 사용해야한다.
        * 삼각형은 도형이다(O)
        * 도형은 삼각형이다(X)
        *
        * 소방차, 레이싱카 모두 자동차이다(O)
        * 모든 자동차는 소방차 혹은 스쿨버스 혹은 레이싱카이다(X)
        * */

        System.out.println("================ FireCar ================");
        FireCar firecar = new FireCar();
        firecar.soundHorn();
        firecar.run();
        firecar.soundHorn();
        firecar.stop();
        firecar.soundHorn();
        firecar.sprayWater();

        System.out.println("================ RacingCar ================");
        RacingCar racing = new RacingCar();
        racing.soundHorn();
        racing.run();
        racing.soundHorn();
        racing.stop();
        racing.soundHorn();

    }
}
