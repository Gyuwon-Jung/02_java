package com.sekong.section03.interfaceimplement;

public class Product extends Object implements InterProduct{

    /*클래스에서 인터페이스를 상속받을 때에는 Implements 키워드를 사용한다.
    * 또한 인터페이스는 여러 개를 상속받을 수 있으며 extends로 다른 클래스를 상속받는 경우에는
    * 그것과 별개로 인터페이스도 추가 상속이 가능
    * 단, extends 키워드를 앞에 작성하고 implements를 뒤에 작성한다.
    * (순서 바뀌면 에러발생)
    * */
    @Override
    public void nonStaticMethod(){

    }

    @Override
    public void nonstaticMethod2() {

    }
    // static 메소드는 오버라이딩 할 수 없다.
//    @Override
//    public static void staticMethod() {}

    // default 메소드는 인터페이스에서만 작성 가능하다.
//    public default void test(){}
    @Override
    public void defaultMethod(){
        System.out.println("Product 클래스의 defaultMethod 호출됨");
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
