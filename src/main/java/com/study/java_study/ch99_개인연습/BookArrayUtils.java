package com.study.java_study.ch99_개인연습;

public class BookArrayUtils {
    int findBookName(String[] books, String name) {
        for(int i = 0; i < books.length; i++) {
            if(books[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}

