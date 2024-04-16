package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator; // 외부에 있는 class 를 호출하겠다는 의미
// import는 사용할 경로를 미리 선언해주는 역할이다 (메모리에 올리는 과정이다)
// 동일 패키지의 class는 import를 하지 않는다
import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;
// static 메소드는 위 구문을 추가함으로서 축약할수 있다

public class Application01 {

    public static void main(String[] args) {
        int first = 200;
        int second = 300;

        int max = maxNumberOf(first, second);
        System.out.println(max);

        Calculator cal = new Calculator();
        int min = cal.minNumberOf(first, second);
        System.out.println(min);
    }
}
