package chap13_collection.section01;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        ArrayList alist = new ArrayList();
        List list = new ArrayList();
        Collection collection = new ArrayList();

//      list = new LinkedList(alist);
//      LinkedList linkedList = new LinkedList(new ArrayList());

        alist.add("hello");
        System.out.println(alist);

        alist.add("apple");
        alist.add(1, "orange");
        System.out.println("alist = " + alist);

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(3);
        integerList.add(4);
        integerList.add(2);
        System.out.println("integerList = " + integerList);
        Collections.sort(integerList);
        System.out.println("integerList = " + integerList);
    }
}
