package com.sekong.section3.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        // HashMap

        HashMap hashMap = new HashMap();

        hashMap.put("one",new Date());
        hashMap.put(12,"red apple");
        hashMap.put(33,123);

        System.out.println("hashMap : " + hashMap);
        hashMap.put(12,"yellow apple");
        System.out.println("hashMap : " + hashMap); // 기존에 있는 key값에 다른 값을 넣으면 값이 업데이트 된다,\.
        hashMap.put(11,"yellow apple");
        System.out.println("hashMap : " + hashMap); // 키값만 다르면 값은 동일해도 상관없다.

        // map에 담겨져 있는 값을 가져오기 : get(키값)
        System.out.println("===> "+ hashMap.get(12)); // 키값이 존재하면 해당 값 리턴
        System.out.println("===> "+ hashMap.get(13)); // 키값이 존재하지 않으면 Null 리턴

        // key를 통해 삭제
        hashMap.remove(11);
        System.out.println("hashMap : " + hashMap);
        /*
        * List> ArrayList
        * 값 추가 : add()
        * 값 삭제 : remove()
        * 특정값 가져오기 : get(index)
        * 값 수정 : set()
        * ===========================
        * Map
        * 값 추가 : put()
        * 값 삭제 : remove()
        * 특정값 가져오기 : get(key)
        * 값 수정: put(바꾸고 싶은 key,value)
        * */

        // 문자열 타입을 key,value로 하는 hashMap
        HashMap<String,String> hmap = new HashMap<>();
        // <String, Object>, <Integer, Object> ...
//        hmap.put(1,22) 불가
        hmap.put("one","yellow apple");
        hmap.put("two","red apple");
        hmap.put("three","yellow apple");
        System.out.println("hmap : " + hmap);

        /*Map 타입 순회 방법
        * 1. keySet()*/
        Iterator<String> keyIter = hmap.keySet().iterator();
        while(keyIter.hasNext()){
            String key = keyIter.next();
            String value = hmap.get(key);
            System.out.println("key : " + key + ", value : " + value);
        }
        System.out.println("==========");
        for(String key:hmap.keySet()){
            String value = hmap.get(key);
            System.out.println("key : " + key + ", value : " + value);
        }
        System.out.println("===================");
        // 2. values()
        Collection<String> values = hmap.values();
        Iterator<String> valueIter = values.iterator();
        while(valueIter.hasNext()){
            String value = valueIter.next();
            System.out.println("value : " + value);
        }
        System.out.println("======================");
        for(String value : hmap.values()){
            System.out.println("value : " + value);
        }
        System.out.println("=========================");
        // 3. entrySet()
        Set<Map.Entry<String, String>> entries = hmap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key : " + entry.getKey() + ", value: " + entry.getValue());
        }
        System.out.println("=========================");
        for(Map.Entry<String,String> entry:hmap.entrySet()){
            System.out.println("key : " + entry.getKey() + ", value: " + entry.getValue());
        }


    }
}
