package com.ohgiraffers.section02.userException;

import com.ohgiraffers.section02.userException.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userException.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userException.exception.PriceNegativeException;

public class Application01 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        /*
        try {
            et.checkEnoughMoney(100, 200);

            try {
                et.checkEnoughMoney(100, -200);
            } catch (MoneyNegativeException e) {
                System.out.println("정신 차려~~~");
            }

        } catch (Exception e) {
            System.out.println("상품 가격을 정수로 다시 입력해주세요");
        }
        */

        try {
            et.checkEnoughMoney(100, 200);
            et.checkEnoughMoney(200, -200);
            et.checkEnoughMoney(10, 200);
        } catch (PriceNegativeException e) {
            System.out.println("제품의 가격이 음수일 수 없습니다.");
        } catch (MoneyNegativeException e) {
            System.out.println("가진 돈이 음수 입니다.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("제품의 가격이 가진돈보다 비싸네요");
        } catch (Exception e) {
            e.printStackTrace(); // Exception 최상위 타입으로 아래의 예외를 모두 처리할수 있다, 즉 가장 상위에 작성하면 아랫단의 예외를 검사하지 않음
        }

        System.out.println("쇼핑 종료");
    }
}
