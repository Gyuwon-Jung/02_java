package com.swcamp.section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {

    public static void main(String[] args) {

        /*
        TreeSet : 기본적으로 오름차순 정렬. 이진 트리의 형태로 요소를 저장하고 있다.
        String 클래스에 implements Comparable을 통해 compareTo메소드가
        오버라이딩 되어 있는 기준으로 정렬된다.
         */
        TreeSet<String> tset = new TreeSet<>();
        tset.add("java");
        tset.add("mariaDB");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");
        tset.add("java");

        System.out.println("tset = " + tset);

        Set<Integer> lotto = new TreeSet<>();

        while(lotto.size() < 6) {
            lotto.add((int)(Math.random() * 45) + 1);
        }
        System.out.println("lotto = " + lotto);
    }
}
