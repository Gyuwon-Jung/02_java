package com.sekong.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 컬렉션 프레임워크(Collection Framework)
        * 자바에서 컬랙션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
        * 표준화된 방법을 제공하는 클래스들의 집합을 위미한다.
        * 즉, 데이터는 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해 놓은 클래스를 말한다.
        * */

        /*
        * ArrayList
        * 가장 많이 사용되는 컬랙션 클래스이다.
        * JDK 1.2부터 제공
        *
        * 배열의 크기를 변경하는 것이 불가능하고 요소의 추가/삭제/정렬 등이 복잡하다.
        * 이러한 기능을 메소드로 구현해서 제공하고 있으며 단, 속도가 빨라지는 것은 아니다.
        * */

        /*
        * 다형성을 이용해서 상위 레퍼런스로 ArrayList객체를 참조할 수 있다.
        * List 인터페이스 하위의 다양한 구현체들로 타입변경이 가능하므로 보다 유연한 코드를 작성할 수 있다.
        * */
        ArrayList alist = new ArrayList();
        List list = new ArrayList();
        Collection clist = new ArrayList();

//        list = new LinkedList(alist);
//        LinkedList list1 = new LinkedList<>(new ArrayList<>());
        alist.add("Hello");
        alist.add(10); //autoboxing(값 => 객체)
        System.out.println(alist);

        /*arrayList의 크기는 size()메소드로 확인 가능
        * 단, size()메소드는 배열의 크기가 아닌 요소의 개수를 반환한다.*/
        System.out.println("alist.size()=" + alist.size());
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(i+": "+alist.get(i));
        }

        alist.add("apple");
        alist.add(0,"orrange");
        System.out.println(alist);

        alist.remove(2);
        System.out.println(alist);

        alist.set(1,Boolean.valueOf(true));
        System.out.println(alist);

        /*String타입의 Element만 저장하는 ArrayList 생성*/
        List<String> stringList = new LinkedList<>();
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("mango");
//        stringList.add(123);
        System.out.println("stringList = "+stringList);

        Collections.sort(stringList); // String에는문자열 오름차순(Ascending)에 대한 정의가 되어있다.
        System.out.println("stringList = "+stringList);

        List<Integer> integerList = new LinkedList<>();
        integerList.add(3);
        integerList.add(1);
        integerList.add(4);
        integerList.add(6);
        integerList.add(2);
        integerList.add(5);
        integerList.add(7);
        System.out.println("integerList = "+integerList);
        Collections.sort(integerList);
        System.out.println("integerList = "+integerList);

        /*
         * Iterator란?
         * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
         * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으ㅔ 로 제공하기 위해 사용한다.
         * 반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
         *
         * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
         * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면된다.
         *
         * hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false를 반환
         * next() : 다음 요소를 반환
         * */
        stringList = new LinkedList<>(stringList);
        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();
//        System.out.println(dIter.next());
//        while (dIter.hasNext()) {
//            System.out.println(dIter.next());
//        }
//        while (dIter.hasNext()) {
//            System.out.println(dIter.next());
//        }
        List<String> descList = new ArrayList<>();
        while(dIter.hasNext()) {
            descList.add(dIter.next());
        }
        System.out.println("descList = "+descList);
    }
}
