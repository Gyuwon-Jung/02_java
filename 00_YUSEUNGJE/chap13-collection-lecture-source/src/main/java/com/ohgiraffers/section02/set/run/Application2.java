package com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application2 {

    public static void main(String[] args) {

        /*
        * LinkedHashSet은 저장 당시의순서를 유지하는 특성을 가지고 있다.
        * (중복제거 + 순서유지)
        * */
        Set<String> lset = new LinkedHashSet<>();
        lset.add("ramen");
        lset.add("pork");
        lset.add("kimchi");
        lset.add("friedEgg");
        lset.add("kimchi");
        lset.add("friedEgg");
        lset.add("chicken");
        lset.add("chicken");

        System.out.println("lset = " + lset);

        // Link를 통해서 저장 순서를 유지하며, 중복 저장은 불가능한 특성
        // HashSet이 가지는 기능을 모두 가지고 있으므로 동일한 메소드 활용 가능
        Iterator<String> iterator = lset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
