package main.java.com.ohgiraffers.section02.abstractclass;
/*추상클래스로 선언 : abstract */
public abstract class Product {

    /*추상 클래스는 필드를 가질 수 있다.*/
    private int nonStaticField;
    private static int staticField;

    /*
    * 우상클래스는 생성자를 가질 수 있다.
    * 당, 직접적으로 인스턴스를 생성할 수는 없다.
    * */

    public Product() {
    }

    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMehtod!");
    }

    public static void staticMethod() {
        System.out.println("Product 클래스의 staticMethod!");

    }
    
    /*추상 메소드(미완성 메소드) 작성*/
    public abstract void abstMethod(); // 만약 class 의 abstract 를 지우면 오류

    public abstract void abstractMethod();

    public abstract void printSmartPhone();
}
