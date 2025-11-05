package com.ohgiraffers.section02.enumtype;

public class Application {
    public static void main(String[] args) {

        /*
        * 열거형을 이용하여 상수 열거 패턴의 단점을 해결
        * */

        /* 1. 싱글톤 방식으로 구현되기 때문에 인스턴스의 생성이나 확정이 되지 않는다.
        *  2. 컴파일 타입의 타입 안정성을 높여준다
        * */
        boolean isTrue = enumTest(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW, FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);
//        enumTest(0,3);

        System.out.println("isTrue = " + isTrue);

        /* 3. 상수 이름을 문자열로 출력할 수 있다. */
        System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(FoodsEnum.MEAL_MINT_SEAWEED_SOUP);
        System.out.println(FoodsEnum.MEAL_BUNGEOPPANG_SUSHI);

        // 이름 충돌 방지를 위해 접두사를 쓰지않아도 Enum타입별로 네임스페이스를 가진다.
        FoodsEnum.MEAL mealAnButterKimchiStew = FoodsEnum.MEAL.MEAL_AN_BUTTER_KIMCHI_STEW;
        System.out.println("mealAnButterKimchiStew = " + mealAnButterKimchiStew);

        /* 4. 필요하다면 필드나 메소드를 추가할 수 있다.
        * 단, 근본적으로 불변객체이기 때문에 모든 필드는 final로 선언되어야한다.
        * 클래스 이기 때문에 toString 메소드를 오버라이딩해서 변경할 수 있다.
        * */

        /* 5. 열거 타입내에 선언된 상수들을 순회할 수 있다. */
        for(FoodsEnum food : FoodsEnum.values()){
            System.out.println("food = " + food);
        }


    }



    private static boolean enumTest(FoodsEnum foodsEnum, FoodsEnum foodsEnum1) {
        if(foodsEnum == foodsEnum1) return true;
        else return false;
    }
}
