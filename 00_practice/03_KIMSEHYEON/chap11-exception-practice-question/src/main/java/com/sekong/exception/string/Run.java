package com.sekong.exception.string;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test5();
    }
    public void test5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        StringValidator sv = new StringValidator();
        try{
            sv.isValidLength(str);
            System.out.println("문자열의 길이가 유효합니다.");
        }catch(StringLengthException e){
            System.out.println(e.getMessage());
        }
    }
}
