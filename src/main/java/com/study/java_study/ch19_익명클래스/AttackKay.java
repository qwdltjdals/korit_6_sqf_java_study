package com.study.java_study.ch19_익명클래스;

public class AttackKay implements Key{

    // 오버라이드 : ctrl + i
    @Override
    public void onKeyUp() {
        System.out.println("공격키 땜");
    }

    @Override
    public void onKeyDown() {
        System.out.println("공격키 누름");
    }
}
