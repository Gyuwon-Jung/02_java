package main.java.com.ohgiraffers.section04.user2;

public class Person {
    private final SaveProvider saveProvider; // null값 들어옴

    public Person(SaveProvider saveProvider) {
        this.saveProvider = saveProvider;
    }

    public void doSomething() {
        String data = "String data";
        saveProvider.save(data);
    }
}
