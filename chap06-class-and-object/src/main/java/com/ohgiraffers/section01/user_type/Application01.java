package com.ohgiraffers.section01.user_type;

public class Application01 {

    public static void main(String[] args) {

        String id = "정한1";
        String pwd = "pass01";
        String name = "황정한";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[] {"축구", "헬스", "런닝"};

        String id2 = "재희1";
        String pwd2 = "pass02";
        String name2 = "송재희";
        int age2 = 20;
        char gender2 = '여';
        String[] hobby2 = new String[] {"걷기", "릴스시청", "인사동"};

        // ---------------------------------------------------------

        Members hwang = new Members();  //  heap영역에 members가 만들어짐, 하나의 인스턴스
        Members song = new Members();

        hwang.id = "정한1";   // hwang은 인스턴스이고 정보를 저장한다.
        song.id = "재희1";

        hwang.pwd = "pass01";
        song.pwd = "pass02";

        hwang.name = "황정한";
        song.name = "송재희";

        hwang.age = 20;
        song.age = 22;

        hwang.gender = '남';
        song.gender = '여';

        hwang.hobby = new String[] {"축구", "헬스", "런닝"};
        song.hobby = new String[] {"걷기", "릴스시청", "인사동"};


        System.out.println(hwang);
        System.out.println(song);
    }



}
