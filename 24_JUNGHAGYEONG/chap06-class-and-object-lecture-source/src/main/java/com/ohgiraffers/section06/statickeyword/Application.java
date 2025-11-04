package com.ohgiraffers.section06.statickeyword;

public class Application {

    public static void main(String[] args) {

        StaticFieldTest f1 = new StaticFieldTest();
        f1.incrementNonStaticCount();
        f1.incrementStaticCount();

        System.out.println(f1.getNonStaticCount());
        System.out.println(f1.getStaticCount());

        StaticFieldTest f2 = new StaticFieldTest();
        f2.incrementNonStaticCount();
        f2.incrementStaticCount();

        System.out.println(f2.getNonStaticCount());
        System.out.println(f2.getStaticCount());

    }
}
