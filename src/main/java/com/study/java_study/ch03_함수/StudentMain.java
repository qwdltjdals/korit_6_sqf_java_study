package com.study.java_study.ch03_함수;

public class StudentMain {
    public static void main(String[] args) {
        Function03 fx = new Function03();
        Student std = new Student();
        std.studentCode = 1111;
        std.age = 27;
        std.name = "이성민";
        std.phone = "010-0000-0000";

        Student std1 = new Student();
        std1.studentCode = 1112;
        std1.age = 27;
        std1.name = "김태훈";
        std1.phone = "010-0000-0000";

        fx.fx02(std);
    }
}
