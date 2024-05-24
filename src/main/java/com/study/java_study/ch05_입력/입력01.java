package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // scanner.next(); // String을 return 하게 만드는 함수
        // Scanner.nextInt(); //int를 return 하게 만드는 함수
        String a = scanner.next();
        System.out.println("에이 : " + a);
        /*
        next() 메소드 특징
        1. 공백과 줄바꿈(엔터)은 무시한다.
        2. 버퍼를 사용한다. - 키보드의 입력은 모두 버퍼에 저장됨
        next는 맨 뒤에 엔터를 가져오지 않고 다음으로 넘겨지기 때문에, 엔터를 하고 실행을 하면 프로그램에서는 다음 라인에 공백이 들어가고 프로그램이 종료됨
         */
        System.out.print("b : ");
        String b = scanner.nextLine();
        System.out.println("비 : " + b);
    }
}
