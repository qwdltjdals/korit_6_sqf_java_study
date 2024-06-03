package com.study.java_study.ch15_Static;

public class StudentRepository {
    private String[] names;

    private static StudentRepository instance; // 자기자신의 객체를 담을 수 있는 인스턴스 변수가 존재

    private StudentRepository() {
        names = new String[5];
    } // 외부에서 생성되지 않도록 private로 막기

    public static StudentRepository getInstance() { // getInstance : 스테틱 매소드 생성
        if(instance == null) {
            instance = new StudentRepository(); // 자기자신의 변수를 생성해서 다시 자기자신한테 넣어주기
        }
        return instance;
    }

    public void add(String name) {
        for(int i = 0; i < names.length; i++) {
            if(names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() {
        return names;
    }
}









