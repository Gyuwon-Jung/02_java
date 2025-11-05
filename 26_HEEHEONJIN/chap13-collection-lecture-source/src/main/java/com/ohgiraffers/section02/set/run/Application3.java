package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /*TreeSet*/
        TreeSet<String> tset = new TreeSet<String>();
        tset.add("java");
        tset.add("mariaDB");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");
        tset.add("java");
        /*
        * 자동 오름차순 정렬을 하며 이진 트리의 형태로 요소를 저장하고 있다.
        * String 클래스에 implements Comparable을 통해 compareTo 메소드가
        * 오버라이딩 되어 있는 기준으로 정렬된다.
        * */
        System.out.println("test : " + tset);
        Set<Integer> lotto = new TreeSet<Integer>();

        while(lotto.size() < 6) {
            lotto.add((int)(Math.random() * 45) + 1);
        }
        System.out.println("lotto : " + lotto);
    }
}
