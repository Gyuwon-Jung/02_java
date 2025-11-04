package com.ohgiraffers.section04.uses2;

public class Person {

    private final SaveProvider saveProvider;

    // person이라는 객체는 saveprovider로만 생성 가능
    public Person(SaveProvider saveProvider) {
        this.saveProvider = saveProvider;
    }

    public void doSomething() {
        String data = "string data";

        saveProvider.save(data); // 동적 바인딩이 일어남
    }

}
