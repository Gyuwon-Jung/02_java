package com.swcamp.section02.set.run;

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

        // set에 저장된 자료는 넣는 순서를 보당할 수 없다.
        System.out.println(hset);

        // 중복값을 허용하지 않는다.
        hset.add("java");
        hset.add("mariaDB");
        System.out.println(hset);

        /*
        set의 데이터를 순회하는 방법
        1. 배열로 변경
         */
        Object[] arr = hset.toArray(); // 다형성을 이용해 모든 객체를 받을 수 있도록 arr선언
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }

        /*
        2. Iterable의 iterator 메소드(반복자)
         */
        Iterator<String> iter = hset.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
//            iter.remove();  // remove()로 원래 hset의 내용을 삭제할 수도 있음.
        }

        System.out.println("hset = " + hset);

        /*
        3. 향상된 for문
         */
        for (String str : hset) {
            System.out.println(str);
            // 반복 순회 도중 remove()를 사용하면
            // java.util.ConcurrentModificationException이 발생함
            // hset.remove(str);
        }

        // size(), contains(), isEmpty()
    }
}
