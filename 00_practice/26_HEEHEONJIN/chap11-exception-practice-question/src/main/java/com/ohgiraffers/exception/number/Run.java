package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test();
    }
    public void test(){
        NumberProcess np = new NumberProcess();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        try {
            np.checkDouble(a, b);
        } catch (NumberRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
