package com.study.java_study.ch06_배열;

public class BookArrayUtils {

    int findNameByName(String[] books, String name) {
        for(int i = 0; i < books.length; i++) {
            if(books[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}

