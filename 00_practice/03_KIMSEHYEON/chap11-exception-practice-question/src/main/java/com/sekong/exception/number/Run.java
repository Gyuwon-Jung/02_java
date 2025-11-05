package com.sekong.exception.number;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test();
    }
    public void test() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int b = sc.nextInt();
        NumberProcess num = new NumberProcess();
        try{
            num.checkDouble(a,b);
        }catch(NumberRangeException e){
            System.out.println(e.getMessage());
        }
    }
}
