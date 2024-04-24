package com.ohgiraffers.section04.dto;

import java.util.Date;

public class UserDTO {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate; // 날짜를 관리하기 위한 데이터 타입

    public UserDTO () {
        // 기본 생성자
    }

    public UserDTO(String id, String pwd, String name, java.util.Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName () {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    @Override // 어노테이션 - @로 시작하는 특별한 기능을 가지는 것 어노테이션 마다 미리 정의를 해놓는다. | 오버라이드의 경우 덮어 쓰는 기능이다.
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
