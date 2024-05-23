package com.study.java_study.ch99_개인연습;

public class 별만들기 {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("////////////////////////");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (5-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("////////////////////////");
        for(int i  = 0; i < 5; i++) {
            for(int j = 0; j < (5 - i); j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < (i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("////////////////////////");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }
            for(int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("////////////////////////");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < (5 - i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("////////////////////////");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < (5 - i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("////////////////////////");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (4 - i); j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 1 + (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
