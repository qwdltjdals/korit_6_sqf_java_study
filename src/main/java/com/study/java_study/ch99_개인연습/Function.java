package com.study.java_study.ch99_개인연습;

public class Function {

    void function01(Student student) {
        System.out.println("학생 호출");
        System.out.println("이름 : " + student.name);
        System.out.println("학년 : " + student.grade);
        System.out.println("학교 : " + student.school);
        System.out.println();
    }

    void function02(int grade, String name, String school) {
        System.out.println("학생 호출");
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
        System.out.println("학교 : " + school);
        System.out.println();
    }
}
