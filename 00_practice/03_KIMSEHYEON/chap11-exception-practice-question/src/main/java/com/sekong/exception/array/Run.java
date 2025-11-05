package com.sekong.exception.array;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Run run = new Run();
        run.test4();
    }
    public void test4(){
        Scanner sc = new Scanner(System.in);
        int[] str = new int[3];
        str[0] = 1;
        str[1] = 2;
        str[2] = 3;
        System.out.print("인덱스를 입력하세요 (0~2) : ");
        int i = sc.nextInt();
        ArrayProcessor ap = new ArrayProcessor();
        try{
            System.out.println("인덱스 "+i+"의 값은 "+ap.getElementAtIndex(str,i)+"입니다.");
        }catch(ArrayLengthException e){
            System.out.println("0"+e.getMessage());
        }
    }
}
