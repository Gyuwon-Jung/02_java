package com.ohgiraffers.section03.map.run;

import java.util.HashMap;
import java.util.Date;
import java.util.*;


public class Application1 {
    public static void main(String[] args) {
        /* HashMap */

        /* List>ArrayList
        * 값을 추가: add()
        * 값을 삭제: remove()
        * 값을 특정값 가져오기: get(인덱스)
        * 값을 수정: set()
        *
        * =======================
        * map
        * 값을 추가: put()
        * 특정값을 가져오기 get(키값)
        * 값을 삭제: 값을 수정: 동일한키값에 다른값
        *
        *
        * */

        HashMap hmap = new HashMap();

        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println("hmap : " + hmap);
        hmap.put(12, "yellow apple");
        System.out.println("hmap : " + hmap); // 기존에 있는 key값에 다른 값을 넣으면 > 값이 업데이트 된다.
        hmap.put(11, "yellow apple");
        System.out.println("hmap : " + hmap); // 키값만 다르면 값은 동일해도 상관없다.

        // map에 담겨있는 값을 가벼오기 : get(키값)
        System.out.println("hmap ====> : " + hmap.get(11)); //키값이 존재하면 해당 값을 리턴, 없으면 null을 리턴

        // key를 통해서 삭제
        hmap.remove(11);
        System.out.println("hmap : " + hmap);

        /*문자열 타입을 키, 값으로 하는 hashMap*/
        HashMap<String, String> hmap2 = new HashMap<>();
        // <String, Object>, <Integer, Object>....
        // hmap2.put(11, 22);
        hmap2.put("one", "java");
        hmap2.put("two", "css");
        hmap2.put("three", "html");
        System.out.println("hmap2 : " + hmap2);

        /*Map 타입 순회 방법*/
        /* 1. keySet()* key 순회/
        // hmap2.keySet();
        // System.out.println("hmap2 : " + hmap2)
         */

        Iterator<String> keyIter = hmap2.keySet().iterator();
        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println("hmap2 " + key + " : " + value);
        }

        for (String key : hmap2.keySet()) {
            String value = hmap2.get(key);
            System.out.println("hmap2 " + key + " : " + value);
        }

        /* 2.values()*/
        Collection<String> values = hmap2.values();
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()) {
            String value = valueIter.next();
            System.out.println("value : " + value);
        }

        for(String value : hmap2.values()) {
            System.out.println("value : " + value);
        }

//        /*3. entrySet()*/
//        Set<Entry<String, String>> entries = hmap2.entrySet();
//        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> entry = iterator.next();
//            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
//        }
//        for(Map.Entry<String, String> entry : hmap2.entrySet()) {
//            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
//        }
    }
}
