package com.ohgiraffers.section01.method;

public class Application3 {
    // 전역
    static int global = 10; // 클래스(static) 변수



    public static void main(String[] args) {
    int local = 20;
        System.out.println("global = " + global);
        System.out.println("local = " + local);
        test(local);

        Application3 app = new Application3();
        app.testMethod(13);
        app.testMethod(local);
        app.testMethod((int) 3 * 8);
    }

    public static void test(int testValue){
         System.out.println(testValue); //(local)은 범위 밖이라서 안 됨.
    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
