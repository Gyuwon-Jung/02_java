package com.sekong.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /*stack이란?
        * 후입선출(LIFO)의 자료구조로 push(), pop(), peek()등의 메소드를 활용하여 자료를 처리할 수 있다.
        * */
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("stack : "+ stack);
        System.out.println("stack.peek() : "+ stack.peek()); //값이 어디에 있는지 확인
        System.out.println("stack.pop()  : "+ stack.pop());
        System.out.println("stack : "+ stack); // toString()메소드 오버라이딩
        System.out.println("search() : "+stack.search(2)); // 인덱스가 아닌 순번 1 2 3 4 이므로 4부터 1, 3은 2, 2는 3번째 인것
        System.out.println("stack.pop() : "+stack.pop());
        System.out.println("stack.pop() : "+stack.pop());
        System.out.println("stack.pop() : "+stack.pop());
        System.out.println("stack.pop() : "+stack.pop());
//        System.out.println("stack.pop() : "+stack.pop());
        // 더이상 없는 값일떄 pop을 하면 EmptyStackException 발생

    }
}
