package com.ohgiraffers.exception.array;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test4();

    }
    public void test4() {
        try{
            ArrayProcessor ap = new ArrayProcessor();
            int[] test = new int[3];
            Scanner sc = new Scanner(System.in);
            System.out.println("배열을 입력해보거라 : ");
            test[0] = sc.nextInt();
            test[1] = sc.nextInt();
            test[2] = sc.nextInt();

            System.out.println("인덱스를 입력해보거라 : ");
            int index = sc.nextInt();

            ap.getElementAtIndex(test, index);
        } catch (ArrayLengthException e) {
            throw new RuntimeException(e);
        }
    }
}
