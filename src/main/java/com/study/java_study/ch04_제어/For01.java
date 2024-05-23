package com.study.java_study.ch04_제어;

public class For01 {

    public static void main(String[] args) {
        //for : 순서가 있는 반복 = 줄넘기 백회 실행
        //while : 조건이 있는 반복 = 내가 올때까지 줄넘기 실행
        for(int i = 0; i < 10000; i++) {
            System.out.println(i + 1); //for 문의 ++ 는 sout이 실행된 후에 적용 / 초기화(i = 0)는 한번만 실행
        }
        for(int i = 0; i < 10000; i++) {
            System.out.println(10000 - i); //for 문의 ++ 는 sout이 실행된 후에 적용 / 초기화(i = 0)는 한번만 실행
        }

    }
}
