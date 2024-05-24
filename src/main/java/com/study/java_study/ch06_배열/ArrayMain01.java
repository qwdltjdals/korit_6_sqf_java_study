package com.study.java_study.ch06_배열;

public class ArrayMain01 {

    public static void main(String[] args) {
        int[] nums = new int[100];

        for(int i = 0; i < 100; i++) {
            nums[i] = (i + 1) * 10;
        }
        for(int num : nums) { //향상된 for문 / 포이치? : int num선언 -> 0번 index 부터 차례로 대입후 실행(인덱스를 가지고 실행이 안됨 : 처음부터 끝까지 반복만 가능)
            System.out.println(num);
        }

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                continue;
            }
            int num = nums[i];
            System.out.println(num);
        }
    }
}
