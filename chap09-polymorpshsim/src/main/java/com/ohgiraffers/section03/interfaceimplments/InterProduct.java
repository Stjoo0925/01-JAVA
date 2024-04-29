package com.ohgiraffers.section03.interfaceimplments;

import javax.swing.plaf.PanelUI;
import java.io.Serializable;

public interface InterProduct extends Serializable {

    /*
     *   인터페이스는 상수 필드만 작성 가능하다.
     *   public static final 제어자 조합을 상수 필드라고 부른다.
     *   반드시 선언과 동시에 초기화 해줘야 한다.
     */

    public static final int MAX_NUM = 100;

    // 인터페이스는 상수 필드만 작성이 가능학 때문에 일반 변수처럼 선언해도 상수 필드로 괸다.
    // 묵시적으로 public static final int num 이 된다는 이야기이다.
    // int num; (초기값을 할당해야함)

    // 인터페이스는 생성자를 가질 수 없다.
    // public interProduct(){}

    // 인터페이스는 추상메서드의 묶음으로 추상메서드만 선언이 가능하다.
    // public void nonStaticMethod(){}

    public abstract void nonStaticMethod();

    /*
     *   인터페이스 안에 작성한 메소드는 묵시적으로 public abstract의 의미를 가진다.
     *   따라서 인터페이스의 메소드를 오버라이딩 하는 경우 반드시 접근제한자를 public으로 해야
     *   오버라이딩이 가능하다.
     */

    void absMethod();

    // static 메소드는 작성이 가능하다. (jdk 1.8추가)
    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 staticMethod 호출됨...");
    }

    // default 키워드를 사용하면 non-static 메소드도 작성이 가능하다. (jdk 1.8추가)
    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defaultMethod 호출됨...");
    }

}
