package com.ohgiraffers.section03;

public class A_break {
    public void testSimpleBreakStatement() {
        int sum = 0;
        int i = 1;

        while(true) {
            sum += i++;
            if (i > 100) {
                break;
            }
        }
        System.out.println(sum);
    }

//    public void testSimpleBreakStatement2() {
//        for (int dan = 0; dan <= 9; dan++) {
//            System.out.println("=====" + dan + "=====");
//            for (int su = 0; su < 9; su++) {
//                if(su > 5) break;
//                System.out.println(dan + );
//            }
//                int sum = 0;
//            int i = 1;
//            while (true) {
//            }
//        }
//    }

    public void testJumBreak(){
        label:
        for(;;) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if(i == 3) {
                    break label;
                }
            }
        }
    }
}
