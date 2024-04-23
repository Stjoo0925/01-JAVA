package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Members {

    String id;

    String pwd;

    String name;

    int age;

    char gender;

    String[] hobby;
        // 클래스의 변수들 == 필드라고 부른다.

    @Override
    public String toString() {
        return "Members{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }

// 모든 클래스는 오브젝트라는 조상을 가진다. 오브젝트에서 자료를 상속받아 클래스를 만든다.
}
