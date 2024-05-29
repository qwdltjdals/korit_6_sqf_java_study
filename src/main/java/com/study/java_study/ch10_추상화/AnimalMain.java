package com.study.java_study.ch10_추상화;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("콩", 11, "말티즈"); // toString을 통해 원하는 정보만 불러올 수 있다?
        Animal tiger = new Tiger("타이거", 10, 10000); // 업캐스팅

        System.out.println(dog.toString());
        System.out.println(tiger.toString());

        dog.move();
        tiger.move(); // 업캐스팅을 해도 재정의 한 것이 실행된다.
    }
}
 // 업캐스팅 : 묵시적 형변환 가능
/*
형변환 : 자료를 배열로 묶기 위해서 함
업캐스팅 한 적이 있어야만 다시 다운캐스팅이 가능
Tiger t = new Tiger();
Animal a2 = new Tiger(); = tiger의 power가 비활성화(사라지는 것이 아님)
Tiger t2 = (Tiger)a2 = 비활성화 되어있던 tiger의 power가 다시 활성화

animal a = new Animal(); = a = 애초부터 tiger보다 작은 메모리(animal)를 할당받음
Tiger t = (tiger)a; = 불가능

Animal a = new dog();
Tiger t = (tiger)a; = 불가능
 */