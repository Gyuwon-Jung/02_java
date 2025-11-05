package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // 1. Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        // 정수값 받기
        // nextInt() : 입력받은 값을 int형으로 반환한다.
        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("age : " + age);

        //실수값 받기
        //nextDouble() : 입력받은 값을 double형으로 반환ㄴ
        System.out.println("키를 입력하세요 : ");
        double height = sc.nextDouble();
        System.out.println("height : " + height);

        /* 2-4. 논리형 값 입력받기 */
        /* nextBoolean() : 입력받은 값을 boolean형으로 반환한다.
         * true or false 외에 다른 값을 입력하게 되면 InputMismatchException 발생함
         * */
        System.out.print("true or false로 입력하세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리 값은 " + isTrue + "입니다.");

        /* 2-1. 문자열 입력 받기 */
        /* nextLine() : 입력받은 값을 문자열로 반환해준다 */
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

        // nextLine(): 개행문자까지 다 가져온다. 공백포함
        System.out.println("주소를 입력하세요 : ");
        String address = sc.nextLine();
        System.out.println("address : " + address);

        // 문자
        // 문자만 입력받는 메소드는 scanner 에서 제공하지 않음으로
        // String에서 제공하는 cahrAt(index)메소드를 통해 문자를 분리해서 사용할 수 있다.
        System.out.println("아무 문자나 입력");
        char ch = sc.next().charAt(0);
        System.out.println("ch = " + ch);

//        System.out.println("h");
//        System.out.println("i");
//
//        System.out.print("h");
//        System.out.print("i");
//        System.out.println("world");
    }
}
