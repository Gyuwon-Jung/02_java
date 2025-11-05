package com.sekong.sextion04.uses1;

public class Firecar extends Car implements Soundable {
    @Override
    public void horn() {
        System.out.println("Firecar siren!!!!");
    }

    @Override
    public void go() {
        System.out.println("Firecar go");
    }
    @Override
    public void stop() {
        System.out.println("Firecar stop");
    }
}
