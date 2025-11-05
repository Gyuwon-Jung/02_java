package com.sekong.section01.polymorphism;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("Tiger eat meat");
    }

    @Override
    public void run() {
        System.out.println("Tiger not run");
    }

    @Override
    public void cry() {
        System.out.println("Tiger cry");
    }

    public void bite(){
        System.out.println("Tiger bite");
    }
}
