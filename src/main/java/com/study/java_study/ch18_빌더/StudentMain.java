package com.study.java_study.ch18_빌더;

public class StudentMain {
    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(1)
                .age(17)
                .name("이성민")
                .build();

        Student student1 = Student.builder()
                .studentCode(2)
                .name("aaa")
                .age(17)
                .build();

        System.out.println(student);
        System.out.println(student1);
    }
}
