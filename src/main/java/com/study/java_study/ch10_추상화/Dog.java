package com.study.java_study.ch10_추상화;

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
    public String toString() { // toString을 통해 원하는 정보만 불러올 수 있다?
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
