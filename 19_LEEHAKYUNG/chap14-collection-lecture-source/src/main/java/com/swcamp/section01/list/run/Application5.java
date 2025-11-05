package com.swcamp.section01.list.run;

import java.util.Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application5 {

    public static void main(String[] args) {

        /*
        Queue
         */
//        Queue<String> que = new Queue<>():
//        Queue<String> que = new LinkedList<>();
        // LinkedList는 queue중에서도 deque에 해당되어
        // offerFirst(), offerList() 같은 메소드도 제공한다.

        // PriorityQueue를 활용하면 선입선출 + 정렬의 개념을 가져갈 수 있다.
        PriorityQueue<String> que = new PriorityQueue<>();// String기준대로 문자열 오름차순
//        PriorityQueue<String> que = new PriorityQueue<>(Collection.reverseOrder()); // 내림차순

        // queue에 데이터를 넣을 때는 offer메소드 사용
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        /*
        peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환
        poll() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환하고 제거
         */

        System.out.println("peek() : " + que.peek());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println(que);
        // queue에서 반환할 값이 없을 경우 null 반환
        System.out.println("poll() : " + que.poll());
        System.out.println(que);
    }
}
