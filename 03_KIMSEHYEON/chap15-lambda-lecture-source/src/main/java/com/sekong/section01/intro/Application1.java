package com.sekong.section01.intro;

public class Application1 {
    public static void main(String[] args) {
        /*인터페이스에 정의된 추상메소드를 활용
        * 1. 인터페이스를 상속받은 클래스를 정의하여 기능을 완성*/

        Calculator calculator = new CalculatorImpl();
        int sum = calculator.sumTwoNumbers(10, 20);
        System.out.println("10+20 = "+sum);

        // 2. 익명 클래스를 활용하여 메소드 재정의 후 사용하는 방법
        Calculator calculator2 = new Calculator(){
            @Override
            public int sumTwoNumbers(int a, int b) {
                return a + b;
            }
        };
        System.out.println("10+20 = "+calculator2.sumTwoNumbers(10, 20));

        /*람다식을 활용하는 방법*/
        Calculator calculator3 = (a,b)-> a + b;
        System.out.println("10+20 = " +calculator3.sumTwoNumbers(10, 20));
    }
}
