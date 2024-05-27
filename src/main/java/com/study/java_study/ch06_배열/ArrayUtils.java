package com.study.java_study.ch06_배열;

public class ArrayUtils {

    int findIndexByName(String[] names, String name) { // 매개변수, 찾고자 하는 이름
        for(int i = 0; i < names.length; i++) { //배열의 크기만큼 반복돌림
            if(names[i].equals(name)) {
                return i; // 같은 이름을 찾으면 i를 리턴
            }
        }
        return -1;
    }
}
