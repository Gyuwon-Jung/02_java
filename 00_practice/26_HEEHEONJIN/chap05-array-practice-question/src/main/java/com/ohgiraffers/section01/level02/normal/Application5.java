package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;
import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
         * 문자열을 입력받아 문자 하나하나를 배열에 넣고 검색할 문자가
         * 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지
         * 인덱스를 출력하세요.
         *
         * ex.
         *	문자열 : application
         *	문자 : i
         *	application에 i가 존재하는 위치(인덱스) : 4 8
         *	i 개수 : 2
         * */

        System.out.println("문자열을 하나 입력하세요 :");
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();

        System.out.println("검색할 문자를 하나 입력하세요 : ");
        String checkStr = sc.nextLine();

        int count = 0;
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
            if (arr[i] == checkStr.charAt(0)) {
                count++;
            }
        }

        int[] index = new int[count];
        int idx = 0;
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == checkStr.charAt(0)) {
                index[idx] += i;
                idx++;
            }
        }
        System.out.println("입력하신 문자열 " + str);
        System.out.println("문자 : " + checkStr);
        System.out.print(str + "에 " + checkStr + "가 존재하는 위치(인덱스) : ");
        index(index);
        System.out.println();
        System.out.println(checkStr + "개수 : " + count);
    }
    public static void index(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
