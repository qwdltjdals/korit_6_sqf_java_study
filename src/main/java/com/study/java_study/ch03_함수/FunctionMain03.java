package com.study.java_study.ch03_함수;

public class FunctionMain03 {
    public static void main(String[] args) {
        Function03 fx = new Function03();
        fx.fx01(1234, "이성민", 27, "010811111111"); //휴대폰번호 : String(0이 맨앞에 가면 안됨

        Student a = new Student();
        a.studentCode = 1111;
        a.name = "이성민";
        a.age = 27;
        a.phone = "01012345678";
        fx.fx02(a);
    }
}
