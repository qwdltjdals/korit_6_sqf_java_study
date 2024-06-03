package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        // 제네릭 와일드 카드 : 기호 -> ?

        Message<?> m1; // 어떤 변수든 될 수 있다 = Object
        Message<String> m2 = null;

        m1 = new Message<>("10");
        String s = (String) m1.getMessage(); // 와일드카드의 단점 : 다운캐스팅을 해줘야 한다.
        m1.getMessage();

        //와일드 카드 제약
        Message<? extends String> m3 = new Message<>("10"); // String class를 상속받거나, String class인 경우에만 와일드카드를 불러올 수 있음 = 하행
        // Message<? extends String> m3 = new Message<>(10); = 안됨
        Message<? super String> m4 = new Message<>(new Object()); // 상행 : 위로는 다 뒴

        String s2 = m3.getMessage();
    }
}
