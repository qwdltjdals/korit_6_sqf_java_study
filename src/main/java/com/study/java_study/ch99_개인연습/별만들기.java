package com.study.java_study.ch99_개인연습;

public class 별만들기 {
    public static void main(String[] args) {

        int num = 5;

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("////////////////////////");
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < (num - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("////////////////////////");
        for(int i  = 0; i < num; i++) {
            for(int j = 0; j < (num - i); j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < (i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("////////////////////////");
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < (num - i); j++) {
                System.out.print("*");
            }
            for(int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("////////////////////////");
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < (num - i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("////////////////////////");
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < (num - i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("////////////////////////");
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < (4 - i); j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 1 + (i * 2); j++) {
                System.out.print("*"); // " " for 문과 "*" for 문은 서로 다른 {} 를 두고 있기 때문에, 중복 사용이 가능
            }
            System.out.println();
        }
    }
}
