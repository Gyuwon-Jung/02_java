package main.java.com.ohgiraffers.section02.problem3;

public class Application {
    public static void main(String[] args) {

        // 직접 겁근이 아닌 메소드를 통한 간접 겁근을 작성해 두더라도
        // 접근 제한자를 통해 강제화하지 않으면 직접 접근이 가능한 문제가 있다.
        // 그래서 접근제한자를 설정한다.
        // ==> 필드는 private, 메소느는 public ==> 캡슐화적용(누구는 직접접근, 누구는 간접접근 하면 안 된다. )
        Monster monster = new Monster();
        monster.setInfo("두치");
        monster.setHp(100);
        System.out.println(monster.getInfo());
        System.out.println(monster.getHp());

        Monster monster2 = new Monster();
        monster2.setInfo("뿌꾸");
        monster2.setHp(-200);
        System.out.println(monster2.getInfo());
        System.out.println(monster2.getHp());


//        Monster monster3 = new Monster();
//
//        monster3.name = "드라큘라";
//        monster3.hp = -200;
//
//        System.out.println("monster3.name = " + monster3.name);
//        System.out.println("monster3.hp = " + monster3.hp);

    }
}
