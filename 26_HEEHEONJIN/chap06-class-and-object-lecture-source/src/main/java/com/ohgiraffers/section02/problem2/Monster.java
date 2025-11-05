package main.java.com.ohgiraffers.section02.problem2;

public class Monster {
    String name;
    String kinds;
    int hp;

    public void setInfo(String info) {
        this.kinds = info;
//        this.name = info;
    }

    public String getInfo() {
//        return this.name;
        return this.kinds;
    }
}
