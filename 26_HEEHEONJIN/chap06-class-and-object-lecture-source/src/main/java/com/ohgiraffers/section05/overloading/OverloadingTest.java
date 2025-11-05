package main.java.com.ohgiraffers.section05.overloading;

public class OverloadingTest {
    /*
    * 오버로딩 : 같은 클래스내에서 같은 이름의 메소드를 매개변수만 다르게 하여 정의하는 것
    * 사용이유 : 먀갸 뵨수의 조ㅗㅇ류별로 메소드 내용은 다르게 작성해야하는 경우
    * 동일 기능의 메소드를 매개변수에 따라 다른 이름을 붙이면 관리가 매우 어려워지기 때문
    * ex) System.out.println()
    *
    * 매소드의 시그니쳐?
    * public void method(int num){} 이라면 메소드의 메소드명과 팔라미터 선언부 부분을 메소ㅗ드의
    * 시그니쳐(signature)라고 한다. (==> method(int num) 요거)
    *
    * 오버로딘의 조건?
    * 매개변수의 타입, 갯수, 순서를 다르게 작성하여 하느의 클래스내에서 동일한 이름의 메소들르 여러개 작성할 수 있다.
    * 메소드의 에드부에 있어 시그니쳐를 제외한 부분이 다르게 작성되는 것은 인정되지 않는다.
    * */
    public void test(){}

    // private void test(){} // 메소드 오버로딩에서는 시그니쳐를 제외한 나머지는 무관
    // public String test(){return "test";} // 메소드 오버로딩에서는 시그니펴를 제외한 나머지는 무관
    // private String test(){return "";} //메소드 오버로딩에서는 시그니쳐를 제외한 나머지는 무관

    // 매개변수의 갯수가 달라짐
    public void test(int num){}
    
    public void test(int num1, int num2){}
    
    // public void test(int num2, int num1){} // 매개변수명이 다른것은 무관
    //매개변수의 타임이 달라짐

    public void test(int num1, String str){}
    // 매개변수의 순서가 달라짐(타입만 고려)
    public void test(String str, int num1){}
}
