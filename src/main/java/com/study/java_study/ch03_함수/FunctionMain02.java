package com.study.java_study.ch03_함수;

public class FunctionMain02 {
    public static void main(String[] args) {

        Function02 fx = new Function02(); // new = 객체 생성 / 실행되면 인스턴스

        fx.fx01(); //호출
        fx.fx02(10, 20);
        System.out.println(fx.빙수만들기("딸기", 10)+ " 주문 완료");
        String 빙수 = fx.빙수만들기("초코", 5);
        System.out.println(빙수);
    }

}
