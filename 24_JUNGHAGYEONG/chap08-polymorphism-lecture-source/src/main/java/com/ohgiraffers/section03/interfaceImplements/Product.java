package com.ohgiraffers.section03.interfaceImplements;

public class Product extends Object implements InterProduct {

    /*
     * 클래스에서 인터페이스를 상속받을 때에는 implements 키워드를 사용함
     * 또한 인터페이스는 여러 개를 상속받을 수 있으며, extends로 다른 클래스를 상속받는 경우에는
     * 그것과 별개로 인터페이스도 추가 상속이 가능해짐
     * 단, extends키워드를 앞에 작성하고, implements를 뒤에 작성함
     * (순서 바뀌면 에러 발생)
     * */

    @Override
    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 호출함..");
    }

    @Override
    public void nonStaticMethod1() {
        System.out.println("Product 클래스릐 abstMethod 호출함..");
    }

    /* static 메소드는 오버라이딩 할 수 없음 */
//    @Override
//    public static void staticMethod(){}

    /* default 메소드는 인터페이스에서만 작성 가능 함 */
//    public default void test() {}

    @Override
    public void defaultMethod() {
        System.out.println("Product클래스의 defaultMethod 호출됨..");
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
