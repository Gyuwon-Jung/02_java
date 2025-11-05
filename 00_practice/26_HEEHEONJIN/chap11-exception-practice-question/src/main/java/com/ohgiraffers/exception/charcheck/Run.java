package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test1();
    }

    public void test1(){
        CharacterProcess cp = new CharacterProcess();
        System.out.print("글 써보거라 : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        try {
            cp.countAlpha(str);
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }
    }
}
