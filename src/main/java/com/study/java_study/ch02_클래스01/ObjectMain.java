package com.study.java_study.ch02_클래스01;

public class ObjectMain {
    public static void main(String[] args) {
        //
        int a = 10; //a에는 10이라는 값이 아니라 주소? = 변수 : 주소
        ObjectA objectA1 = new ObjectA(); //클래스명, 변수명(소문자로 시작) / new = 새로 만들겠다. //100번 주소
        ObjectA objectA2 = new ObjectA(); //200번 주소
        System.out.println(a);
        System.out.println(objectA1); //줄 바꿈 : art + shift + 위아래 방향키
        System.out.println(objectA2); //ctrl + d : 커서에 있는것 하나 더 복사

        objectA1.num = 20;
        objectA2.num = 30;

        System.out.println(objectA1.num);
        System.out.println(objectA2.num);
        System.out.println(objectA1.name);

    }
}
