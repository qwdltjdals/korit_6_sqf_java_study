package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String("");
        String name = "이성민"; // "" : 값의 자료형 String
        String phone = "01012345678"; // null : 값의 자료형 null

        System.out.println(name.length());
        System.out.println(text.length());
       //  System.out.println(phone.length());
        System.out.println(text);
        System.out.println(name);

        StringUtils stringUtils = new StringUtils();

        if(stringUtils.isEmpty(name)) { // == : 주소값 비교 / .equals : 값 비교
            System.out.println("name 이 비어있습니다.");
            return; // 리턴값이 없는 것 : void일때 사용 가능 / 중간에 끊어라? ->name 이 비어있는 것이 실행되면, 다음 함수를 실행하지 마라
        }
        if(stringUtils.isEmpty(phone)) {
            System.out.println("phone 이 비어있습니다.");
            return;
        }
        if(stringUtils.isEmpty(text)) {
            System.out.println("text 이 비어있습니다.");
            return;
        }
    }
}// 하나의 함수는 하나의 역할만 해야한다 : 단일책임 원칙
