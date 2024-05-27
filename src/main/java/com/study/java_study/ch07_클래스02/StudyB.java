package com.study.java_study.ch07_클래스02;

public class StudyB {

    private String name; // private 는 자기 class 안에서 접근 가능 : 외부에서는 접근이 불가능
    private int age;
    public StudyB() {} //원래 오버라이딩을 하게 되면(아래것) 위에것이 삭제되는데, 사용하고 싶으면 이거 추가

    public StudyB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name);
        System.out.println(age);
    }
}
