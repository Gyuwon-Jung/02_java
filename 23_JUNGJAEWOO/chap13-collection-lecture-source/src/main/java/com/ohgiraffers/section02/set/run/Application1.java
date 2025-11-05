package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {
    public static void main(String[] args) {

        HashSet<String> hset = new HashSet<>();
        hset.add(new String("java"));
        hset.add(new String("mariaDB"));
        hset.add(new String("serlvet"));
        hset.add(new String("spring"));
        hset.add(new String("html"));

        // set 에 저장된 자료는 넣는 순서를 보장할 수는 없다.
        System.out.println("hset = " + hset);

        // 중복값을 허용하지 않는다.
        hset.add(new String("java"));
        hset.add(new String("mariaDB"));
        System.out.println("hset = " + hset);

        /* Set의 데이터를 순회하는 방법 */
        /* 1. 배열로 변경 */
        Object[] arr = hset.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }
        /* 2. Iterable의 iterator메소드(반복자) */
        Iterator<String> iter = hset.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
//            iter.remove(); // iterator 의 remove를 활용하면 순회하면서 제거할 수 있다
        }

        System.out.println("hset = " + hset);

        /* 향상된 for문 */
        for(String str : hset) {
            System.out.println(str);
            // 반복 순회 도중 remove 메소드를 사용하면 java.util.ConcurrentModificationException이 발생함
//            hset.remove(str);
        }

        System.out.println("hset = " + hset);
    }
}
