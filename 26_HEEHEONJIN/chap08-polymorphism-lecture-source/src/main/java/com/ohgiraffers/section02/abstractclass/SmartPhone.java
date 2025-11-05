package main.java.com.ohgiraffers.section02.abstractclass;
/*추상 클래스를 상속하는 경우 추상 메소드를 받드시 오버라이딩 해야한다.
* (오버라이딩 강제화)
* */
public class SmartPhone extends Product{
    public SmartPhone() {
    }

    @Override
    public void nonStaticMethod() {
        super.nonStaticMethod();
    }

    @Override
    public void abstMethod() {

    }

    @Override
    public void abstractMethod(){
        System.out.println("Product 클래스의 abstMethod 오버라이딩한 메소드");
    }

    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드");
    }
}
