package com.ohgiraffers.section01.level02.normal;

public class Application7 {

    public static void main(String[] args) {

        /*
         * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
         * 1 ~ 10사이의 난수를 발생시켜 배열에 초기화 후
         * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요
         *
         * ex.
         * 5 3 2 7 4 8 6 10 9 10
         * 최대값 : 10
         * 최소값 : 2
         * */

        int[] iarr = new int[10];
        for (int i = 0; i < iarr.length; i++) {
            iarr[i] = (int) (Math.random() * 10) + 1;
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
        printMaxMin(iarr);
    }

    public static void printMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                int a = arr[i];
                max = a;
            } else if (min > arr[i]) {
                int b = arr[i];
                min = b;
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
