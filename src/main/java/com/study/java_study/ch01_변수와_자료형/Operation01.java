package com.study.java_study.ch01_변수와_자료형;

public class Operation01 {
    public static void main(String[] args) {
        // 연산자

        // 산술연산자
        int num1 = 10 + 20;
        int num2 = 9 / 2;
        System.out.println(num2);
        int num3 = 9 % 2;
        System.out.println(num3);
        // int num4 = ? % 2;  - 2의 배수인지 확인
        boolean num4 = 5 % 2 == 0;
        System.out.println(num4);

        System.out.println("/////////////");

        // 증감연산
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i); // 선증가
        System.out.println(i++); // 후증가
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);

        // 논리 연산자
        // true -> 1
        // false -> 0
        // && -> AND(곱)
        // ||  -> OR(합)
        // ! -> NOT(부정)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(!true && true); //false

        // 관계연산자
        System.out.println(3 > 2 && 1 == 1); // true
        System.out.println(1 != 1);

        // 조건연산자
        System.out.println(3 > 2 ? "참" : "거짓");
        System.out.println(3 > 2 ? 10 : 20);
        int x = 10;
        int y = 2;
        String result = x % y == 0 ? "y의 배수입니다." : "Y의 배수가 아닙니다."; // 결과값의 타입은 서로 동일해야함
        String result2 = "" + 10 / 2;

        // 복합대입연산자
        int number = 10;
        number += 5; // = number = number + 5;
        System.out.println(number);
        number -= 1;
        System.out.println(number);
        number *= 2;
        System.out.println(number);
        number /=2;
        System.out.println(number);
        number %=2;
        System.out.println(number);
        number +=20;
        System.out.println(number);

        // 연습
        String abc = number >10 ? "10 이상" : "10 이하";
        System.out.println(abc);
        int t = 5;
        System.out.println(t++);
        System.out.println(++t);
        int m = 15;
        String tm = m / t == 0 ? "m은 t의 배수" : "m은 t의 배수 가 아님";
        System.out.println(tm);

        int l = 100;
        System.out.println(l); // 100
        l *= 10;
        System.out.println(l); // 1000
        l += l;
        System.out.println(l); // 2000
        l /= 50;
        System.out.println(l); // 40
        String r = l == 0 ? "참" : "거짓";
        System.out.println(r);
        l -= l;
        System.out.println(l); // 0
        String rl = l == 0 ? "참" : "거짓";
        System.out.println(rl);

        System.out.println(1 >= 0 && 3 <= 5 ? "참" : "거짓");
        System.out.println(1 >= 0 && 3 <= 5);
        boolean ab;
        ab = l >= number;
        System.out.println(ab);
        double p = 9.0/2;
        System.out.println(p);
        int q = 9/2;
        System.out.println(q);
        System.out.println((double)q);

    }
}
