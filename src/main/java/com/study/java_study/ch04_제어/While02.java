package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("개수 : ");
        int count = scanner.nextInt();

//        int i = 0;
//        while(i < count) {
//            if(i % 2 == 0) {
//                System.out.println("짝수입니다.");
//                i++;
//                continue; //지금 실행한 것만 실행하고 다음 반복으로 계속해라
//            }
//            System.out.println("홀수입니다.");
//            i++;
//        } //횟수의 증가는 for문으로 작성하는 것이 좋다.

        for(int j = 0; j < count; j++) {
            if(j % 2 == 0) {
                System.out.println("짝수입니다");
                continue; // for 문은 continue를 걸게 되면 자동으로 ++가 됨 -> (처음 쓸 때 j++)
            }
            System.out.println("홀수입니다.");
        }
    }
}
