package com.sekong.section2.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {
    public static void main(String[] args) {

        HashSet<String> hset = new HashSet<>();
        hset.add("java");
        hset.add(new String("mariadb"));
        hset.add(new String("serlvet"));
        hset.add(new String("spring"));
        hset.add(new String("html"));

        System.out.println("hset = " + hset);

        // 중복값을 허용하지 않는다.
        hset.add("java");
        hset.add(new String("mariadb"));
        System.out.println("hset = " + hset);

        /*Set의 데이터를 순회하는 방법
        * 1. 배열로 변경*/
        Object[] arr = hset.toArray();
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

        // 2. Iterable의 iterator메소드 (반복자)
        Iterator<String> iterator = hset.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
//            iterator.remove(); // iterator의 remove를 활용하면 순회하면서 제거할 수 있다.
        }
        System.out.println("hset = " + hset);
        // 3. 향상된 For 문
        for(String str : hset){
            System.out.println(str);
//            hset.remove(str);
//            반복 순회 도중 remove메소드를 사용하면 java.util.ConcurrentModificationException 발생
        }
        // size(), contain(), isEmpty()

    }
}
