package com.sekong.sextion04.uses2;

public class Application {
    public static void main(String[] args) {
        DatabaseSaveProvider saveProvider = new DatabaseSaveProvider();
        FileSaveProvider fileSaveProvider = new FileSaveProvider();

        Person person = new Person(saveProvider);
        person.doSomething();
        Person person2 = new Person(fileSaveProvider);
        person2.doSomething();
    }
}
