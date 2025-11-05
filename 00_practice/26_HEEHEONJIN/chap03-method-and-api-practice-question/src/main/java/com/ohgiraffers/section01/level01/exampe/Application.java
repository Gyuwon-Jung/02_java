package com.ohgiraffers.section01.level01.exampe;

import java.util.Scanner;

import static ExampleTest.evenOdd;
import static com.ohgiraffers.section01.level01.exampe.ExampleTest.evenOdd;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ExampleTest test = new ExampleTest();
        int input = sc.nextInt();
        evenOdd(input);
    }
}
