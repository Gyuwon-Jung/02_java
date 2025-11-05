package com.sekong.section01.polymorphism;

public class Application {
    public static void main(String[] args) {
         /*
         * 다형성: 하나의 인스턴스가 여러 가지 타입을 가질 수 있다는 것을 의미한다.*/
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("=== Tiger create ===");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        System.out.println("=== Rabbit create ===");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        /*
        * Rabbit과 TIger는 Animal클래스를 상속받았다.
        *
        * Rabbit은 Rabbit 타입이기도 하면서 Animal타입이기도 하다.
        * Tiger는 Tiger 타입이기도 하면서 Animal 타입이기도 하다.
        * */

        // 부모 타입으로 자식 인스턴스 주소값 저장
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        // Animal은 Animal 타입이지 Tiger나 Rabbit이 아니다
        // Rabbit rabbit1 = new Animal();
        System.out.println("=========동적 바인딩=========");
        animal1.cry();
      //  animal1.jump();
        animal2.cry();

        /*
        * 객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환하여 Rabbit과 Tiger로
        * 변경해야 메소드 호출이 가능하다.
        * class type casting : 클래스 형변환
        * ==> 타입 형변환시 실제 인스턴스의 타입이 일치하지 않는 경우 ClassCastException이 발생할 수 있다.
        * */
        System.out.println("클래스타입 형변환 확인 ==========");
        ((Rabbit) animal1).jump();
        ((Tiger) animal2).bite();
        // ((Tiger) animal1).bite();  ==> java.lang.ClassCastException

        /*
        * instanceof 연산자 이용
        * 레퍼런스변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자
        * */
        System.out.println("instanceof 확인 ==========");
        System.out.println("animal1이 tiger 타입인지 확인 : "+ (animal1 instanceof Tiger));
        System.out.println("animal1이 rabbit 타입인지 확인 : "+ (animal1 instanceof Rabbit));
        System.out.println("animal1이 animal 타입인지 확인 : "+ (animal1 instanceof Animal));

        if(animal1 instanceof Rabbit){
            ((Rabbit) animal1).jump();
        }
        if(animal1 instanceof Tiger){
            ((Tiger)animal1).bite();
        }

        /*
         * 클래스 형변환은 Up-casting과 down-casting으로 구분할 수 있다.
         * up-casting 상위 타입으로 형변환
         * down-casting 하위 타입으로 형변환
         * 또한 작성여부에 따라 명시적과 목시적 두가지로 구분된다*/

        Animal animal3 = (Animal) new Rabbit(); // Up-casting 명시적
        Animal animal4 = new Rabbit(); // up-casting 목시적

        Rabbit rabbit1 = (Rabbit) animal3; // animal에서 rabbit으로 down-casting
                                          // 명시적 형변환
//        Rabbit rabbit2 = animal3;      // down-casting은 목시적 형변환이 불가능하다.


    }
}
