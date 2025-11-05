package com.swcamp.section02.enumtype;

public enum FoodsEnum {
    // 내부적으로 작성 순서대로 0부터 값이 자동으로 부여된다.
    MEAL_AN_BUTTER_KIMCHI_STEW(0),
    MEAL_MINT_SEAWEED_SOUP(1),
    MEAL_BUNGEOPPANG_SUSHI(2),
    DRINK_RADISH_KIMCHI_LATTE(3),
    DRINK_WOOLUCK_SMOOTHIE(4),
    DRINK_RAW_CUTTLEFISH_SHAKE(5);

    private final int value;
    private final int var = 10;

    // value같이 내부 상수 없이 기본생성자로 생성할 시 자동으로 0~5 값이 부여됨.
//    FoodsEnum() {
//        System.out.println("FoodsNum : 기본 생성자 호출됨");
//    }

    FoodsEnum(int value) {
        this.value = value;
    }

    public void printVar() {
        System.out.println("var = " + var);
    }

    public enum MEAL {MEAL_AN_BUTTER_KIMCHI_STEW,
                      MEAL_MINT_SEAWEED_SOUP,
                      MEAL_BUNGEOPPANG_SUSHI,}
    public enum DRINK {DRINK_RADISH_KIMCHI_LATTE,
                       DRINK_WOOLUCK_SMOOTHIE,
                       DRINK_RAW_CUTTLEFISH_SHAKE}

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
