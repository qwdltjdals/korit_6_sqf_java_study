package com.study.java_study.ch06_배열;

public class ArrayMain03 {

    public static void main(String[] args) {
        int[] nums = new int[] {10, 20, 30, 40, 50, 60};        // nums = 배열의 이름

        int num1 = 10;      //비어있는 공간에 주소가 할당됨
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;
        int num6 = 60;

        nums[0] = 10;       //순서대로 주소가 할당됨 = 반복을 사용 가능
        nums[1] = 20;       //관련된 데이터를 하나로 묶기 가능
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;
        nums[5] = 60;

        String[] strArray = new String[5];
        strArray[0] = "가";
        strArray[1] = "나";
        strArray[2] = "다";
        strArray[3] = "라";
        strArray[4] = "마";

        for(int num : nums) {       // nums라는 배열에 10 ~ 60까지 들어있음 : 첫번째꺼 ~ 마지막꺼 꺼내서 num에 넣음
            System.out.println(num);
        }
        for(String str : strArray) {
            System.out.println(str);
        }

        double[] doubles = new double[3];
        doubles[0] = 10.5;
        doubles[1] = 11.5;
        doubles[2] = 12.5;

        for(double dNum : doubles) {
            System.out.println(dNum);
        }

        Computer[] computers = new Computer[3]; //컴퓨터를 세개 담을 수 있는 배열
        computers[0] = new Computer("I3", "8GB");
        computers[1] = new Computer("I5", "4GB");
        computers[2] = new Computer("I7", "16GB");

        for(Computer com : computers) {
            System.out.println(com);
        }
    }
}
