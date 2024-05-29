package com.study.java_study.ch10_추상화01;

public class Dog extends Animal{
    private String breed;

    public Dog() {
        //        super(); = 생략되어있음
        System.out.println("강아지 객체 생성");
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("강아지가 네발로 움직입니다.");
    } // 상속관계에서 오버라이드(재정의)를 하고 싶으면 ctrl + o를 누르면 바로 됨

    public void bark() {
        System.out.println(breed + "종의 강아지가 짖습니다.");
    }

    @Override
    public String toString() { // toString을 통해 원하는 정보만 불러올 수 있다?
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
