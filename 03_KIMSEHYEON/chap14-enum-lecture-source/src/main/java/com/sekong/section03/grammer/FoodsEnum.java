package com.sekong.section03.grammer;

public enum FoodsEnum {
    MEAL_AN_BUTTER_KIMCHI_STEW(0,"앙버터"),
    MEAL_MINT_SEAWEED_SOUP(1,"민트"),
    MEAL_BUNGEOPPANG_SUSHI(2,"붕어빵"),
    DRINK_RADISH_KIMCHI_LATTE(3,"열무김치"),
    DRINK_WOOLUCK_SMOOTHIE(4,"스무디"),
    DRINK_RAW_CUTTLEFISH_SHAKE(5,"쉐이크");

    private final int value;
    private final String name;

    FoodsEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
