package com.swcamp.section01.intro;
/*
람다식 사용을 위해 인터페이스 내에 하나의 추상메서드만 작성할 수 잇으므로
관리 인터페이스가 너무 많아질 수 있다. 이 때 내부 인터페이스를 활용할 수 있다.
 */
public interface OuterInterface {

    @FunctionalInterface
    public interface Sum {
        int sumTwoNumbers(int a, int b);
    }
    @FunctionalInterface
    public interface Minus {
        int minusTwoNumbers(int a, int b);
    }
    @FunctionalInterface
    public interface Multiply {
        int multiplyTwoNumbers(int a, int b);
    }
    @FunctionalInterface
    public interface Divide {
        int divideTwoNumbers(int a, int b);
    }

}
