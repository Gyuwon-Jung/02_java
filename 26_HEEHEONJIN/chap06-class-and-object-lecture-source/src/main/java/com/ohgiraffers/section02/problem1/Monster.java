package main.java.com.ohgiraffers.section02.problem1;

public class Monster {
    String id;
    String name;
    int hp;

    public void setHp(int hp) {//매개변수도 지역변수의 일종
        if(hp > 0) {
            // * this : 인스턴스 변수가 생서ㅓㅇ 되었을 때 자신의 주소를 저장하는 레퍼런스 주소     
            this.hp = hp; // 얘가 어디서 생성이 되었는지의 차이로 구분할 수 있다.
                          // 생성한 당시의 필드값을 주소로. 참조 변수라서 그렇다. this. 하는것돠 monster. 하는 것과 같은 거다. 
                          // 생성 당시의 객체값
            System.out.println("양수 값이 입력되어 몬스터의 체력을 입력값으로 변경");
        } else {
            this.hp = 0;
            System.out.println("음수 값이 입력되어 몬스터의 체력을 0으로 변경");
        }
    }
}
