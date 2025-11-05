package com.ohgiraffers.section02.level03;

public class Application1 {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        arrayTest1(arr);
        arrayTest2(arr);
        arrayTest3(arr);
        arrayTest4(arr);
        arrayTest5(arr);
        arrayTest6(arr);
        arrayTest7(arr);
    }

    /**
     * 1 2 3 4
     * 5 6 7 8
     * 9 10 11 12
     * 13 14 15 16
     *
     * @param arr
     */
    public static void arrayTest1(int[][] arr) {
        int num = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = num++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 1 5 9 13
     * 2 6 10 14
     * 3 7 11 15
     * 4 8 12 16
     *
     * @param arr
     */
    public static void arrayTest2(int[][] arr) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (i + 1) + j * 4;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 4 3 2 1
     * 8 7 6 5
     * 12 11 10 9
     * 16 15 14 13
     *
     * @param arr
     */
    public static void arrayTest3(int[][] arr) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (i + 1) * 4 - j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 16 12 8 4
     * 15 11 7 3
     * 14 10 6 2
     * 13 9 5 1
     *
     * @param arr
     */
    public static void arrayTest4(int[][] arr) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (4 - j) * 4 - i;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 13 14 15 16
     * 9 10 11 12
     * 5 6 7 8
     * 1 2 3 4
     *
     * @param arr
     */
    public static void arrayTest5(int[][] arr) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (3 - i) * 4 + (j + 1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 13 9 5 1
     * 14 10 6 2
     * 15 11 7 3
     * 16 12 8 4
     *
     * @param arr
     */
    public static void arrayTest6(int[][] arr) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (3 - j) * 4 + (i + 1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 4 8 0 16
     * 0 7 11 0
     * 2 0 10 14
     * 1 5 0 13
     *
     *  3의 배수인 경우 continue;
     * @param arr
     */
    public static void arrayTest7(int[][] arr) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int n = (j + 1) * 4 - i;
                if (n % 3 == 0) {
                    arr[i][j] = 0;
                    continue;
                }
                arr[i][j] = n;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /***
     * 이차원 배열을 전달받아서 출력하는 메소드
     * @param arr
     */
    public static void print(int[][] arr) {
        for (int[] row : arr) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
