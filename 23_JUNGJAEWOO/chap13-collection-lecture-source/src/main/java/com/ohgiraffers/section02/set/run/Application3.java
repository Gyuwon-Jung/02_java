package com.ohgiraffers.section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {

        /* TreeSet */
        TreeSet<String> tset = new TreeSet<>();
        tset.add("java");
        tset.add("mariaDB");
        tset.add("serlvet");
        tset.add("tomcat");
        tset.add("spring");

        /*
        * 자동 오름차순 정렬을 하며 이진 트리의 형태로 요소를 저장하고 있다.
        * String 클래스에 implements Comparable을 통해 compareTo메소드가
        * 오버라이딩 되어 있는 기준으로 정렬된다.
        * */
        System.out.println("tset = " + tset);
        Set<Integer> lotto = new TreeSet<>();
        while(lotto.size() < 6) {
            lotto.add((int)(Math.random() * 45) + 1);
        }
        System.out.println("lotto = " + lotto);

    }
}
