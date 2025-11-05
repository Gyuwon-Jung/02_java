package com.swcamp.section03.map.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        // HashMap

        HashMap hmap = new HashMap();

        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println("hmap = " + hmap);
        // 기존에 있는 key값에 다른 값을 넣으면 값이 업데이트가 된다.
        hmap.put(12, "yellow apple");
        System.out.println("hmap = " + hmap);
        // key값만 다르면 값은 동일해도 상관없이 새 객체 생성됨.
        hmap.put(11, "yellow apple");
        System.out.println("hmap = " + hmap);

        // map에 담겨져 있는 값을 가져오기 : get(키값)
        System.out.println("====> " + hmap.get(11));
        System.out.println("====> " + hmap.get(0)); // 키값이 존재하지 않으면 null을 리턴

        // key를 통해서 삭제
        hmap.remove(11);
        System.out.println("hmap = " + hmap);

        // 문자열 타입을 키, 값으로 하는 hashMap
        HashMap<String, String> hmap2 = new HashMap<>();
        hmap2.put("one", "java");
        hmap2.put("two", "css");
        hmap2.put("three", "html");
        System.out.println("hmap2 = " + hmap2);

        /*
        Map 타입 순회 방법
         */
        // 1. keySet() : key로 순회
        System.out.println(hmap2.keySet());
        Iterator<String> keyIter = hmap2.keySet().iterator();
        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println("hmap2 " + key + " = " + value);
        }

        for (String key : hmap2.keySet()) {
            String value = hmap2.get(key);
            System.out.println("hmap2 " + key + " = " + value);
        }

        // 2. values() : value로 순회
        Collection<String> values = hmap2.values(); // value 타입이 다양할 수 있으니 collection으로 생성
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()) {
            String value = valueIter.next();
            System.out.println("value = " + value);
        }

        for (String value : hmap2.values()) {
            System.out.println("value = " + value);
        }

        // 3. entrySet() : key, value값을 원하는 대로 가져올 수 있음
        Set<Map.Entry<String, String>> entries = hmap2.entrySet();
        Iterator<Map.Entry<String, String>> entryIter = entries.iterator();
        while (entryIter.hasNext()) {
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        for (Map.Entry<String, String> entry : hmap2.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
