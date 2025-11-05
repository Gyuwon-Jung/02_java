package com.ohgiraffers.section01.list.run;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        List<String> LinkedList = new LinkedList<String>();
        /*
         * 내부적인 구현코드는 다르지만 LinkedList도 list계열이기 때문에
         * 동일한 메소드를 호출해서 작업할 수 있다.
         * */
        LinkedList.add("apple");
        LinkedList.add("orange");
        LinkedList.add("banana");
        LinkedList.add("pear");
        LinkedList.add("banana");

        System.out.println("LinkedList size : " + LinkedList.size());

        // 저장 순서 유지, 중복 허용을 확인
        for (int i = 0; i < LinkedList.size(); i++) {
            System.out.println(i + " : " + LinkedList.get(i));

        }
        // toString()을 오버라이딩
        System.out.println("linkedList = " + LinkedList);

        for (String str : LinkedList) {
            System.out.println(str);
        }

        Iterator<String> iterator = LinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        LinkedList.set(0, "pineapple");
        System.out.println("LinkedList : " + LinkedList);

        /*
         * LinkedList는 ArrayList와 내부적인 구현 방식이 다르므로
         * 수정, 삭제가 빈번한 상황에서는 LinkedList를 사용하는 것이 효율적이다.
         * ~first, ~last 접미어를 붙여 순차적 기능을 강조한 함수들이 LinkedList에는 추가적으로 정의 되어 있다.
         * */

        LinkedList.clear();

        LinkedList.add("Hello");

        ((LinkedList) LinkedList).addFirst("World");
        ((LinkedList) LinkedList).addLast("java");
        System.out.println("LinkedList : " + LinkedList);

        ((LinkedList<String>) LinkedList).removeFirst();
        ((LinkedList<String>) LinkedList).removeLast();
        System.out.println("LinkedList : " + LinkedList);

        System.out.println("is Empty : " + LinkedList.isEmpty()); // 비어있는지 여부를 판별
        LinkedList.clear();
        System.out.println("is Empty : " + LinkedList.isEmpty());
    }
}
