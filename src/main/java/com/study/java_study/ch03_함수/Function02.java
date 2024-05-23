package com.study.java_study.ch03_함수;

public class Function02 { // 클래스 : 틀(사용설명서)

    // 매개변수 x, 리턴 x
    void fx01() {
        System.out.println("fx01 함수 호출");
    }
    //매개변수 o, 리턴 x
    void fx02(int num1, int num2) {
        System.out.println("fx02 함수 호출");
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }

    //매개변수 o, 리턴 o
    String 빙수만들기(String 재료, int count) {
        return 재료 + "빙수 : " + count + "개"; //자료형이 String 이니까 문자열로 리턴해줌
        //return값의 반환 지점 : 호출한 곳(메인함수)
    }

    //매개변수 x, 리턴 o
    String getData() {
        return "데이터";
    }
}
/* 클래스(틀)
객체(찍어 낼 수 있는거)
인스턴스(찍어낸거?)
클래스 안에 있는 것 : 매소드 / 클래스 밖에 있는 것 : 함수
스택 메모리 : 정적 메모리 영역 / 힙 : 동적 메모리 영역
new가 들어가면 동적 메모리 영역임

 */