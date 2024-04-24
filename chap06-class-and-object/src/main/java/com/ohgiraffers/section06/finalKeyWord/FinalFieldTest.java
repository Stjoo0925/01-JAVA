package com.ohgiraffers.section06.finalKeyWord;

public class FinalFieldTest {

    /*
    *   final
    *   final은 종단의 의미를 가지는 키워드이다.
    *   final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간은 다르지만 결국 변경 불가의 의미를 가진다.
    *   1.지역변수 : 초기화 이후 값 변경 불가
    *   2.매개변수 : 호출시 전달한 인자 변경 불가
    *   3.전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
    *   4.클래스(static) 변수 : 프로그램 시작 이후 값 변경 불가능
    *   5.non-static 메소드 : 메소드 재작성(overriding) 불가
    *   6.static메소드 : 메소드 재작성(overriding) 불가
    *   7.클래스 : 상속 불가능
    */

    // private final int NON_STATIC_NUM; - 상수필드는 초기값을 할당하지 않으면 에러 발생

    private final int NON_STATIC_NU = 10;

    /*
    *   생성자를 이용한 초기화는 불가능하다.
    *   생성자는 인스턴스가 생성되는 시점에 호출이 되기 때문에 그 전에는 초기화가 일어나지 못한다.
    *   하지만 static은 프로그램이 start될 때 할당되기 때문에 초기화가 되지 않은 상태로 선언된 것과 동일하여
    *   기본값으로 초기화 된 후 값을 변경하지 못하기 때문에 에러가 발생한다.
    */

    private static final double STATIC_DOUBLE;

    //public FinalFieldTest(double staticDouble) {
    //    STATIC_DOUBLE = staticDouble;
    //}

    /*
    *   초기화 블럭
    *
    */
    static {
        STATIC_DOUBLE = 0.5;
    }

    // 클래스의 일반 상수는 생성자를 통하여 초기값을 전달하는 것이 가능하다.
    private final String STATIC_STRING;

    //  상수 필드는 꼭 초기화를 해야하는 규칙을 가지고 있다.
    //  그러나 아래와 같이 생성을 하게되면 초기값이 전달이 안되는 것이고
    //  결국 상수 필드를 선언한 의미는 없어지게 되는 것이다.
    //  public FinalFieldTest(){
    //  }

    public FinalFieldTest(String STATIC_STRING) {
        this.STATIC_STRING = STATIC_STRING;
    }
}
