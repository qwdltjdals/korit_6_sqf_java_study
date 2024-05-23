package com.study.java_study.ch99_개인연습;

public class PeolpeMain {
    public static void main(String[] args) {
//      (스택 메모리  )  (힙 메모리(new가 나오고 부터))
        People people = new People();
        people.name = "김준일";
        people.age = 20;

        People people1 = new People();
        people1.name = "김준이";
        people1.age = 21;

        people.peopleInfo();
        people1.peopleInfo();
    }
}
