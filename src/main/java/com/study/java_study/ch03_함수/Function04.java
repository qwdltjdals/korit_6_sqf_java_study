package com.study.java_study.ch03_함수;

public class Function04 {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    //오버로딩 = 같은 이름의 매개변수를 다르게.? : 같은 이름의 매개변수를 여려개 생셩 가능
    //동일한 함수를 호출 할 때, 매개변수의 어떤 자료형or갯수 를 가진 변수를 호출할 지
    void add(int a, String b) {
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }
    void add(String b, int a) {
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }
}
