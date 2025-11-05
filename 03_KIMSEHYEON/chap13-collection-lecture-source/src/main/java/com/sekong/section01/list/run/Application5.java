package com.sekong.section01.list.run;

import java.util.*;

public class Application5 {
    public static void main(String[] args) {
        /*Queue*/
//        Queue<String> queue = new LinkedList<>();
//        LinkedList<String> queue = new LinkedList<>(); // LinkedList는 queue중에서도 deque에 해당되어
                                                        // offerFirst(), offerList() 같은 메소드를 제공한다.

        // PriorityQueue를 활용하면 선입선출 + 정렬의 개념을 가져갈 수 있다.
//        PriorityQueue<String> queue = new PriorityQueue<>();
        PriorityQueue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        /*큐에 데이터를 넣을 때는 offer 메소드를 사용한다.*/
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        queue.offer("fifth");

        System.out.println("queue: "+queue);
        System.out.println("queue.poll(): "+queue.poll());
        System.out.println("queue : "+queue);

        /*
        * peek(): 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환
        * poll(): 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환하고 제거
        * */
        System.out.println("queue.peek(): "+queue.peek());
        System.out.println("queue.poll(): "+queue.poll());
        System.out.println("queue : "+queue);

        System.out.println("queue.poll(): "+queue.poll());
        System.out.println("queue.poll(): "+queue.poll());
        System.out.println("queue.poll(): "+queue.poll());
        System.out.println("queue.poll(): "+queue.poll()); //큐에서 반환할 값이 없을 경우 null 반환
    }
}
