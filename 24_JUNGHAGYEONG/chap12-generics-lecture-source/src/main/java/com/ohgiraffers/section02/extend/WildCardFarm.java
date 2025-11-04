package com.ohgiraffers.section02.extend;

public class WildCardFarm {

    /* 매개변수로 전달받은 토끼농장을 구현할 때 사용한 타입변수에 대해서 제한을 할 수 있음 */

    /*
    * 와일드카드(WildCard)
    * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때, 그 객체의
    * 타입변수를 제항 할 수 있음
    *
    * <?> : 제한 없음
    * <? extends Type> : 와일드카드의 상한 제한(Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용가능)
    * <? super Type> : 와일드카드 하한 제한 (Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용가능)
    * */

    // 토끼농장에 있는 토끼가 일반토끼, 바니, 술취한 바니 상관 XX
    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimal().cry();

    }

    // 토끼농장의 토끼는 바니이거나 그 후손타입(술취한바니)로 만들어진 토끼 농장만 매개변수로 사용 가능
    public void extendType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();

    }

    // 토끼농장의 토끼는 바니이거나 그 부모타입(Rabbit)으로 만들어진 토끼농장만 매개변수로 사용 가능
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();

    }

}
