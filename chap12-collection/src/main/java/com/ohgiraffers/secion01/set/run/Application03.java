package com.ohgiraffers.secion01.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application03 {

    public static void main(String[] args) {

        /*
         * treeSet 클래스
         * TreeSet 클래스는 데이터가 정렬된 상태로 저장되는 이진 검색트리의 형태로 요소를 저장한다.
         * 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기분 동작 시간이 매우 바르다.
         * jdk 1.2부터 제공되고 있으며
         * set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다른 점이다.
         */

        TreeSet<String> tset = new TreeSet<>();
        Set<String> tset2 = new TreeSet<>();
        tset.add("java");
        tset.add("oracle");
        tset.add("jdbc");
        tset.add("html");

        System.out.println(tset);

        System.out.println("tset2!!");

        tset2.add("java");
        tset2.add("oracle");
        tset2.add("jdbc");
        tset2.add("html");

        System.out.println(tset2);
    }
}
