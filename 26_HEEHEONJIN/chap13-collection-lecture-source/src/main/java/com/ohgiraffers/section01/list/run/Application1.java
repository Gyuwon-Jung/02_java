package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 컬렉션 프레임워크(Collection framework)
        * 자바에서 컬렉션프레임워크는 여러개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
        * 표준화된 방법을 제공하는 클래스들의 집합을 의미한다.
        * 즉, 데이터는 효율적으로 저장하는 자료구조와 데이터를 처이하는 알고리즘을 이리 구현해 놓은 클래스를 말한다. \
        */

        /*
        * ArrayList
        * 가장 많이 사용되는 컬렉션 클래스입다.
        * JDK 1.2부터 제공된다.
        *
        * : 배열 은 크기를 변경하는 것이 불가능하고 요소의 추가/삭제/정렬 등이 복잡하다.
        * 이러한 기능을 메소드로 구현해서 제공하고 있으며 단, 속도가 빨라지는 것은 아니다.
        * */

        /*
        * 다형성을 이용해서 상위 레퍼런스로 ArrayList 객체를 참조할 수 있다.
        * List 인터페이스 하위의 다양한 구현체들로 타입변경이 가능하므로
        * 보다 유연한 코드를 작성할 수 있다.
        *
        * */

        ArrayList alist = new ArrayList(); // 넣는 순서대로, 뒤에서 넣는데 효율적이다. ArrayList는 - > Linkedlist 가능

        List list = new ArrayList();

        Collection clist = new ArrayList();
        // 위에는 다형성 적용, 나중에 ArrayList 가 LinkedList 로 탈바꿈이 가능해진다.

        list = new LinkedList(alist);
        // alist = new LikedList<>(new ArrayList<>()); 이건 안 됨
        //LinkedList list1 = new LinkedList<>(new Arraylist<>());
        
        alist.add("Hello");
        alist.add(10); // autobosing(값 ==> 객체)
        // 다양한 타입이 들어오는것은 좋지 않다. 들어갈때는 편한데 나올때 계속 검증해야 된다.
        System.out.println(alist);

        /* ArrayKist 의 크기는 size() 메소드로 확인가능
        *  단, size() 메소드는 배열의 크기가 아닌 요소의 갯수를 반환한다.
        * */


//        StringBuilder, String 불변, 가변
        System.out.println("alist.size() : " + alist.size());

        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i));
//            System.out.print(" ");
        }

        alist.add("apple");
        alist.add(2, "orange"); // 원하는 위치에 넣어줄 수 있다. (인덱스)
        System.out.println("alist = " + alist);
        // 순번을 정해주지 않으면 무조건 뒤에부터 붙는다. 순번을 넣어주면 된다.

        alist.remove(2); // 인뎃스 2번째꺼 삭제
        System.out.println("alist = " + alist);

        alist.set(1, Boolean.valueOf("true")); // 타입과 값 수정하기.
        System.out.println( "alist = " + alist);

        /*String 타입의 Element만 저장하는 ArrayList 생성*/
        List<String> strlist = new ArrayList<>();
        strlist.add("apple");
//        strlist.add(123); 이거는 String이 아니라 오류가 난다. // 즉, 문자열만 들어올 수 있다.
        strlist.add("orange");
        strlist.add("banana");
        strlist.add("mango");
        strlist.add("grape");

        System.out.println("StringList : " + strlist);
        Collections.sort(strlist); // 오름차순 정렬
        System.out.println("StringList : " + strlist);

        List<Integer> integerlist = new ArrayList<>();
        integerlist.add(1);
        integerlist.add(2);
        integerlist.add(3);
        integerlist.add(4);
        integerlist.add(5);
        System.out.println("IntegerList : " + integerlist);

        Collections.sort(integerlist);
        System.out.println("IntegerList : " + integerlist);

        /*
         * Iterator란?
         * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
         * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
         * 반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
         *
         * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
         * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면된다.
         *
         * hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false를 반환
         * next() : 다음 요소를 반환
         * */
        strlist = new LinkedList<>(strlist);

        Iterator<String> stringIterator = ((LinkedList<String>) strlist).descendingIterator();

//        stringIterator.next();
//        while (stringIterator.hasNext()) {
//            System.out.println(stringIterator.next());
//        }

//        위에서 한번 꺼냈으면 다시 꺼낼 수 없다.
//        while (stringIterator.hasNext()) {
//            System.out.println(stringIterator.next());
//        }
        List<String> descList = new ArrayList<>();
        while (stringIterator.hasNext()) {
            descList.add(stringIterator.next());
        }
        System.out.println("descList : " + descList);

    }
}
