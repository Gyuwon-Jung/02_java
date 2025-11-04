package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    /*
    * Car 클래스의 모든 멤버(필드, 메소드)를 상속 받을 수 있음
    * 단, 생성자는 상속 못 받음
    * */

    public FireCar() {

        /*
        * 모든 생성자 맨 첫줄에 super()를 컴파일러가 자동으로 추가함
        * 부모의 기본생성자를 호출하는 구문으로 명시적 or 묵시적으로 사용가능함.
        * */
        super();
        System.out.println("FireCar클래스 기본 생성자 호출");
    }

    /*
    * soundHorn메소드 재작성 : overriding
    * @override 어노테이션 : 오버라이딩 성립요건을 체크하여 성립되지 않는 경우 컴파일 에러 발생
    * */

    @Override
    public void soundHorn() {

        /*
        * private 접근제어자가 붙은 필드는 상속은 받지만 자식이 접근할 수 없음
        * protected로 변경하면 자식이 접근할 수 있음
        * */

        if(isRunning()) {
            System.out.println("빠아아아아아아앙!! 빠아아아아아아앙!!");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다. 비키세요. 안비키면 밀어버립니다.");
        }
    }

    /* 상속은 자식 클래스가 부모 클래스를 확장하는 것이므로 FireCar만의 추가기능도 작성 가능 */
    public void sprayWater() {
        System.out.println("물을 뿌립니다. 💦💦💦💦💦");
    }
}
