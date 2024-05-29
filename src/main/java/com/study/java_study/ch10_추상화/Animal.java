package com.study.java_study.ch10_추상화;

public class Animal { // 추상클래스 : 같은 것들(공통사항)을 묶어준다

    private String name;
    private int age;

    public Animal() {
        System.out.println("동물 객체 생성");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
