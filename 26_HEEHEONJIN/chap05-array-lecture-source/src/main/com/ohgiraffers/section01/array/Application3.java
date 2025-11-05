package main.com.ohgiraffers.section01.array;

public class Application3 {
    public static void main(String[] args) {
        int num;

        int[] iarr = new int[10];
        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarr[" + i + "] : " + iarr[i]);

        }

        String[] sarr = new String[10];
        for (int i = 0; i < sarr.length; i++) {
            System.out.println("sarr[" + i + "] : " + sarr[i]);

        }

        char[] carr = new char[10];
        for (int i = 0; i < carr.length; i++) {
            System.out.println("carr[" + i + "] : " + carr[i]);

        }

        boolean[] barr = new boolean[10];
        for (int i = 0; i < barr.length; i++) {
            System.out.println("barr[" + i + "] : " + barr[i]);
        }

        int[] iarr2 = new int[]{11, 22, 33, 44, 55};
        for (int i = 0; i < iarr2.length; i++) {
            System.out.println("iarr2[" + i + "] : " + iarr2[i]);

        }

        String[] sarr2 = new String[]{"짜장면", "짬뽕", "탕수육"};
        for (int i = 0; i < sarr2.length; i++) {
            System.out.println("iarr2[" + i + "] : " + sarr2[i]);
        }
    }
}