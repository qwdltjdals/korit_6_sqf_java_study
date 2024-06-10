package com.study.java_study.ch19_익명클래스;

public class KeyMain {
    public static void main(String[] args) {

        Key attackKay = new AttackKay();
        attackKay.onKeyUp();
        attackKay.onKeyDown();

        Key customKay = new Key() {
            @Override
            public void onKeyUp() {
                System.out.println("커스텀키 땜");
            }

            @Override
            public void onKeyDown() {
                System.out.println("커스텀키 누름");
            }
        }; // 인터페이스를 가져와서 생성까지 하겠다

        customKay.onKeyUp();
        customKay.onKeyDown();

    }
}
