package com.sekong.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test1();
    }
    public void test1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        CharacterProcess process = new CharacterProcess();

        try {
            System.out.println(process.countAlpha(str));
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }
    }
}
