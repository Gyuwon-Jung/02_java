package main.java.com.ohgiraffers.section02.problem1;

import javax.management.monitor.MonitorSettingException;

public class Application {
    public static void main(String[] args) {
        // 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해
        Monster  monster = new Monster();

        monster.name = "두치";
        monster.hp = 200;

        System.out.println("monster.id = " + monster.id);
        System.out.println("monster.name = " + monster.name);

        Monster  monster2 = new Monster();

        monster2.name = "뿌꾸";
        monster2.hp = 200;

        System.out.println("monster2.id = " + monster2.id);
        System.out.println("monster2.name = " + monster2.name);

        //hp는 음수값일 수 없다. -> 필드를 올바르지 않....
        //직접 접근을 메소드를

        Monster  monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(-200);

        System.out.println("monster3.name = " + monster3.name);
        System.out.println("monster3.hp = " + monster3.hp);

    }
}
