package com.study.java_study.ch10_추상화;

public class Tiger extends  Animal{

    private int power;

    public Tiger() {
        //        super(); = 생략되어있음
        System.out.println("호랑이 객체 생성");
    }

    public Tiger(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    // 재정의 -> 상속관계에서만 가능
    @Override // @ 어노테이션 = 특별한 기능은 없음(재정의 한것 주석)
    public void move() {
        System.out.println("호랑이가 네발로 뛰어갑니다.");
        super.move();
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }
}
