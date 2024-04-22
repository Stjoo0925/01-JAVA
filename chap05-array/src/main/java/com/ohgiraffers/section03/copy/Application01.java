package com.ohgiraffers.section03.copy;

public class Application01 {

    public static void main(String[] args) {
        // 얕은 복사 | 주소값을 공유한다.

        String[] goldSideName = {"김재석", "송재희", "황정한"};
        String[] names = goldSideName;  // goldSideName 의 주소를 names에 입력하겠다는 의미
        System.out.println(goldSideName);
        System.out.println(names);      // 둘의 주소값은 같다

        goldSideName[0] = "김효주";

        System.out.println(goldSideName[0]);
        System.out.println(names[0]);

        //깊은 복사에 대한 개념 | 갚은 복사는 주소가 아니라 값을 복사하는 개념이다 (new로 값을 새롭게 할당했기때문에)
        goldSideName = new String[]{"김재석", "송재희", "황정한"};
        names = new String[3];
        System.out.println();
        // for each | 화면에 출력 용으로 많이 사용된다
        int i = 0;
        for (String name : goldSideName) {
            names[i] = name;
            i++;
        }
        goldSideName[0] = "이상우";
        System.out.println(goldSideName[0]);
        System.out.println(names[0]);
    }
}
