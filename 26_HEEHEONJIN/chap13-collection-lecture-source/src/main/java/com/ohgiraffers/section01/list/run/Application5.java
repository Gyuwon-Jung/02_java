package com.ohgiraffers.section01.list.run;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /* Queue */
//      Queue<String> queue = new Queue<>();
        Queue<String> que = new LinkedList<>();
        // LinkedList<String> que = new LinkedList<>(); // LinkedList는 queue중에서도 deque에 해당되어
                                                     // offerFirst(), offerList() 같은 메소드도 제공한다.

        // PriortiyQueue를 활용하면 선입선출 + 정렬의 개념을 가져갈 수 있다.
    //    PriorityQueue<String> pq = new PriorityQueue<>(); // String 기준대로 문자열 오름차순
        PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder()); // String 기준대로 문자열 내림차순
        /*큐에 데이터를 넣을 때는 offer 메소드 사용한다.*/
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        /*
        * peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소를 반환)
        * pull() 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소를 반환) */
        System.out.println("peek() : " + que.peek());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll()); // 큐에서 반환할 값이 없을 경우 null반환
        System.out.println("queue() : " + que);
    }
}
