package com.study.java_study.ch16_제네릭;

public class SenderMain {

    public static void main(String[] args) {

        // 제네릭 사용할 때에는 아래의 자료형 들을 사용
        // [ wrapper 자료형 ]
        // Integer                         int
        // Boolean                         boolean
        // Character    --(언박싱)-->       char
        // Double        <--(박싱)--        double
        // Long                            long
        // Float                           float

        Integer num = new Integer(10); //박싱 - new : 메모리를 할당
        int num2 = num.intValue(); //언박싱

        Integer num3 = 20; // 자동 박싱
        int num4 = num3; // 자동 언박싱

        Sender sender = new Sender<>(10, 20, 30);
        Sender<Integer, String, Double> sender1 = new Sender<>(10, "20", 3.14);
        System.out.println(sender);
        System.out.println(sender1);

    }
}
