package com.ohgiraffers.secion01.list.run;

import java.util.*;

public class Application01 {

    public static void main(String[] args) {

        ArrayList alist = new ArrayList();

        List list = new ArrayList();


        alist.add("apple");
        alist.add(123);
        alist.add(3.14);
        alist.add(new Date());
        System.out.println(alist);

        System.out.println(alist.size());

        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
        }
        System.out.println("변경 테스트");
        String target = "사용자 입력값";
        //특정 인덱스의 값을 추가한다.
        alist.add(0, target);
        System.out.println(alist.get(0));

        System.out.println();
        System.out.println("삭제 구분");
        // 특정 인덱스의 값을 제거한다.
        alist.remove(0);
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
        }

        //값을 수정한다
        System.out.println();
        alist.set(0, "이것을 수정함");
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");
        System.out.println(stringList);

        Collections.sort(stringList);
        System.out.println(stringList);

        System.out.println();
        stringList = new LinkedList<>(stringList);

        /*
         * Iterator 이란?
         * collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
         * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용된다.
         * 반복자 라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내오는 방식으로 사용하기 위함이다.
         * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
         * 인덱스를 사용하지 않고 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
         * hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false를 반환
         * next : 다음요소를 반환
         */

        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();

        //while (dIter.hasNext()) {
        //    System.out.println(dIter.next());
        //}
        //
        //System.out.println(dIter);

        List<String> descList = new ArrayList<>();
        while (dIter.hasNext()) {
            descList.add(dIter.next());
        }

        for (int i = 0; i < descList.size(); i++) {
            System.out.println(descList.get(i));
        }
    }
}
