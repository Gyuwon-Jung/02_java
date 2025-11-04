package com.ohgiraffers.section06.singleton;

public class Eagersingleton {

    private static Eagersingleton eager = new Eagersingleton();

    private Eagersingleton() {}

    public static Eagersingleton getInstance() {
        return eager;
    }
}
