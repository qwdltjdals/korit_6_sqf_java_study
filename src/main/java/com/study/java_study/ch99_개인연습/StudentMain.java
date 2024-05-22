package com.study.java_study.ch99_개인연습;

public class StudentMain {
    public static void main(String[] args) {
        Function fx = new Function();

        Student std = new Student();
        std.name = "이성민";
        std.grade = 3;
        std.school = "자바고등학교";
        fx.function01(std);

        fx.function02(3, "김민서", "자바고등학교");

        Student std1 = new Student();
        std1.school = "자바고등학교";
        std1.name = "김화수";
        std1.grade = 3;
        fx.function01(std1);
    }
}
