package main.java.com.ohgiraffers.section02.problem2;

public class Application {
    public static void main(String[] args) {
        // 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해

        // 필드에 직접 접근하면 필드의 변경이 발생하였을 때 사용한 코들르 모두 수정해야 한다.
        // 이는 유지 보수적인 측면에서 악영향을 끼친다.


        Monster monster = new Monster();

        monster.name = "두치";   // 직접접근 방식
        monster.setInfo("두치"); // 간접접근 방식
        monster.hp = 200;

        System.out.println("monster.name = " + monster.name);
        System.out.println("monster.hp = " + monster.hp);


        Monster monster2 = new Monster();

        monster2.name = "뿌꾸";
        monster2.hp = 200;

        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);


        //hp는 음수값일 수 없다. -> 필드를 올바르지 않....
        //직접 접근을 메소드를

        Monster monster3 = new Monster();

        monster3.name = "드라큘라";
        monster3.hp = -200;

        System.out.println("monster3.name = " + monster3.name);
        System.out.println("monster3.hp = " + monster3.hp);

    }
}
