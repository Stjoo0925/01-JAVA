package com.ohgiraffers.secion01.list.run;

import java.util.Stack;

public class Application04 {

    public static void main(String[] args) {

        /*
         * stack
         * stack은 리스트 계열 클래스의 vector 클래스를 상속받아 구현하였다.
         * 스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
         * 후입선출(LIFO - last Input First Out)방식의 자료 구조라 부른다.
         */

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);

        System.out.println(integerStack);

        System.out.println(integerStack.search(1));
        // peek() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소를 반환
        System.out.println("peek() : " + integerStack.peek());
        // pop() : 해당 스택의 가장 마지막에 있는 요소를 반환 후 제거
        System.out.println("pop() : " + integerStack.pop()); //인덱스를 갖지 않음
        System.out.println("pop() : " + integerStack.pop()); //인덱스를 갖지 않음
        System.out.println("pop() : " + integerStack.pop()); //인덱스를 갖지 않음
        System.out.println("pop() : " + integerStack.pop()); //인덱스를 갖지 않음
        System.out.println("pop() : " + integerStack.pop()); //인덱스를 갖지 않음
    }
}
